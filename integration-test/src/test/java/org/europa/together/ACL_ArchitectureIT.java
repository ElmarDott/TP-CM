package org.europa.together;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import javax.persistence.Entity;
import org.europa.together.utils.acl.Constraints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Architectural Test.
 */
@DisplayName("TP-ACL Architekture Test")
public class ACL_ArchitectureIT {

    private final String modul = Constraints.MODULE_NAME;
    private final String PKG_APPLICATION = "org.europa.together.application" + modul;
    private final String PKG_BUSINESS = "org.europa.together.business" + modul;
    private final String PKG_DOMAIN = "org.europa.together.domain" + modul;
    private final String PKG_EXCEPTION = "org.europa.together.exceptions" + modul;
    private final String PKG_ORCHESTRATION = "org.europa.together.orcestration" + modul;
    private final String PKG_SERVICE = "org.europa.together.service" + modul;
    private final String PKG_UTILS = "org.europa.together.utils" + modul;

    private final JavaClasses importedClasses
            = new ClassFileImporter().importPackages("org.europa.together");

    @Test
    void zeroLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_EXCEPTION).or().resideInAPackage(PKG_UTILS)
                .should().onlyBeAccessed().byAnyPackage(PKG_EXCEPTION, PKG_UTILS, PKG_DOMAIN, PKG_APPLICATION, PKG_BUSINESS, PKG_SERVICE, PKG_ORCHESTRATION)
                .check(importedClasses);
    }

    @Test
    void domainLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_DOMAIN)
                .should().onlyBeAccessed().byAnyPackage(PKG_BUSINESS, PKG_APPLICATION, PKG_SERVICE, PKG_ORCHESTRATION)
                .check(importedClasses);
        //Annotaion
        classes().that()
                .resideInAPackage(PKG_DOMAIN).and().haveSimpleNameEndingWith("DO")
                .should().beMetaAnnotatedWith(Entity.class)
                .check(importedClasses);
        //Files types
        classes().that()
                .resideInAPackage(PKG_DOMAIN)
                .should().beEnums()
                .andShould().notBeInterfaces()
                .andShould().notBeInnerClasses()
                .andShould().notBeLocalClasses()
                .check(importedClasses);
    }

    @Test
    void businessLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_BUSINESS)
                .should().onlyBeAccessed().byAnyPackage(PKG_APPLICATION, PKG_SERVICE, PKG_ORCHESTRATION)
                .check(importedClasses);
        //Annotaion
        classes().that()
                .resideInAPackage(PKG_BUSINESS)
                .should().beMetaAnnotatedWith(Repository.class)
                .check(importedClasses);
        //Files types
        classes().that()
                .resideInAPackage(PKG_BUSINESS)
                .should().beInterfaces()
                .check(importedClasses);
    }

    @Test
    void applicationLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_APPLICATION)
                .should().onlyBeAccessed().byAnyPackage(PKG_SERVICE, PKG_ORCHESTRATION)
                .check(importedClasses);
        //Annotaion
        classes().that()
                .resideInAPackage(PKG_APPLICATION)
                .should().beMetaAnnotatedWith(Repository.class)
                .check(importedClasses);
        //Files types
        classes().that()
                .resideInAPackage(PKG_APPLICATION)
                .should().notBeInterfaces()
                .andShould().notBeEnums()
                .andShould().notBeInnerClasses()
                .andShould().notBeLocalClasses()
                .check(importedClasses);
    }

    @Test
    void serviceLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_SERVICE)
                .should().onlyBeAccessed().byAnyPackage(PKG_ORCHESTRATION)
                .check(importedClasses);
        //Annotaion
        classes().that()
                .resideInAPackage(PKG_DOMAIN).and().haveSimpleNameEndingWith("Service")
                .should().beMetaAnnotatedWith(Service.class)
                .check(importedClasses);
        //Files types
        classes().that()
                .resideInAPackage(PKG_DOMAIN)
                .should().haveSimpleNameEndingWith("Service");
    }

    @Test
    void orchestrationLayer() {
        //Access
        classes().that()
                .resideInAPackage(PKG_ORCHESTRATION)
                .should().onlyBeAccessed().byAnyPackage(PKG_ORCHESTRATION)
                .check(importedClasses);

    }
}
