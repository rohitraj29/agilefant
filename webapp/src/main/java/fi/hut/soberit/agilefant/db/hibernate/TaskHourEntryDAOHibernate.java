package fi.hut.soberit.agilefant.db.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import fi.hut.soberit.agilefant.db.TaskHourEntryDAO;
import fi.hut.soberit.agilefant.model.Task;
import fi.hut.soberit.agilefant.model.TaskHourEntry;

@Repository("taskHourEntryDAO")
public class TaskHourEntryDAOHibernate extends GenericDAOHibernate<TaskHourEntry> implements
        TaskHourEntryDAO {

    public TaskHourEntryDAOHibernate() {
        super(TaskHourEntry.class);
    }
    
    @SuppressWarnings("unchecked")
    public List<TaskHourEntry> retrieveByTask(Task target) {
    	Criteria criteria = this.createCriteria(this.getPersistentClass());
    	criteria.add(Restrictions.eq("task", target));
    	return criteria.list();
    }

}