def call(String repositoryUrl = 'https://github.com/opstree/spring3hibernate.git', branch = 'java7') {
    git branch: "${branch}", url: "${repositoryUrl}" }
