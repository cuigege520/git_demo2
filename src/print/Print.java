package print;

import print.dao.BoxDao;
import print.dao.PageDao;
import print.dao.impl.BoxDaoImpl;
import print.dao.impl.PageDaoImpl;

/**
 * ��ӡ��
 * 1��ֽ�Žӿ�
 * 2��ī�нӿ�
 * 3����ӡ�ķ���
 * @author cuiyi
 *
 */
public class Print {
	private PageDao pageDao;
	private BoxDao boxDao;
	
	/**
	 * ��ӡ����
	 */
	public void p(){
		pageDao = new PageDaoImpl();
		boxDao = new BoxDaoImpl();
		System.out.println("��ӡһ�š�" +pageDao.getPageSize() +"����С�ġ�"+ boxDao.getColor() +"��ֽ��");
	}

	public void setPageDao(PageDao pageDao) {
		System.out.println("1ע�����ɹ�/����");
		this.pageDao = pageDao;
	}

	public void setBoxDao(BoxDao boxDao) {
		System.out.println("2ע�����ɹ�/����");
		this.boxDao = boxDao;
	}
	
}
