package in.mrKhan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT_DTLS")
public class ContactEntity {
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId ;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "ACTIVESW")
	private String activeSw;

}
