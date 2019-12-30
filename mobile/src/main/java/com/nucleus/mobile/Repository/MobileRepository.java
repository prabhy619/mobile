package com.nucleus.mobile.Repository;

import com.nucleus.mobile.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Long> {

    @Query("select m from Mobile  m where m.Brand like %:mode% ")
     List<Mobile> findByNameIs(@Param("mode") String mode);

}
