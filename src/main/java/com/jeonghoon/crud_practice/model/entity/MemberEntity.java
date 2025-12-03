package com.jeonghoon.crud_practice.model.entity;

import com.jeonghoon.crud_practice.model.dto.MemberDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int unsigned")
    private int mno;

    public MemberDto toDto(){
        return MemberDto.builder()
                .mno(this.mno)
                .build();
    } // func end
} // class end