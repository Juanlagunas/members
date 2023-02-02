package com.example.goku;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

@Service
public class ServiceGoku {

    @Async("asyncExecutor")
    public CompletableFuture<Map> getCountries() throws InterruptedException {
//        int res= generate(0, 1000);
//        Thread.sleep(res);
        Map map = new HashMap<String, String>() {{
            put("USA", "Washington");
            put("United Kingdom", "London");
            put("India", "New Delhi");
        }};

        return CompletableFuture.completedFuture(map);
    }

    public int generate(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
