package daos;

import java.util.List;
import java.util.Map;

import entity.SmbmsUser;

public interface SmbmsUserDao {
	/**
	 * ��ɾ��
	 * @return
	 */
	public int deletes(List<Integer> ids);
	
	public List<SmbmsUser> chaxun();
	
	/**
	 * ����
	 * @param smbmsUser
	 * @return
	 */
	public int add(SmbmsUser smbmsUser);
	
	/**
	 * �޸�
	 * @param smbmsUser
	 * @return
	 */
	public int update(SmbmsUser smbmsUser);
//	public int update(@Param("id207")Integer id207,@Param("pwd207")String pwd207,@Param("phone")String phone);
	
	/**
	 * ��ȡ��ļ�¼����
	 * @return
	 */
	public int getCount();
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<SmbmsUser> query();
	
	
	/**
	 * ��¼
	 * @param smbmsUser
	 * @return
	 */
	public SmbmsUser login(SmbmsUser smbmsUser);
	
	
	/**
	 * ������ѯ
	 * @param map
	 * @return
	 */
	public List<SmbmsUser> queryTj(Map<String,Object> map);
	
	
}
