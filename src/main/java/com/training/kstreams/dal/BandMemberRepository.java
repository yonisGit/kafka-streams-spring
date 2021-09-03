package com.training.kstreams.dal;

import com.training.kstreams.model.BandMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandMemberRepository extends CrudRepository<BandMember,Long> {
    BandMember getBandMemberById(String id);
}
