package com.linkdev.samplekotlinapp.data.repository

import com.linkdev.samplekotlinapp.base.BaseRepository
import com.linkdev.samplekotlinapp.data.remote.RemoteDataSource


class NewsRepository constructor(private val remoteDataSource: RemoteDataSource) : BaseRepository(), INewsRepository {


   // private val TAG: String = "NewsRepository"
    override fun getNewsFromApi() {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
//
//    override fun getNewsFromApi() {
//
//        remoteDataSource.getUsersFromApi()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({ result ->
//
//                    Completable
//                            .fromAction {
//                                // saveUsers(Transformation.toUsersEtities(result.body()!!))
//                            }
//                            .subscribeOn(Schedulers.io())
//                            .observeOn(AndroidSchedulers.mainThread())
//                            .subscribe(object : CompletableSubscriber {
//                                override fun onSubscribe(@NonNull subscription: Subscription) {
//
//                                }
//
//                                override fun onCompleted() {
//                                    Log.i(TAG, "DataSource has been Populated")
//                                }
//
//                                override fun onError(@NonNull e: Throwable) {
//                                    e.printStackTrace()
//                                    Log.e(TAG, "DataSource hasn't been Populated")
//                                }
//                            })
//
//                },
//                        { error -> Log.e(TAG, "{$error.message}") },
//                        { Log.d(TAG, "completed") })
//
//    }
}