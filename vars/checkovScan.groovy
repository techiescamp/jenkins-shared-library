def call(String directory) {
    
    script {
                    def tplContent = libraryResource "checkov/.checkov.yaml"
                    writeFile file: "${WORKSPACE}/.checkov.yaml", text: tplContent
                }

    def checkovCommand = "checkov --directory ${directory}"

    def checkovOutput = sh(script: checkovCommand, returnStatus: true)

    echo "checkov Exit Code: ${checkovOutput}"

    if (checkovOutput != 0) {
        error "checkov failed with exit code ${checkovOutput}"
    }
}