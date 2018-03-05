FROM jenkins/jenkins:lts

RUN /usr/local/bin/install-plugins.sh ec2 amazon-ecs amazon-ecr s3 terraform rake git jenkinswalldisplay build-pipeline workflow-aggregator docker-workflow credentials-binding gradle junit docker-build-publish

ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# Skip initial setup
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY default-user.groovy /usr/share/jenkins/ref/init.groovy.d/

VOLUME /var/jenkins_home

ENTRYPOINT ["/sbin/tini", "--", "/usr/local/bin/jenkins.sh"]
