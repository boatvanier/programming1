package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testApplyDiscount() {
        Book b = new Book("Java", "Bob", 50);
        b.applyDiscount(0.2);

        assertEquals(40, b.getPrice());
    }
    @Test
    void testDefaultPrice() {
        Book b = new Book("Java", "Bob");

        assertTrue(b.getPrice() == 0);
    }

    @Test
    void testInvalidPriceThrowsException() {
        Book b = new Book("Java", "Bob");
        assertThrows(IllegalArgumentException.class, () -> b.setPrice(-10));
    }
}