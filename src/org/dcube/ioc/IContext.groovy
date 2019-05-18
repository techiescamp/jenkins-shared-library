package org.dcube.ioc

import org.dcube.IStepExecutor

interface IContext {
    IStepExecutor getStepExecutor()
}