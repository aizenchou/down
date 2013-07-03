/**
 * 
 */
package com.zjut.down.util;

import java.util.List;

/**
 * @author zhouwl08118
 *
 */
public class PageModel {
	
	int offset = 0;
	
	//total 总记录
	private  int total;

	//datas 当前页的记录集
	private List datas;
	/**
	 * 分页
	 */
	public PageModel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @return the datas
	 */
	public List getDatas() {
		return datas;
	}
	/**
	 * @param datas the datas to set
	 */
	public void setDatas(List datas) {
		this.datas = datas;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	

}
