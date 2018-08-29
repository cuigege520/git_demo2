package print;

import print.dao.BoxDao;
import print.dao.PageDao;
import print.dao.impl.BoxDaoImpl;
import print.dao.impl.PageDaoImpl;

/**
 * 打印机
 * 1：纸张接口
 * 2：墨盒接口
 * 3：打印的方法
 * @author cuiyi
 *
 */
public class Print {
	private PageDao pageDao;
	private BoxDao boxDao;
	
	/**
	 * 打印方法
	 */
	public void p(){
		pageDao = new PageDaoImpl();
		boxDao = new BoxDaoImpl();
		System.out.println("打印一张【" +pageDao.getPageSize() +"】大小的【"+ boxDao.getColor() +"】纸张");
	}

	public void setPageDao(PageDao pageDao) {
		System.out.println("1注入对象成功/。。");
		this.pageDao = pageDao;
	}

	public void setBoxDao(BoxDao boxDao) {
		System.out.println("2注入对象成功/。。");
		this.boxDao = boxDao;
	}
	
}
