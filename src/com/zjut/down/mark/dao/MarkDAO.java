package com.zjut.down.mark.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Mark
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.zjut.down.mark.dao.Mark
 * @author MyEclipse Persistence Tools
 */

public class MarkDAO extends HibernateDaoSupport implements IMarkDAO {
	private static final Logger log = LoggerFactory.getLogger(MarkDAO.class);
	// property constants
	public static final String SCORE = "score";

	protected void initDao() {
		// do nothing
	}

	public void save(Mark transientInstance) {
		log.debug("saving Mark instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Mark persistentInstance) {
		log.debug("deleting Mark instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Mark findById(java.lang.Integer id) {
		log.debug("getting Mark instance with id: " + id);
		try {
			Mark instance = (Mark) getHibernateTemplate().get(
					"com.zjut.down.mark.dao.Mark", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Mark instance) {
		log.debug("finding Mark instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Mark instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Mark as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all Mark instances");
		try {
			String queryString = "from Mark";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Mark merge(Mark detachedInstance) {
		log.debug("merging Mark instance");
		try {
			Mark result = (Mark) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Mark instance) {
		log.debug("attaching dirty Mark instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Mark instance) {
		log.debug("attaching clean Mark instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IMarkDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IMarkDAO) ctx.getBean("MarkDAO");
	}
}