package sleuthbug;

import brave.Tracing;
import brave.kafka.streams.KafkaStreamsTracing;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaStreamsManager {

    @Autowired
    private Tracing tracing;
    private KafkaStreamsTracing kafkaStreamsTracing;

    @PostConstruct
    void init() {
        kafkaStreamsTracing = KafkaStreamsTracing.create(tracing);
    }
}
