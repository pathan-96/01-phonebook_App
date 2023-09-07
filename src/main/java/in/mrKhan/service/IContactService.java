package in.mrKhan.service;

import java.util.List;

import in.mrKhan.entity.ContactEntity;

public interface IContactService {
	
	public boolean saveContact(ContactEntity entity);
	public List<ContactEntity> getAllContact();
	public ContactEntity getContactById(Integer contactId);
	public boolean updateContact(ContactEntity entity);
	public boolean deleteContactById(Integer contactId);
	
}
