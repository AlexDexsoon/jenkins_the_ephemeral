ARG JENKINS_VERSION
FROM jenkins/jenkins:$JENKINS_VERSION
ARG PLUGIN_LIST
RUN jenkins-plugin-cli --plugins $PLUGIN_LIST
   
