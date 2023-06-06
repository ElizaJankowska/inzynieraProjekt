package com.A1_215IC.inzynieriaprojekt

import org.junit.Test

class LoginAuthenticatorTest {

    @Test
    fun invalidUsernameFails() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc".hashCode()))
        accounts.add(Account("Eliza", "123456".hashCode()))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLoginToDatabase("Krzysiu", "abcabc", base)
        assert(!userMode.isPremium)
    }

    @Test
    fun wrongPasswordFails() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc".hashCode()))
        accounts.add(Account("Eliza", "123456".hashCode()))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLoginToDatabase("Radek", "xyzyzx", base)
        assert(!userMode.isPremium)
    }

    @Test
    fun perfectLoginSucceeds() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc".hashCode()))
        accounts.add(Account("Eliza", "123456".hashCode()))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLoginToDatabase("Radek", "abcabc", base)

        assert(userMode.isPremium)
    }

    @Test
    fun accessSuccesfull() {
        val access = accessDatabase()
        assert(!access.isEmpty())
    }
}