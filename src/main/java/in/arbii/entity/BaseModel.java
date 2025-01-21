package in.arbii.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseModel {
	
	/*
	 * These are the common fields which we will need in almost every entity/model class
	 * So it is feasible to put all these fields in a single class 
	 * and we can extend this class whenever we need it
	 */
	private Boolean isActive;

	private Boolean isDeleted; // soft deletion

	private Integer createdBy;

	private Date createdOn;

	private Integer updatedBy;

	private Date updatedOn;
}
