package com.springdataneo4jcontainertest;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/labels")
public class LabelController {

    private final LabelRepository labelRepository;

    @GetMapping("/test")
    public String dummyGet() {
        return "It is a response of GET request";
    }

    @PostMapping
    @Transactional
    public String createNewLabel(@RequestParam String name, @Nullable @RequestParam Integer age) {
        Label label = new Label();
        label.setName(name);
        label.setAge(age);
        return labelRepository.save(label).getId();
    }

    @GetMapping
    @Transactional(readOnly = true)
    public List<Label> getAllLabels() {
        return labelRepository.findAll();
    }

}
