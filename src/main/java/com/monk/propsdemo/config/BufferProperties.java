package com.monk.propsdemo.config;

import com.monk.propsdemo.mp.LevelTwo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("buffer")
@Data
public class BufferProperties {
    private List<BufferTime> bufferTimes;

    @Data
    public static class BufferTime {
        private String type;
        private LevelTwo levelTwo;
        private int batchSize;

    }
}