package com.jeonghoon.crud_practice.model.entity;

import com.jeonghoon.crud_practice.model.dto.CategoryDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int unsigned")
    private int category_pk;
    @Column(columnDefinition = "varchar(100)")
    private String category_name;
    @Column(columnDefinition = "TEXT")
    private String category_description;
    @Column(columnDefinition = "boolean default true")
    private boolean category_is_active;


    public CategoryDto toDto(){
        return CategoryDto.builder()
                .category_pk(this.category_pk)
                .category_name(this.category_name)
                .category_description(this.category_description)
                .category_is_active(this.category_is_active)
                .create_date(this.getCreate_date())
                .update_date(this.getUpdate_date())
                .build();
    } // func end
} // class end