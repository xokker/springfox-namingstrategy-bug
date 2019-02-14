package io.xkr.springfoxbug;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/bug")
    public BuggyClass getBug() {
        BuggyClass res = new BuggyClass();
        res.setSomeValue("hmm");
        return res;
    }
}
