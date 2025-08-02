package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testValidEmailWithSubdomain() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun testInvalidEmailMissingDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }
    @Test
    fun testInvalidEmailDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }


}
