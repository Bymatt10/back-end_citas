package com.nicascript.reservas.repository;

import com.nicascript.reservas.entity.ReservarAutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaAutoRepository extends JpaRepository<ReservarAutoEntity, Long> {

}
