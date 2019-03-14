package com.linkdev.samplekotlinapp.common.models

class Status<T>(val statusCodes: StatusCodes, val data: T? = null, val message: String? = null) {
    companion object {

        fun <T> success(): Status<T> {
            return Status<T>(StatusCodes.SUCCESS)
        }

        fun <T> offline(data: T): Status<T> {
            return Status(StatusCodes.OFFLINE_MODE, data)
        }

        fun <T> success(data: T): Status<T> {
            return Status(StatusCodes.SUCCESS, data)
        }

        fun <T> notAuthorized(data: T): Status<T> {
            return Status(StatusCodes.NOT_AUTHORIZED, data)
        }

        fun <T> success(data: T, msg: String): Status<T> {
            return Status(StatusCodes.SUCCESS, data, msg)
        }

        fun <T> error(): Status<T> {
            return Status<T>(StatusCodes.ERROR)
        }

        fun <T> error(msg: String): Status<T> {
            return Status<T>(StatusCodes.ERROR, null, msg)
        }


        fun <T> exception(): Status<T> {
            return Status<T>(StatusCodes.EXCEPTION)
        }

        fun <T> notAuthorized(): Status<T> {
            return Status<T>(StatusCodes.NOT_AUTHORIZED)
        }

        fun <T> loading(): Status<T> {
            return Status<T>(StatusCodes.LOADING)
        }

        fun <T> noData(): Status<T> {
            return Status<T>(StatusCodes.NO_DATA)
        }

        fun <T> noNetwork(): Status<T> {
            return Status<T>(StatusCodes.NO_NETWORK)
        }

        fun <T> conflict(): Status<T> {
            return Status<T>(StatusCodes.CONFLICT)
        }

        fun <T> noDataOffline(): Status<T> {
            return Status<T>(StatusCodes.NO_DATA_OFFLINE)
        }
    }
}
