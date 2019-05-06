package com.eshop.eshop.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {

	public static final Role USER  = new Role(1l, "Simple User");
	public static final Role EMPLOYEE  = new Role(2l, "Employee");
    public static final Role ADMIN = new Role(3l, "Administrator");
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rid")
    private  Long rid;
    
    
    @Column(name="name")
    private  String name;
    
    public Role() {
		
	}
    

	public Role(Long rid, String name) {
		
		this.rid = rid;
		this.name = name;
	}


	/*private Role(Long rid, String name) {
        this.rid = rid;
        this.name = name;
    }*/

    public Long getRid() {
        return rid;
    }

    
    public String getName() {
        return name;
    }

    

    @Override
    public String toString() {
        return "Role{" + "rid=" + rid + ", name=" + name + '}';
    }
    
    public static final Role getRoleFor(Long rid) throws Exception {
        if (rid == USER.getRid()) {
            return USER;
        }
        else if (rid == EMPLOYEE.getRid()) {
            return EMPLOYEE;
        }
        else if (rid == ADMIN.getRid()) {
            return ADMIN;
        }
        else {
            throw new Exception("Invalid role id: " + rid);
        }
    }
}
