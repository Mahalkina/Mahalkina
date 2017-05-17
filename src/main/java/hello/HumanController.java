package hello;

import hello.model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
public class HumanController {
    @Autowired
    private HumanRepository humanRepository;

    @RequestMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String surname, @RequestParam String otchestvo, @RequestParam String address) {
        Human n = new Human();
        n.setName(name);
        n.setSurname(surname);
        n.setOtchestvo(otchestvo);
        n.setAddress(address);

        humanRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Human> getAllHuman(){
        return humanRepository.findAll();
    }
    @RequestMapping(value="/human", method= RequestMethod.GET)
    public String humanForm(Model model) {
        model.addAttribute("human", new Human());
        return "human";
    }

    @RequestMapping(value="/human", method=RequestMethod.POST)
    public String humanSubmit(@ModelAttribute Human n, Model model) {
        humanRepository.save(n);
        model.addAttribute("human", n);
        return "result";
    }


}