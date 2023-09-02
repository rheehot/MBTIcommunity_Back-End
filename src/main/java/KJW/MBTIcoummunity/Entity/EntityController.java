package KJW.MBTIcoummunity.Entity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://mbti.ap-northeast-2.elasticbeanstalk.com/

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
@RequestMapping("/entity")
public class EntityController {


    private final EntityRepository repository;

    @GetMapping("")
    public List<ENTITY> getEntity() {
        return repository.findAll();
    }

    @PostMapping("")
    public ENTITY createEntity(@RequestBody ENTITY entity) {
        ENTITY saved = repository.save(entity);
        return saved;
    }

}
