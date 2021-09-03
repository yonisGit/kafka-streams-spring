package com.training.kstreams.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity
@Data
public class Band {
    @Id long id;
    String name;
    @Transient List<BandMember> members;
}
