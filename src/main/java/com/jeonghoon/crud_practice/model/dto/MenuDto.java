package com.jeonghoon.crud_practice.model.dto;

import com.jeonghoon.crud_practice.model.entity.MenuEntity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto {
    private int menu_pk;
    private String menu_name;
    private String menu_description;
    private int menu_price;
    private String menu_url;
    private boolean menu_is_active;
    private boolean menu_is_sold_out;
    private LocalDateTime create_date;
    private LocalDateTime update_date;

    private int category_pk;


    public MenuEntity toEntity(){
        return MenuEntity.builder()
                .menu_pk(this.menu_pk)
                .menu_name(this.menu_name)
                .menu_description(this.menu_description)
                .menu_price(this.menu_price)
                .menu_url(this.menu_url)
                .menu_is_active(this.menu_is_active)
                .menu_is_sold_out(this.menu_is_sold_out)
                .build();
    } // func end
} // class end