package builder;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestUser {

    @Test
    public void testUser() {
        User user = User.builder()
                .firstName("Yurii")
                .lastName("Nefedov")
                .age(18)
                .occupation("Engineer")
                .build();

        assertEquals("Yurii", user.getFirstName());
        assertEquals("Nefedov", user.getLastName());
        assertEquals(18, user.getAge());
        assertArrayEquals(new String[] {"Engineer"}, user.getOccupations().toArray());
    }
}