package com.A1_215IC.inzynieriaprojekt

object LoginAuthenticator {

    fun attemptLogin(user:String, passwordHash:Int, database: AccountDatabase) {
        userMode.isPremium = checkLogin(user,passwordHash, database)
    }

    private fun checkLogin(user:String, passwordHash:Int, database: AccountDatabase):Boolean {
        return true
    }

}

object userMode {
    var isPremium = false;
}