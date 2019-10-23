pipelineJob('Hello world') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('zloyplohoy/jenkins_the_ephemeral', 'ssh')
                        credentials('github_deploy_key')
                    }
                }
            }
            lightweight()
            scriptPath('jobs/hello_world/pipeline.groovy')
        }
    }
}
