def call(Map stageParams = [:]) {

    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/${stageParams.version}']],
        userRemoteConfigs: [[url: stageParams.url]]
    ])
  }
