package com.mgl.j2objctests;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
// --> This works: @Table(name = "jpa_entity_test")
// --x The following does not:
@Table(indexes = {
      @Index(columnList = "email")})
// --x The following does not either:
//@Table(uniqueConstraints = {
//    @UniqueConstraint(columnNames = {"email"}),
//    @UniqueConstraint(columnNames = {"uuid"})})
public class JpaEntityTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private Long id;

    private String email;

    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
