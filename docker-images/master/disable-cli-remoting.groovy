import jenkins.model.*

def jenkins = Jenkins.getInstance()
jenkins.model.Jenkins.instance.getDescriptor("jenkins.CLI").get().setEnabled(false)
jenkins.save()
