pipelineJob('Hello world') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            github('AlexDexsoon/jenkins_the_ephemeral', 'https')
          }
          branch('master')
        }
      }
      lightweight()
      scriptPath('jobs/hello_world/pipeline.groovy')
    }
  }
}
