package com.example.android.rxerrorextensions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Usage example
     */

//    fun <T> Single<T>.manageErrorDialog(
//        activity: FragmentActivity,
//        interceptor: IErrorInterceptor? = null,
//        requestKey: String? = null,
//        isFromFragment: Boolean = true
//    ): Single<T> {
//        return manageErrorDialog(
//            ExampleDefaultErrorUiModule(activity, requestKey, isFromFragment), interceptor = interceptor
//        )
//    }
//
//    fun <T> Maybe<T>.manageErrorDialog(
//        activity: FragmentActivity,
//        interceptor: IErrorInterceptor? = null,
//        requestKey: String? = null,
//        isFromFragment: Boolean = true
//    ): Maybe<T> {
//        return manageErrorDialog(
//            ExampleDefaultErrorUiModule(activity, requestKey, isFromFragment), interceptor = interceptor
//        )
//    }
//
//    fun Completable.manageErrorDialog(
//        activity: FragmentActivity,
//        interceptor: IErrorInterceptor? = null,
//        requestKey: String? = null,
//        isFromFragment: Boolean = true
//    ): Completable {
//        return manageErrorDialog(
//            ExampleDefaultErrorUiModule(activity, requestKey, isFromFragment), interceptor = interceptor
//        )
//    }
//
//    fun <T> Observable<T>.manageErrorDialog(
//        activity: FragmentActivity,
//        interceptor: IErrorInterceptor? = null,
//        requestKey: String? = null,
//        isFromFragment: Boolean = true
//    ): Observable<T> {
//        return manageErrorDialog(
//            ExampleDefaultErrorUiModule(activity, requestKey, isFromFragment), interceptor = interceptor
//        )
//    }
//
//    fun createDefaultErrorUiBundle(activity: FragmentActivity) = ExampleDefaultErrorUiModule(activity).toBundle()


    // ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ----


//    class ExampleDefaultErrorUiModule(
//        private val activity: FragmentActivity,
//        private val requestKey: String? = null,
//        private val isFromFragment: Boolean = true
//    ) : IRxErrorUiModule {
//
//        override fun showError(throwable: Throwable) {
//            when (throwable) {
//                is FirebaseNetworkException -> {
//                    PopupDialogFragment.newInstance(
//                        "Nessuna connessione!",
//                        "Il servizio non ?? disponibile senza un collegamento a Internet. Collegati ad una rete e riprova.",
//                        labelCtaAction = "RIPROVA PI?? TARDI",
//                        requestKey = requestKey,
//                        listenFromFragment = isFromFragment,
//                        resId = R.drawable.highlight_off_24_px
//                    ).show(activity.supportFragmentManager, PopupDialogFragment.TAG)
//                    return // EXIT
//
//                }
//                [...]
//                else -> PopupDialogFragment.newInstance(
//                    "Si ?? verificato un errore", "Qualcosa ?? andato storto, riprova pi?? tardi!",
//                    labelCtaAction = "OK HO CAPITO",
//                    requestKey = requestKey,
//                    listenFromFragment = isFromFragment,
//                    resId = R.drawable.highlight_off_24_px
//
//                ).show(activity.supportFragmentManager, PopupDialogFragment.TAG)
//            }
//
//        }
//
//    }

}