package com.training.kstreams.controller;

import com.training.kstreams.bl.BandBL;
import com.training.kstreams.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/band")
public class BandController {

    final BandBL bandBL;

    @Autowired
    public BandController(BandBL bandBL) {
        this.bandBL = bandBL;
    }

    @PostMapping
    public void addBand(Band band) {
        bandBL.addBand(band);
    }
}
