package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo1")
public class AbonentController {
    @Autowired
    private AbonentRepository abonentRepository;


//    @RequestMapping("/list")
//    public String human (Model model) {
//        model.addAttribute("humans", humanRepository.findAll());
//        return "humans";
//    }

    @RequestMapping("/add")
    public @ResponseBody
    String add(@RequestParam(value = "n_human", required = false) Integer n_human,
               @RequestParam(value = "n_phone", required = false) long n_phone,
               @RequestParam(value = "god_ystanovki_phone", required = false ) long god_ystanovki_phone,
               @RequestParam(value = "stoimost_abonentskoy_plati", required = false ) float stoimost_abonentskoy_plati,
               @RequestParam(value = "tip_ystanovki_phone", required = false) boolean tip_ystanovki_phone,
               @RequestParam(value = "privileges", required = false) boolean privileges,
               Model model)
    {
        Abonent m = new Abonent();

        m.setN_human(n_human);
        m.setN_phone(n_phone);
        m.setGod_ystanovki_phone(god_ystanovki_phone);
        m.setStoimost_abonentskoy_plati(stoimost_abonentskoy_plati);
        m.setTip_ystanovki_phone(tip_ystanovki_phone);
        m.setPrivileges(privileges);

        abonentRepository.save(m);
        return "Saved";

    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Abonent> getAllAbonent(){
        return abonentRepository.findAll();
    }

    @RequestMapping(value="/abonent", method= RequestMethod.GET)
    public String abonentForm(Model model) {
        model.addAttribute("Abonent", new Abonent());
        return "abonent";
    }

    @RequestMapping(value="/abonent", method=RequestMethod.POST)
    public String abonentSubmit(@ModelAttribute Abonent m, Model model) {

        abonentRepository.save(m);
        model.addAttribute("abonent", m);
        return "result";
    }

}

