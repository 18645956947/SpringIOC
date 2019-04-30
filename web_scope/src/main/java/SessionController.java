import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
    @RequestMapping("textSession")
    @ResponseBody
    public String text(){
        return this.toString();
    }
}
