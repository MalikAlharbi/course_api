package com.course.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        Topic t1 = new Topic("1", "hi", "booooooot");
        Topic t2 = new Topic("2", "h2", "booooooot2");
        Topic t3 = new Topic("3", "h3", "booooooot3");

        return Arrays.asList(t1, t2, t3);
    }
}
