package com.example.goku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

@RestController
public class Rest {

    @RequestMapping(value = "/members", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPairs() throws InterruptedException, ExecutionException {
        List<String> list = new ArrayList<String>() {{
            add("Nestor");
            add("Joel");
            add("Selene");
            add("Madeline");
            add("Gabriela");
            add("Alberto");
        }};
        Random rand = new Random();
        String member=list.get(rand.nextInt(6));
        String member2=list.get(rand.nextInt(6));
        return "{\n" +
                "\t\"member1\":\""+member+"\",\t\"member2\":\""+member2+"\"\n" +
                "}\n";

    }

}
