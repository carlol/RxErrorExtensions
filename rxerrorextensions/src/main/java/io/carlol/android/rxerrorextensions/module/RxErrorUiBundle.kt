package io.carlol.android.rxerrorextensions.module

import io.carlol.android.rxerrorextensions.conditions.IErrorInterceptor
import io.carlol.android.rxerrorextensions.module.interfaces.IRxErrorUiModule

/**
 * Created on 30/07/2020.
 */
data class RxErrorUiBundle(val module: IRxErrorUiModule, val interceptor: IErrorInterceptor? = null)