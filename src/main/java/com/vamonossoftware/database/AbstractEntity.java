package com.vamonossoftware.database;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@EqualsAndHashCode(of = {"key"})
public class AbstractEntity {

    @Basic @Embedded private Key key;

    // todo
//    @CreatedBy
//    private User createdBy;

    @CreatedDate
    private Date createdDate;

    // todo
//    @LastModifiedBy
//    private User lastModifiedBy;

    @LastModifiedDate
    private Date lastModifiedDate;

    public AbstractEntity() {
        this.key = new Key();
    }

    public AbstractEntity(Key key) {
        this.key = key;
    }

}
