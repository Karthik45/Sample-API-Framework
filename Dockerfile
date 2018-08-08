FROM gradle
USER root
COPY . /home/gradle
WORKDIR /home/gradle
