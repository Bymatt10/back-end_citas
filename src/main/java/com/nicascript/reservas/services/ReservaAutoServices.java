package com.nicascript.reservas.services;

import com.nicascript.reservas.entity.ReservarAutoEntity;
import com.nicascript.reservas.repository.ReservaAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaAutoServices {

    @Autowired
    private ReservaAutoRepository autoRepository;

    public List<ReservarAutoEntity> getAutoRepository() {
        return autoRepository.findAll();
    }

    public Object createReserva(ReservarAutoEntity reservarAutoEntity) {
        return autoRepository.save(reservarAutoEntity);
    }
}
