package com.zjut.down.software.dao;

import java.util.List;
import com.zjut.down.util.*;


public interface ISoftwareDAO {

	public abstract boolean save(Software software);

	public abstract Software getSoftwareById(int softid);

	public abstract List<Software> getAllSoftwares();

	public abstract List<Software> getSoftwaresByType(String typename);

	public abstract boolean deleteSoftwareById(int softid);
	
	public abstract boolean updateSoftware(Software software);
	
	public abstract PageModel queryAllVideos(int offset, int pagesize);

}