package si.feri.rirs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import si.feri.rirs.commands.AddCarCommand;
import si.feri.rirs.services.OBUService;

import javax.xml.datatype.DatatypeConfigurationException;

@Controller
public class CarController {

    private OBUService OBUService;

    @Autowired
    public void setOBUService(OBUService OBUService) {
        this.OBUService = OBUService;
    }

    @RequestMapping("/car")
    public String getCar() {
        return "redirect:/";
    }

    @RequestMapping("/add-car")
    public String addCar() {
        return "add-car";
    }


    @RequestMapping(value = "/doCarAdd", method = RequestMethod.POST)
    public String doCarAdd(AddCarCommand addCarCommand, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "add-car";
        }

        OBUService.addCar(addCarCommand.getProizvajalec(), addCarCommand.getModel(), addCarCommand.getLeto(), addCarCommand.getGorivo(), addCarCommand.getVrsta(), addCarCommand.getSteviloSedezev());

        return "redirect: /";
    }
}
