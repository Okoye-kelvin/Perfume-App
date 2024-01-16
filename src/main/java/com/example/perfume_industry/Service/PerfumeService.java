package com.example.perfume_industry.Service;

import com.example.perfume_industry.Domain.Perfume;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PerfumeService {
    Perfume savePerfume(Perfume perfume);
    Perfume getPerfumeById(long Id);
    List<Perfume> getAllPerfume();
    Perfume updatePerfume(Perfume perfume);
    void deletePerfume(long Id);


}

