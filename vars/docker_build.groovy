def call(String ProjectName, String ImageTag, String DockerubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${Imagetag} . "
}
