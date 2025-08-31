
void call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:'Dockerhubcred' ,passwordVariable:'dockerHubPass' ,usernameVariable:'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
  }
}
