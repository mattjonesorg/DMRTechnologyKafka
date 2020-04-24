package com.dmrtech.calendarservice.model;


import org.junit.Test;

import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;


/**
 * Parasoft Jtest UTA: Test class for CalendarItem
 *
 * @author dferguson
 * @see CalendarItem
 */
public class CalendarItemTest {
    /**
     * Parasoft Jtest UTA: Test for getDate()
     *
     * @author dferguson
     * @see CalendarItem#getDate()
     */
    @Test
    public void testGetDate() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();
        Date d = new Date();
        underTest.setDate(d);

        // When
        Date result = underTest.getDate();

        // Then
        assertNotNull(result);
        assertEquals(d, result);
    }

    /**
     * Parasoft Jtest UTA: Test for getID()
     *
     * @author dferguson
     * @see CalendarItem#getID()
     */
    @Test
    public void testGetID() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();
        UUID testUUID = UUID.randomUUID();
        underTest.setId(testUUID);

        // When
        UUID result = underTest.getID();

        // Then
        assertEquals(testUUID, result);
    }

    /**
     * Parasoft Jtest UTA: Test for setId(Long)
     *
     * @author dferguson
     * @see CalendarItem#setId(UUID)
     */
    @Test
    public void testSetId() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        UUID id = UUID.randomUUID(); // UTA: default value
        underTest.setId(id);

    }

    /**
     * Parasoft Jtest UTA: Test for getDetails()
     *
     * @author dferguson
     * @see CalendarItem#getDetails()
     */
    @Test(timeout = 1000)
    public void testGetDetails() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();
        underTest.setDetails("test string");

        // When
        String result = underTest.getDetails();

        // Then
        // assertEquals("", result);
    }


    /**
     * Parasoft Jtest UTA: Test for getTitle()
     *
     * @author dferguson
     * @see CalendarItem#getTitle()
     */
    @Test(timeout = 1000)
    public void testGetTitle() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();
        underTest.setTitle("title");

        // When
        String result = underTest.getTitle();

        // Then
        assertEquals("title", result);
    }

    /**
     * Parasoft Jtest UTA: Test for isAllDayEvent()
     *
     * @author dferguson
     * @see CalendarItem#isAllDayEvent()
     */
    @Test(timeout = 1000)
    public void testIsAllDayEvent() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();
        underTest.setAllDayEvent(true);

        // When
        boolean result = underTest.isAllDayEvent();

        // Then
        assertTrue(result);
    }

    /**
     * Parasoft Jtest UTA: Test for setAllDayEvent(boolean)
     *
     * @author dferguson
     * @see CalendarItem#setAllDayEvent(boolean)
     */
    @Test(timeout = 1000)
    public void testSetAllDayEvent() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        boolean allDayEvent = false; // UTA: default value
        underTest.setAllDayEvent(allDayEvent);

    }

    /**
     * Parasoft Jtest UTA: Test for setDate(Date)
     *
     * @author dferguson
     * @see CalendarItem#setDate(Date)
     */
    @Test(timeout = 1000)
    public void testSetDate() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        Date eventDate = mock(Date.class);
        underTest.setDate(eventDate);

    }

    /**
     * Parasoft Jtest UTA: Test for setDetails(String)
     *
     * @author dferguson
     * @see CalendarItem#setDetails(String)
     */
    @Test(timeout = 1000)
    public void testSetDetails() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        String details = ""; // UTA: default value
        underTest.setDetails(details);

    }

    /**
     * Parasoft Jtest UTA: Test for setId(Long)
     *
     * @author dferguson
     * @see CalendarItem#setId(UUID)
     */
    @Test(timeout = 1000)
    public void testSetId2() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        UUID id = new UUID(0L,0L); // UTA: default value
        underTest.setId(id);

    }

    /**
     * Parasoft Jtest UTA: Test for setTitle(String)
     *
     * @author dferguson
     * @see CalendarItem#setTitle(String)
     */
    @Test(timeout = 1000)
    public void testSetTitle() throws Throwable {
        // Given
        CalendarItem underTest = new CalendarItem();

        // When
        String title = ""; // UTA: default value
        underTest.setTitle(title);

    }
}