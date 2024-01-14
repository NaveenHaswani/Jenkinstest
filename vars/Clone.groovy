def call(String repositoryUrl = 'https://github.com/NaveenHaswani/Jenkinstest.git', branch = 'Main') {
    git branch: branch, url: repositoryUrl }
