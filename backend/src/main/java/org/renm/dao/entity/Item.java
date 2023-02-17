package org.renm.dao.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String picture;
    private int price;
    private int stock;

}
