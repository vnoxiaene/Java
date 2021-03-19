package example.CRUDBeginner.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class EmployeeController {
    @GetMapping("/cadastrar")
    public String cadastrar(){
        return "/funcionarios/cadastrar";
    }
    @GetMapping("/listar")
    public String listar(){
        return "/funcionarios/listar";
    }
}
