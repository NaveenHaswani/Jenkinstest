def call(String repositoryUrl = https://github.com/NaveenHaswani/Jenkinstest.git, String branch = 'main') {
    git branch: branch, url: repositoryUrl
}
