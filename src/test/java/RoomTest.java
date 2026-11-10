import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class RoomTest {

        @Test
        public void checkIn_Should_MarkRoomAsOccupiedAndDirty() {
// Arrange
            Room room = new Room(2, 124.00, false, false);

// Act
            room.checkIn();

// Assert
            assertTrue(room.isOccupied());
            assertTrue(room.isDirty());
            assertFalse(room.isAvailable());
        }

        @Test
        public void checkOut_Should_UnoccupyRoomButKeepItDirty() {
// Arrange
            Room room = new Room(2, 124.00, true, true);

// Act
            room.checkOut();

// Assert
            assertFalse(room.isOccupied());
            assertTrue(room.isDirty());
            assertFalse(room.isAvailable());
        }

        @Test
        public void cleanRoom_Should_MarkRoomAsNotDirty() {
// Arrange
            Room room = new Room(2, 124.00, false, true);

// Act
            room.cleanRoom();

// Assert
            assertFalse(room.isDirty());
            assertTrue(room.isAvailable());
        }
    }

