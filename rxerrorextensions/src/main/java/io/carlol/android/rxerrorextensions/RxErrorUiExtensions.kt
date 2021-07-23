package io.carlol.android.rxerrorextensions

import io.carlol.android.rxerrorextensions.conditions.IErrorInterceptor
import io.carlol.android.rxerrorextensions.module.RxErrorUiBundle
import io.carlol.android.rxerrorextensions.module.RxErrorUiModuleComposite
import io.carlol.android.rxerrorextensions.module.interfaces.IRxErrorUiModule
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Utility methods to use Module and Bundle behavior
 */

fun Completable.manageErrorDialog(module: IRxErrorUiModule, interceptor: IErrorInterceptor? = null): Completable {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(module.toBundle(interceptor)).showError(error)
        Completable.error(error) // propagate error
    }
}

fun <T> Single<T>.manageErrorDialog(module: IRxErrorUiModule, interceptor: IErrorInterceptor? = null): Single<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(module.toBundle(interceptor)).showError(error)
        Single.error(error) // propagate error
    }
}


fun <T> Maybe<T>.manageErrorDialog(module: IRxErrorUiModule, interceptor: IErrorInterceptor? = null): Maybe<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(module.toBundle(interceptor)).showError(error)
        Maybe.error(error) // propagate error
    }
}

fun <T> Observable<T>.manageErrorDialog(module: IRxErrorUiModule, interceptor: IErrorInterceptor? = null): Observable<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(module.toBundle(interceptor)).showError(error)
        Observable.error(error) // propagate error
    }
}


fun Completable.manageErrorDialog(vararg bundles: RxErrorUiBundle): Completable {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(*bundles).showError(error)
        Completable.error(error) // propagate error
    }
}

fun <T> Single<T>.manageErrorDialog(vararg bundles: RxErrorUiBundle): Single<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(*bundles).showError(error)
        Single.error(error) // propagate error
    }
}


fun <T> Maybe<T>.manageErrorDialog(vararg bundles: RxErrorUiBundle): Maybe<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(*bundles).showError(error)
        Maybe.error(error) // propagate error
    }
}


fun <T> Observable<T>.manageErrorDialog(vararg bundles: RxErrorUiBundle): Observable<T> {

    return onErrorResumeNext { error: Throwable ->
        RxErrorUiModuleComposite(*bundles).showError(error)
        Observable.error(error) // propagate error
    }
}


