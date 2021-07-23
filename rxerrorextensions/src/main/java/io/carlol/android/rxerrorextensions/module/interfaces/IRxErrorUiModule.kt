package io.carlol.android.rxerrorextensions.module.interfaces

import io.carlol.android.rxerrorextensions.conditions.IErrorInterceptor
import io.carlol.android.rxerrorextensions.module.RxErrorUiBundle

/**
 * Created on 2019-10-02.
 */
interface IRxErrorUiModule {

    fun showError(throwable: Throwable)

    fun toBundle(interceptor: IErrorInterceptor? = null) = RxErrorUiBundle(this, interceptor)

}