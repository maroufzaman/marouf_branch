package com.rmrfroot.tasktracker222.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    //Jira issue number DT129
    //Junit tests for Day class

    String f_name = "Brian";
    String l_name = "Frey";
    String p_word = "pswrd";
    String email = "bf@root.edu";
    int id = 123;

    Day testDay = new Day(f_name,l_name,p_word,email);

    @Test
    void getId() {
        testDay.setId(id);
        assertEquals(id,testDay.getId());
    }

    @Test
    void setId() {
        testDay.setId(1234);
        assertEquals(1234,testDay.getId());
    }

    @Test
    void getFirstName() {
        assertEquals(f_name,testDay.getFirstName());
    }

    @Test
    void setFirstName() {
        testDay.setFirstName("Dave");
        assertEquals("Dave",testDay.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals(l_name,testDay.getLastName());
    }

    @Test
    void setLastName() {
        testDay.setLastName("Jones");
        assertEquals("Jones",testDay.getLastName());
    }

    @Test
    void getPassword() {
        assertEquals(p_word,testDay.getPassword());
    }

    @Test
    void setPassword() {
        testDay.setPassword("4321");
        assertEquals("4321",testDay.getPassword());
    }

    @Test
    void getEmail() {
        assertEquals(email,testDay.getEmail());
    }

    @Test
    void setEmail() {
        testDay.setEmail("newEmail");
        assertEquals("newEmail",testDay.getEmail());
    }

    @Test
    void testToString() {
        testDay.setId(id);
        testDay.setFirstName(f_name);
        testDay.setPassword(p_word);
        testDay.setEmail(email);
        assertEquals("account{" +
                "id=" + id +
                ", firstName='" + f_name + '\'' +
                ", lastName='" + l_name + '\'' +
                ", password='" + p_word + '\'' +
                ", email='" + email + '\'' +
                '}', testDay.toString());
    }
}