package com.training.kstreams.dal;

import com.training.kstreams.model.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends CrudRepository<Band,Long> {
    Band getBandById(String id);
}
