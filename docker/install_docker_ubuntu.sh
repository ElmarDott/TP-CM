#add repository
$ sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

$ sudo apt-get update
$ sudo apt-get upgrade

$ sudo apt-get install docker.io

#verify installation
$ sudo docker info

#run docker without super user
$ sudo groupadd docker
$ sudo gpasswd -a <UserName> docker

#RESTART
