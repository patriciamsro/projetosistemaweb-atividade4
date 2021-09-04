package br.edu.iftm.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {
    
    @RequestMapping("/")
    String inicio(){
        System.out.println("----> passei por aqui");
        return "home";
    }


}
