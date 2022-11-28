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
@Table(name = "feedback_table")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
    private String cusId;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
    private String refId;
	
	@Column
	private long rating;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(long id, @NotNull @Size(min = 2, message = "please enter the  data ") String cusId,
			@NotNull @Size(min = 2, message = "please enter the  data ") String refId, long rating) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.refId = refId;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", cusId=" + cusId + ", refId=" + refId + ", rating=" + rating + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}
	
	
	
	
	}
