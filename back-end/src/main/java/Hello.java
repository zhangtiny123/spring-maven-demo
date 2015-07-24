import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by taozhang on 2/16/15.
 */
@Component
public class Hello {
    public String sayHello() {
        return "Hello world!";
    }
}
