package bol;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "User_tbl")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name = "first_name",length = 30)
	private String firstName;
	
	@Column(name = "last_name",length = 30)
	private String lastName;
	
	@Column(length = 30,unique = true)
	private String email;
	
	@Column(length = 20,nullable = false)
	private String pass;
	
	@Transient
	private String conPass;
	
	@Column(name = "user_role",length = 20)
	private Role userRole;
	
	private double amount;
	
	private LocalDate date;
	
	private byte image;
	
	
	public User(String firstName, String lastName, String email, String pass, String conPass, Role userRole,
			double amount, LocalDate date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
		this.conPass = conPass;
		this.userRole = userRole;
		this.amount = amount;
		this.date = date;
	}


	public User() {
		super();
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getConPass() {
		return conPass;
	}


	public void setConPass(String conPass) {
		this.conPass = conPass;
	}


	public Role getUserRole() {
		return userRole;
	}


	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public byte getImage() {
		return image;
	}


	public void setImage(byte image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", pass=" + pass + ", userRole=" + userRole + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
	
	
}
