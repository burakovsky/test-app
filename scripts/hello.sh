#!/bin/bash

echo "##########################################"
echo "Installing Java..."
echo "##########################################"
sudo apt-get update
sudo apt-get install openjdk-8-jdk -y
echo "##########################################"
echo "Installing Tomcat..."
echo "##########################################"
sudo mkdir -p /opt/tomcat
sudo chown -R ubuntu:ubuntu /opt/tomcat
wget http://ftp.byfly.by/pub/apache.org/tomcat/tomcat-8/v8.5.37/bin/apache-tomcat-8.5.37.tar.gz -O /tmp/tomcat.tar.gz
tar xvzf /tmp/tomcat.tar.gz -C /opt/tomcat && mv /opt/tomcat/*/* /opt/tomcat
sh /opt/tomcat/bin/startup.sh
echo "##########################################"
echo "Installing Dynatrace OneAgent..."
echo "##########################################"

