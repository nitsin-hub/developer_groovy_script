job("groovy-job"){
  description("This job is created automatically by groovy script")
  scm{
    github('nitsin-hub/Auto_testing_jenkins_pipeline','master')
  }
  triggers{
    scm("* * * * *")
  }
}
