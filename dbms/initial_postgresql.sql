-- ###########################
-- User:together pwd: together

CREATE ROLE together LOGIN
  ENCRYPTED PASSWORD 'md582721599778493074c7de7e2bb735332'
  NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;

CREATE DATABASE "together"
  WITH OWNER = together
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.utf8'
       LC_CTYPE = 'en_US.utf8'
       CONNECTION LIMIT = -1;

CREATE DATABASE "together-test"
  WITH OWNER = together
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.utf8'
       LC_CTYPE = 'en_US.utf8'
       CONNECTION LIMIT = -1;
