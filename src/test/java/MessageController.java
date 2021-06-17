import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MessageController {

    @Test
    public void test_setMessage_ReturnCheck() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String curValue = messageController.setMessage("Test");

        Assertions.assertEquals("OK", curValue);
    }

    @Test
    public void test_setMessage_StaticMessageCheck() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String curValue = messageController.setMessage("Test");

        Assertions.assertEquals("Test", at.gio.MessageController.message);
    }

    @Test
    public void test_setMessage_StaticMessageCheckEmpty() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String curValue = messageController.setMessage("");

        Assertions.assertNotEquals("", at.gio.MessageController.message);
    }

    @Test
    public void test_resetMessage_StaticMessageCheck() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String curValue = messageController.setMessage("Test");

        messageController.reset();

        Assertions.assertEquals("-", at.gio.MessageController.message);
    }
    @Test
    public void test_getMessage_StaticMessageCheckWithoutChange() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String value = messageController.getMessage();

        Assertions.assertEquals(value, at.gio.MessageController.message);
    }
    @Test
    public void test_getMessage_StaticMessageCheckWithChange() {
        at.gio.MessageController messageController = new at.gio.MessageController();

        String curValue = messageController.setMessage("Test");

        String value = messageController.getMessage();

        Assertions.assertEquals(value, at.gio.MessageController.message);
    }

}
