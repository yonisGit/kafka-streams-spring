package com.training.kstreams.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BandMember {
    @Id long id;
    String name;
    int age;
    Profession profession;
}
// {"id":1,"name":"John Petrucci","age": 51, "profession":"GUITAR"}