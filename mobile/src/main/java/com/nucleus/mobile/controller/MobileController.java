package com.nucleus.mobile.controller;

import com.nucleus.mobile.Repository.MobileRepository;
import com.nucleus.mobile.Service.MobileService;
import com.nucleus.mobile.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobileController {

    @Autowired
    private MobileService mobileService;


    @GetMapping(value="/mobiles")
    public List<Mobile> getdaMobiles(){
        return mobileService.getAllMobiles();
    }


    @GetMapping(value = "/mobiles/{co}")
    public List<Mobile> getMobilebyBrand(@PathVariable(value="co") String co)
    {
        return mobileService.findByBrand(co);
    }

    @DeleteMapping(value = "/mobiles/{no}")
    public void delMobiles(@PathVariable(value="no") long no){
        mobileService.delete(no);
    }

    /*
        @GetMapping(value = "/list/{no}")
        public Mobile getMobile(@PathVariable(value="no") long no){
             return mobileService.getindivid(no);
        }
    */
    @PutMapping("/put/{Sno}")
    public void updateUser(@PathVariable Long Sno, @RequestBody Mobile mob)
    {
        Optional<Mobile> temp=mobileService.getindivid(Sno);
        Mobile temp2=new Mobile();
                temp2.setSno(Sno);
        temp2.setBrand(temp.isPresent()?temp.get().getBrand():null);
        temp2.setMode(temp.isPresent()?temp.get().getMode():null);
        temp2.setMode(mob.getMode());
        temp2.setBrand(mob.getBrand());
        mobileService.insert(temp2);
    }

    @PostMapping(value = "/mobiles")
    public void putMobiles(@RequestBody Mobile mobile){
        mobileService.insert(mobile);
    }


    @GetMapping(value="/list/{str}")
    public List<Mobile> getstrmobile(@PathVariable(value="str") String co)
    {
        return mobileService.findByNameIs(co);
    }



}
