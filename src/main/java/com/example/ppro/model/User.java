package com.example.ppro.model;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name="userid")
    private Long userId;

	@Column(name = "username")
    private String userName;   

	@Column(name = "password")
    private String password;   

	@Column(name = "email")
    private String email;
    
	@Column(name ="enabled")
	private int enabled;
	
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Lektor> lektori;
    public Set<Lektor> getLektori() {
        return lektori;
    }
   public void setLektori(Set<Lektor> lektori) {
        this.lektori = lektori;
    }
   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
   private Set<Zamestnanec> zamestnanci;
   public Set<Zamestnanec> getZamestnanci() {
       return zamestnanci;
   }
  public void setZamestnanci(Set<Zamestnanec> zamestnanci) {
       this.zamestnanci = zamestnanci;
   }
   
	public User(){
		
	}
	
	public User(User user) {
	        this.userId = user.userId;
	        this.userName = user.userName;
	        this.email = user.email;       
	        this.password = user.password;
	        this.enabled=user.enabled;        
	}
	
	public User(Zamestnanec zamestnanec) {
        this.userName = zamestnanec.getLogin();
        this.email = zamestnanec.getEmail();       
        this.password = zamestnanec.getHeslo();
        this.enabled=1; 
        this.getZamestnanci().add(zamestnanec);
}
	
	public User(Lektor lektor) {
        this.userName = lektor.getLogin();
        this.email = lektor.getEmail();       
        this.password = lektor.getHeslo();
        this.enabled=1; 
        this.getLektori().add(lektor);
}
	
	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}	

	public Long getUserid() {
		return userId;
	}

	public void setUserid(Long userid) {
		this.userId = userid;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
  
}