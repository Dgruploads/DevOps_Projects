***************** DOCKERIZING SPRINGBOOT APPLICATION *****************

Hello and welcome to this guide on dockerizing sprinboot application. In this guide we will be,

1. creating a sample springboot application.
2. Run the application with maven to validate if the application is working.
3. Create a custom docker image for the application.
4. Run the docker image to create a springboot application container.
5. Validate if the application is running on the container.

Before we begin with the above steps, we will be running this application on AWS EC2 instance. So, we will need an EC2 instance running and t2.micro should be sufficient for this guide.

Below are the commands and instructions that you can follow to run this application on EC2 instance.

* Head over to https://start.spring.io./ , create a sample application and generate the application which should download the zip file to your local machine. (The same sample application code is available in this repo)
* Unzip the contents of the zip file and copy them over to the EC2 instance using the below command.
  * scp -i <PEM_FILE> <SOURCE_PATH> <USERNAME>@<PUBLIC_IP_ADDRESS>:<DESTINATION_PATH_IN_THE_SERVER>
  * scp -i demo_key.pem -r ./springboot ubuntu@43.12.56.78:/home/ubuntu/springboot
* Install the pre-requisites packages on the EC2 instance using the below commands
  * sudo apt update -y                    ===========> Update the machine
  * sudo apt install openjdk-17-jdk -y    ===========> Install java version 17
  * sudo java -version                    ===========> Validate the installed java version
  * sudo apt install maven -y             ===========> Install maven
  * sudo mvn --version                    ===========> Validate the installed maven version
  * sudo apt install docker.io -y         ===========> Install docker
  * sudo docker --version                 ===========> Validate the installed docker version
  * sudo service docker status            ===========> Check the docker running status (It should be in the running status)
* Once you have the pre-requisites, go inside the app directory and run the below command
  * <img width="851" alt="image" src="https://github.com/Dgruploads/DevOps_Projects/assets/41875211/7ecc657a-197c-4354-9c11-eaa93bb9b857">

* 
