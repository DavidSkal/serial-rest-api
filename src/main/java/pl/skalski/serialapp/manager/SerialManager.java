package pl.skalski.serialapp.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.skalski.serialapp.dao.SerialRepo;
import pl.skalski.serialapp.dao.entity.Serial;

import java.util.Optional;

@Service
public class SerialManager {
    public  SerialRepo SerialRepo;


    @Autowired
    public SerialManager(SerialRepo serialRepo) {
        SerialRepo = serialRepo;
    }

    public Optional<Serial> findById(Long id)
    {
        return SerialRepo.findById(id);
    }

    public Iterable<Serial> findAll()
    {
        return SerialRepo.findAll();
    }

    public Serial save(Serial Serial)
    {
        return SerialRepo.save(Serial);
    }

    public void deleteById (Long id)
    {
         SerialRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void DBfile()
    {
        save(new Serial(1L,"Gra o Tron", 8, "Ostatni sezon był tragiczny"));
    }
}
