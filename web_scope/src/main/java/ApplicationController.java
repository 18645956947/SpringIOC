import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ApplicationController {

    @RequestMapping("textApplication")
    @ResponseBody
    public String text(){
        return this.toString();
    }
}
