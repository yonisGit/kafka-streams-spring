package com.training.kstreams.bl;

import com.training.kstreams.model.BandMember;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.binder.kafka.streams.annotations.KafkaStreamsProcessor;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(KafkaStreamsProcessor.class)
public class BandMemberBL {

    @StreamListener
    @SendTo("output")
    public KStream<?, BandMember> process(@Input("input") KStream<?, BandMember> input) {
        return input;
    }
}
