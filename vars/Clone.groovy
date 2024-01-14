def call(String repositoryUrl = 'https://github.com/NaveenHaswani/Jenkinstest.git', Branch = 'Main') {
    git branch: branch, url: repositoryUrl
