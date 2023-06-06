package com.A1_215IC.inzynieriaprojekt

/**
 * this singleton is used for logging into the app's account system
 */

object LoginAuthenticator {

    fun login(user:String, password:String) {
        val base = accessDatabase()
        attemptLoginToDatabase(user,password,base)
    }

    fun attemptLoginToDatabase(user:String, password:String, database: AccountDatabaseInterface) {
        userMode.isPremium = database.isInBase(user, password)
    }

}

/**
 * the rest of this app checks weather this Singleton holds a true value
 * whenever it needs to know if the user is currently premium
 */
object userMode {
    var isPremium = false;
}