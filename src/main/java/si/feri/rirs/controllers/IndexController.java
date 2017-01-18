package si.feri.rirs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import si.feri.rirs.services.OBUService;

@Controller
public class IndexController {

    private OBUService OBUService;

    @Autowired
    public void setOBUService(OBUService OBUService) {
        this.OBUService = OBUService;
    }

    @RequestMapping({"/", "/index"})
    public String getIndex(Model model) {

        model.addAttribute("cars", OBUService.listCars());

        return "index";
    }
}
