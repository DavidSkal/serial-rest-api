package pl.skalski.serialapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.skalski.serialapp.dao.entity.Serial;
import pl.skalski.serialapp.manager.SerialManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/serials")
public class SerialApi {

    public SerialManager serials;

    @Autowired
    public SerialApi(SerialManager serials) {
        this.serials = serials;
    }

    @GetMapping(value = "/all")
    public Iterable<Serial> getAll()
    {
        return serials.findAll();
    }

    @GetMapping
    public Optional<Serial> getById(@RequestParam Long index)
    {
        return serials.findById(index);
    }

    @PostMapping
    public Serial addSerial(@RequestBody Serial serial)
    {
        return serials.save(serial);
    }

    @PutMapping
    public Serial updateSerial(@RequestBody Serial serial)
    {
        return serials.save(serial);
    }

    @DeleteMapping
    public void deleteSerial(@RequestParam Long index)
    {
        serials.deleteById(index);
    }
}
