package net.iskandar.examples.project_management.dao.jpa;

import net.iskandar.examples.project_management.dao.DocumentDao;
import net.iskandar.examples.project_management.domain.Document;
import org.springframework.stereotype.Repository;

@Repository(value = "documentDao")
public class DocumentDaoImpl extends BaseDaoImpl<Document> implements DocumentDao {

	public DocumentDaoImpl() {
		super(Document.class);
	}

}
