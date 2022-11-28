package com.carpenter.booking.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="transferAmt_tbl")
public class TransferAmt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String email;
	
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String name;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String bankName;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String accNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String ifscCode;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String service;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private long amount;
	
		

	
	public TransferAmt() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TransferAmt(long id, @NotNull @Size(min = 2, message = "please enter the  data ") String email,
			@NotNull @Size(min = 2, message = "please enter the  data ") String name,
			@NotNull @Size(min = 2, message = "please enter the  data ") String bankName,
			@NotNull @Size(min = 2, message = "please enter the  data ") String accNo,
			@NotNull @Size(min = 2, message = "please enter the  data ") String ifscCode,
			@NotNull @Size(min = 2, message = "please enter the  data ") String service,
			@NotNull @Size(min = 2, message = "please enter the  data ") long amount) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.bankName = bankName;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.service = service;
		this.amount = amount;
	}




	@Override
	public String toString() {
		return "TransferAmt [id=" + id + ", email=" + email + ", name=" + name + ", bankName=" + bankName + ", accNo="
				+ accNo + ", ifscCode=" + ifscCode + ", service=" + service + ", amount=" + amount + "]";
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBankName() {
		return bankName;
	}




	public void setBankName(String bankName) {
		this.bankName = bankName;
	}




	public String getAccNo() {
		return accNo;
	}




	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}




	public String getIfscCode() {
		return ifscCode;
	}




	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}




	public String getService() {
		return service;
	}




	public void setService(String service) {
		this.service = service;
	}




	public long getAmount() {
		return amount;
	}




	public void setAmount(long amount) {
		this.amount = amount;
	}

	
	
	
}
