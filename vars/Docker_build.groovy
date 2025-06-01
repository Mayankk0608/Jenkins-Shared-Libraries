def call(String ProjectName, String ImageTag, Staring DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName} ${ImageTag} ."
}
