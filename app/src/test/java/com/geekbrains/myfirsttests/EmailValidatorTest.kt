package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {
    /** vy new tests */
    @Test
    fun emailValidator_ValidReturnCheckValue_ReturnBoolean(){
        assertEquals("test_assertEquals",true,EmailValidator.isValidEmail("name@email.com"))
    }
    @Test
    fun emailValidator_InvalidReturnCheckValue_ReturnBoolean(){
        assertNotEquals("test assertNotEquals",true,EmailValidator.isValidEmail("name"))
    }
    @Test
    fun emailValidator_ValidReturnArray_ReturnArray(){
        assertArrayEquals(arrayOf("one","two","three"),EmailValidator.returnArray())
    }
    @Test
    fun emailValidator_ValidNullObject_ReturnNull(){
        assertNull(EmailValidator.testObjectForNull)
    }
    @Test
    fun emailValidator_ValidNullObject_ReturnNonNull(){
        assertNotNull(EmailValidator)
    }
    @Test
    fun emailValidator_ValidSameObject_ReturnsTrue(){
        assertSame(true, EmailValidator.isValidEmail("name@email.com"))
    }
    @Test
    fun emailValidator_ValidSameObject_ReturnsFalse(){
        assertNotSame(EmailValidator(), EmailValidator.cloneEmailValidator)
    }


    /**  available tests */
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}
