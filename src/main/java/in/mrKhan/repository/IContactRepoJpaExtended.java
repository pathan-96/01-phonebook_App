package in.mrKhan.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mrKhan.entity.ContactEntity;

public interface IContactRepoJpaExtended extends JpaRepository<ContactEntity, Serializable> {
	
	public List<ContactEntity> findByActiveSw(String activesw);
}
