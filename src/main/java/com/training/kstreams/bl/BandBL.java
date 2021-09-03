package com.training.kstreams.bl;

import com.training.kstreams.dal.BandRepository;
import com.training.kstreams.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.stereotype.Service;

@Service
public class BandBL {

    final BandRepository bandRepository;

    @Autowired
    public BandBL(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    public void addBand(Band band) {
        bandRepository.save(band);
    }
}
