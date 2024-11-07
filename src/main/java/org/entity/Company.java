package org.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// JPA가 관리하는 객체
// name 속성의 default 값은 클래스 이름
@Entity
@Table(name = "cp")
public class Company {

    @Id
    private Long id;

//    @Column(unique = true, nullable = false, length = 20)
    private String name;

//    private String address;

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//    public Company(Long id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }

    public Company() {
    }

}
