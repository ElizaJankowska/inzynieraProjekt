package com.A1_215IC.inzynieriaprojekt


fun accessDatabase(): AccountDatabaseInterface {
    var acList:ArrayList<Account> = arrayListOf()
    acList.add(Account("Radek","logowanie123".hashCode()))
    acList.add(Account("Eliza","pobieranie456".hashCode()))
    acList.add(Account("Krzysiu","ekran789".hashCode()))
    return AccountDatabaseInterface(acList)
}

/**
 * this class currently holds any account database,
 * normally it would make an sql request to the internet database
 * since there is no reason to hold it on your device
 */
class AccountDatabaseInterface(private val list:ArrayList<Account>){

    fun isInBase(username: String, password: String): Boolean {
        for (ac in list)  {
            if(username.equals(ac.username) && ac.hashPass == password.hashCode()) {
                return true
            }
        }
        return false
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}



class Account(val username:String, val hashPass: Int) {}

