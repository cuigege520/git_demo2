package print.dao.impl;

import print.dao.PageDao;

/**
 * 
 * @author cuiyi
 *
 */
public class PageDaoImpl implements PageDao {

	@Override
	public String getPageSize() {
		return "A4";
	}

}
