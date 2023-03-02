import br.com.example.school.domain.student.Mail;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void invalidMail(){
        assertThrows(IllegalArgumentException.class,
                () -> new Mail(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Mail(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Mail("invalidMail"));


    }

}
