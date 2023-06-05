package com.A1_215IC.inzynieriaprojekt

import org.junit.Assert.*
import org.junit.Test

class LoginAuthenticatorTest {

    @Test
    fun invalidUsernameFails() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc"))
        accounts.add(Account("Eliza", "123456"))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLogin("Krzysiu", "abcabc".hashCode(), base)
        assert(!userMode.isPremium)
    }

    @Test
    fun wrongPasswordFails() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc"))
        accounts.add(Account("Eliza", "123456"))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLogin("Radek", "xyzyzx".hashCode(), base)
        assert(!userMode.isPremium)
    }

    @Test
    fun perfectLogin() {
        val accounts = ArrayList<Account>()
        accounts.add(Account("Radek", "abcabc"))
        accounts.add(Account("Eliza", "123456"))
        val base = AccountDatabase(accounts)

        LoginAuthenticator.attemptLogin("Radek", "abcabc".hashCode(), base)

        assert(userMode.isPremium)
    }
}