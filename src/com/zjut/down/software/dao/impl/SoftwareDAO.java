package com.zjut.down.software.dao.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjut.down.software.dao.ISoftwareDAO;
import com.zjut.down.software.dao.Software;
import com.zjut.down.util.PageModel;

/**
 * A data access object (DAO) providing persistence and search support for
 * Software entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zjut.down.software.dao.Software
 * @author aizen
 */

public class SoftwareDAO extends HibernateDaoSupport implements ISoftwareDAO {

	@Override
	public boolean save(Software software) {
		boolean result = false;
		software.setDealtime(new Timestamp(System.currentTimeMillis()));
		Integer i = (Integer) super.getHibernateTemplate().save(software);
		if (i > 0) {
			result = true;
		}
		return result;
	}

	@Override
	public Software getSoftwareById(final int softid) {
		// TODO Auto-generated method stub
		final String hql = "from Software where softid =:softid";
		Software software = super.getHibernateTemplate().execute(
				new HibernateCallback<Software>() {
					@Override
					public Software doInHibernate(Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query query = arg0.createQuery(hql);
						query.setInteger("softid", softid);
						return (Software) query.uniqueResult();
					}
				});
		if (software != null) {
			return software;
		} else {
			return null;
		}

	}

	@Override
	public List<Software> getAllSoftwares() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Software> softwares = super.getHibernateTemplate().find(
				"from Software");
		if (softwares.size() > 0) {
			return softwares;
		} else {
			return null;
		}
	}

	@Override
	public List<Software> getSoftwaresByType(String typename) {
		// TODO Auto-generated method stub
		String hql = "from Software where type = " + typename + "";
		List<Software> softwares = super.getHibernateTemplate().find(hql);
		if (softwares != null && softwares.size() > 0) {
			return softwares;
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteSoftwareById(int softid) {
		// TODO Auto-generated method stubs
		boolean result = false;
		HibernateTemplate ht = super.getHibernateTemplate();
		Software software = ht.get(Software.class, softid);
		try {
			ht.delete(software);
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public boolean updateSoftware(final Software software) {
		// TODO Auto-generated method stub
		boolean result = false;
		software.setDealtime(new Timestamp(System.currentTimeMillis()));
		final String hql = "update software set title=:title, typename=:typename,tags=:tags, language=:language, dealtime=:dealtime, installenv=:installenv, pubid=:pubid, address=:address, intro=:intro where softid=:softid";
		Integer i = super.getHibernateTemplate().execute(
				new HibernateCallback<Integer>() {

					@Override
					public Integer doInHibernate(Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query q = arg0.createQuery(hql);
						q.setString("title", software.getTitle());
						q.setString("typename", software.getTypename());
						q.setString("tags", software.getTags());
						q.setString("language", software.getLanguage());
						q.setDouble("filesize", software.getFilesize());
						q.setString("installenv", software.getInstallenv());
						q.setInteger("pubid", software.getPubid());
						q.setInteger("count", software.getCount());
						q.setString("address", software.getAddress());
						q.setString("intro", software.getIntro());
						return q.executeUpdate();
					}
				});
		if (i > 0) {
			result = true;
		}
		return result;
	}

	@Override
	public PageModel queryAllVideos(int offset, int pagesize) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Software ";
		Query query = getSession().createQuery(hql);
		int total = ((Long) query.uniqueResult()).intValue();
		List datas = getSession().createQuery("from Software")
				.setFirstResult(offset).setMaxResults(pagesize).list();
		PageModel pageModel = new PageModel();
		pageModel.setTotal(total);
		pageModel.setDatas(datas);
		return pageModel;
	}

}