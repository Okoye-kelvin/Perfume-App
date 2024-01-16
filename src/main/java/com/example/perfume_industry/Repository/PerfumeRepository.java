package com.example.perfume_industry.Repository;

import com.example.perfume_industry.Domain.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfumeRepository extends JpaRepository<Perfume, Long> {

}
