package guru.SpringFramework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.SpringFramework.spring5webapp.repositories.AuthorRepository;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}