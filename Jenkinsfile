    def COLOR_MAP = [
    'SUCCESS': 'good',
    'FAILURE':'danger'
    ]
pipeline {
    agent any

    tools {
        maven 'jenkinsmaven'
        jdk 'java11'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
    post {
            always {
                echo 'Slack Notification'
                slackSend channel: '#alertas',
                color: COLOR_MAP[currentBuild.currentResult],
                message: "*${currentBuild.currentResult} Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} More Info at ${env.BUILD_URL}"
            }
        }

}