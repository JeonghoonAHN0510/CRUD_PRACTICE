package com.jeonghoon.crud_practice.model.entity;

import com.jeonghoon.crud_practice.model.dto.MenuDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "menu")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int unsigned")
    private int menu_pk;
    @Column(columnDefinition = "varchar(100)")
    private String menu_name;
    @Column(columnDefinition = "TEXT")
    private String menu_description;
    @Column(columnDefinition = "int")
    private int menu_price;
    @Column(columnDefinition = "varchar(255)")
    private String menu_url;
    @Column(columnDefinition = "boolean default true")
    private boolean menu_is_active;
    @Column(columnDefinition = "boolean default false")
    private boolean menu_is_sold_out;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_pk", columnDefinition = "int unsigned")
    private CategoryEntity categoryEntity;

    public MenuDto toDto(){
        return MenuDto.builder()
                .menu_pk(this.menu_pk)
                .menu_name(this.menu_name)
                .menu_description(this.menu_description)
                .menu_price(this.menu_price)
                .menu_url(this.menu_url)
                .menu_is_sold_out(this.menu_is_sold_out)
                .menu_is_active(this.menu_is_active)
                .category_pk(this.categoryEntity != null ? this.categoryEntity.getCategory_pk() : 0)
                .create_date(this.getCreate_date())
                .update_date(this.getUpdate_date())
                .build();
    } // func end
} // class end