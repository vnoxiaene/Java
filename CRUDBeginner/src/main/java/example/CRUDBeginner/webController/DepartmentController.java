package example.CRUDBeginner.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartmentController {
    @GetMapping("/cadastrar")
    public String cadastrar(){
        return "/departamentos/cadastrar";
    }
    @GetMapping("/listar")
    public String listar(){
        return "/departamentos/listar";
    }
}
