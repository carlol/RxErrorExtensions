package io.carlol.android.rxerrorextensions.conditions

/**
 * Created on 2019-05-13.
 */
interface IErrorInterceptor {

    fun isErrorManaged(error: Throwable): Boolean

}