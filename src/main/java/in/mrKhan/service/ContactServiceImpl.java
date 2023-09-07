package in.mrKhan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mrKhan.entity.ContactEntity;
import in.mrKhan.repository.IContactRepoJpaExtended;

@Service
public class ContactServiceImpl implements IContactService {
	
	private IContactRepoJpaExtended repo;

	@Override
	public boolean saveContact(ContactEntity entity) {
		
		entity.setActiveSw("Y");
		ContactEntity saved = repo.save(entity);
		
		/*
		 * if(save.getContactId() != null) { return true; } else { return false; }
		 */
		return saved.getContactId() !=null ;
	}

	@Override
	public List<ContactEntity> getAllContact() {
		
		return repo.findByActiveSw("Y");
	}

	@Override
	public ContactEntity getContactById(Integer contactId) {
		
		Optional<ContactEntity> id = repo.findById(contactId);
		if(id.isPresent())
		{
			return id.get();
		}
	
		return null;
	}

	@Override
	public boolean updateContact(ContactEntity entity) {
			ContactEntity saved = repo.save(entity);
		
		return saved.getContactId() != null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		 ContactEntity entity = repo.findById(contactId).get();
		 entity.setActiveSw("N");;
		 repo.save(entity);
		
		return true;
	}

	
	@Autowired
	public void setRepo(IContactRepoJpaExtended repo) {
		this.repo = repo;
	}

	}
