package com.camping.member.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Member {

    @Id
    @Generated
    private Long id;

    private String memberType;
    private String name;
    private String nickname;

    @Column(unique = true)
    private String email;
    private String password;

    private String cellNumber;
    private String bizNumber;
    private String grade;

    private boolean deleteYn;
}
