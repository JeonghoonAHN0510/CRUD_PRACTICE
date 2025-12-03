package com.jeonghoon.crud_practice.model.dto;

import com.jeonghoon.crud_practice.model.entity.CategoryEntity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private int category_pk;
    private String category_name;
    private String category_description;
    private boolean category_is_active;
    private LocalDateTime create_date;
    private LocalDateTime update_date;



    public CategoryEntity toEntity(){
        return CategoryEntity.builder()
                .category_pk(this.category_pk)
                .category_name(this.category_name)
                .category_description(this.category_description)
                .category_is_active(this.category_is_active)
                .build();
    } // func end
} // class end