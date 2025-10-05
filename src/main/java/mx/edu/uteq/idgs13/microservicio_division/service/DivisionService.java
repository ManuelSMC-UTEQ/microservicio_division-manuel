package mx.edu.uteq.idgs13.microservicio_division.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uteq.idgs13.microservicio_division.entity.Division;
import mx.edu.uteq.idgs13.microservicio_division.repository.DivisionRepository;

@Service
public class DivisionService {

    @Autowired
    private DivisionRepository divisionRepo;

    public Division crearDivision(Division division) {
        return divisionRepo.save(division);
    }
}
// asd