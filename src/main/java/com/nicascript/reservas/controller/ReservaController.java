package com.nicascript.reservas.controller;

import com.nicascript.reservas.entity.ReservarAutoEntity;
import com.nicascript.reservas.services.ReservaAutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaAutoServices reservaAutoServices;

    @GetMapping
    public List<ReservarAutoEntity> getReservas() {
        return reservaAutoServices.getAutoRepository();
    }
}
