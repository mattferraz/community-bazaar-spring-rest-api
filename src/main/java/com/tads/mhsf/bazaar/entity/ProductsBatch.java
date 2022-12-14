package com.tads.mhsf.bazaar.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ProductsBatch {
    private Integer id;
    private String note;
    private LocalDateTime deliveryDate;
    private SupervisoryOrgan supervisoryOrgan;
    private DoneeInstitution doneeInstitution;
}
