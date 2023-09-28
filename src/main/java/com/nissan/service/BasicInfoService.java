package com.nissan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.BasicInfo;
import com.nissan.repo.BasicInfoRepository;

@Service
public class BasicInfoService {
    @Autowired
    private BasicInfoRepository basicInfoRepository;
    
    public BasicInfo getBasicInfoById(Long nid) {
        return basicInfoRepository.findById(nid).orElse(null);
    }
    
    public BasicInfo createBasicInfo(BasicInfo basicInfo) {
        return basicInfoRepository.save(basicInfo);
    }
    
    public BasicInfo updateBasicInfo(Long nid, BasicInfo basicInfo) {
        BasicInfo existingInfo = getBasicInfoById(nid);
        if (existingInfo != null) {
            existingInfo.setName(basicInfo.getName());
            return basicInfoRepository.save(existingInfo);
        }
        return null;
    }
    
    public void deleteBasicInfo(Long nid) {
        basicInfoRepository.deleteById(nid);
    }
}

