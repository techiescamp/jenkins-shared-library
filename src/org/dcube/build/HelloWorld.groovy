package org.dcube.build.HelloWorld
import org.dcube.IStepExecutor
import org.dcube.ioc.ContextRegistry

class HelloWorld implements Serializable {
    private String _solutionPath

    HelloWorld(String solutionPath) {
        _solutionPath = solutionPath
    }

    void build() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        int returnStatus = steps.sh("echo \"building ${this._solutionPath}...\"")
        if (returnStatus != 0) {
            steps.error("Unable To Execute The Command")
        }
    }
}
