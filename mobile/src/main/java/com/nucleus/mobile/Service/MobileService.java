package com.nucleus.mobile.Service;

import com.nucleus.mobile.Repository.MobileRepository;
import com.nucleus.mobile.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MobileService {
    public MobileRepository getMobileRepository() {
        return mobileRepository;
    }

    @Autowired
    private MobileRepository mobileRepository;
    public List<Mobile> getAllMobiles(){
        return mobileRepository.findAll();
    }

    public void insert(Mobile mobile) {
        mobileRepository.save(mobile);
    }

    public void delete(long Sno){
        mobileRepository.deleteById(Sno);
    }

    public List<Mobile> findByBrand(String brand) {
        List<Mobile> mobile= mobileRepository.findAll();
        List<Mobile> mob = new ArrayList<>();
        for(Mobile temp:mobile)
        {
            if(temp.getBrand().equals(brand))
                mob.add(temp);
        }
        return mob;
    }

    public List<Mobile> findByNameIs (String mode)
    {
        return mobileRepository.findByNameIs(mode);
    }

    public Optional<Mobile> getindivid(long no) {
        try{return mobileRepository.findById(no);}
        catch(Exception e){

        }



        return null;
    }
}
