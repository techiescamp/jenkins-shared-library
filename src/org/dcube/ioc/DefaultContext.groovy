package org.dcube.ioc

import org.dcube.IStepExecutor
import org.dcube.StepExecutor

class DefaultContext implements IContext, Serializable {
    private _steps

    DefaultContext(steps) {
        this._steps = steps
    }

    @Override
    IStepExecutor getStepExecutor() {
        return new StepExecutor(this._steps)
    }
}