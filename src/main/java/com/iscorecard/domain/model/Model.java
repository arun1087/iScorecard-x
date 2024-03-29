package com.iscorecard.domain.model;

/**
 * Created by Arun on 9/4/2015.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;

/**
 * Created by Arun on 9/4/2015.
 */
@MappedSuperclass
public abstract class Model {
    public static final int ID_LENGTH = 36;
    public static final int ENUM_LENGTH = 256;

    @Id
    @Column(name = "ID", updatable = false)
    @Size(max = ID_LENGTH)
    @GeneratedValue(generator = "UuidOrAssignedGenerator")
    @GenericGenerator(name = "UuidOrAssignedGenerator", strategy = "com.iscorecard.util.jpa.UuidOrAssignedGenerator", parameters = { @Parameter(name = "strategy", value = "uuid2") })
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
