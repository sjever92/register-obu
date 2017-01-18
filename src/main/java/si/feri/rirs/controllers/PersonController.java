package si.feri.rirs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import si.feri.rirs.commands.AddPersonCommand;
import si.feri.rirs.services.OBUService;
import si.feri.rirs.util.DateConverter;

@Controller
public class PersonController {

    private OBUService OBUService;

    @Autowired
    public void setOBUService(OBUService OBUService) {
        this.OBUService = OBUService;
    }

    @RequestMapping("/add-person")
    public String addPerson() {
        return "add-person";
    }

    @RequestMapping(value = "/doPersonAdd", method = RequestMethod.POST)
    public String doPersonAdd(AddPersonCommand addPersonCommand, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "add-person";
        }

        OBUService.addPerson(addPersonCommand.getImeInPriimek(), addPersonCommand.getEmso(), addPersonCommand.getDavcnaStevilka(), DateConverter.convert(addPersonCommand.getDatumRojstva()));

        return "redirect: /";
    }
}
