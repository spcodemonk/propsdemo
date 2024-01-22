package com.monk.propsdemo.config;

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
        private int batchSize;
        private String timeWindowDuration;
        private int memoryInUseFlushThresholdPercentage;
        private boolean awsS3CheckConnectivity;
        private String awsS3BootUpFilePrefix;
        private String awsS3CollectionRegion;
        // ... other properties

        // If using Lombok, no need for explicit getters and setters
    }
}