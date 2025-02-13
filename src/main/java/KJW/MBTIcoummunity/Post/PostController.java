package KJW.MBTIcoummunity.Post;

import KJW.MBTIcoummunity.Post.Setvice.PostService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://mbti.ap-northeast-2.elasticbeanstalk.com/

@RestController
@AllArgsConstructor
@RequestMapping("/api/post")
public class PostController {

    private final Logger logger = LoggerFactory.getLogger(PostController.class);

    private final PostService service;

    @GetMapping()
    public List<Post> getEntity() {

        logger.warn("getEntity");
        return service.getEntity();
    }

    //@PostMapping("")
    //public ResponseEntity<?> createEntity(@RequestBody PostCreateDto dto) {
    //service.createPost(dto);
    //return ResponseEntity<>();
    //}

}
