package com.A1_215IC.inzynieriaprojekt



class AccountDatabase(val list:ArrayList<Account>) {

}

class Account(val username:String, password: String) {
    val hashPass = password.hashCode();
}

