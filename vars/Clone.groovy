def call(String repositoryUrl, String branch = 'main') {
    git branch: branch, url: repositoryUrl
}
