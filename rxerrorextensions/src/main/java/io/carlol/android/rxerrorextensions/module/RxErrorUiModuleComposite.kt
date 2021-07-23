package io.carlol.android.rxerrorextensions.module

import io.carlol.android.rxerrorextensions.module.interfaces.IRxErrorUiModule

/**
 * Created on 30/07/2020.
 */
open class RxErrorUiModuleComposite(
    private vararg val bundles: RxErrorUiBundle
) : IRxErrorUiModule {

    override fun showError(throwable: Throwable) {
        bundles
            .firstOrNull { it.interceptor?.isErrorManaged(throwable) != false }
            ?.module?.showError(throwable)
    }

}