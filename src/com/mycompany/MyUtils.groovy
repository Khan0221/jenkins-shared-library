// my-shared-library/src/com/mycompany/MyUtils.groovy

package com.mycompany

class MyUtils {

  static def checkoutGit(String repoUrl) {
    if (!repoUrl) {
      throw new IllegalArgumentException("repoUrl cannot be null or empty")
    }
    try {
      git branch: 'main', url: repoUrl
    } catch (Exception e) {
      throw new RuntimeException("Failed to checkout Git repository: $repoUrl", e)
    }
  }

  static def runMavenUnitTests() {
    try {
      sh 'mvn clean test'
    } catch (Exception e) {
      throw new RuntimeException("Failed to run Maven unit tests", e)
    }
  }

  static def runIntegrationTests() {
    try {
      sh 'mvn verify -DskipUnitTests'
    } catch (Exception e) {
      throw new RuntimeException("Failed to run integration tests", e)
    }
  }

  static def buildProject() {
    try {
      sh 'mvn clean install'
    } catch (Exception e) {
      throw new RuntimeException("Failed to build project", e)
    }
  }
  
}