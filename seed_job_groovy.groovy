job('Seed_job2_github') {
  scm {
    git ('https://github.com/nitsin-hub/developer_groovy_script.git')
  }
  steps {
    dsl {
      external('*.groovy')        
      removeAction('DELETE')
    }
  }
}
