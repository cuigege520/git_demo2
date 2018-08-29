package daos;

import java.util.List;
import java.util.Map;

import entity.SmbmsUser;

public interface SmbmsUserDao {
	/**
	 * 多删除
	 * @return
	 */
	public int deletes(List<Integer> ids);
	
	public List<SmbmsUser> chaxun();
	
	/**
	 * 增加
	 * @param smbmsUser
	 * @return
	 */
	public int add(SmbmsUser smbmsUser);
	
	/**
	 * 修改
	 * @param smbmsUser
	 * @return
	 */
	public int update(SmbmsUser smbmsUser);
//	public int update(@Param("id207")Integer id207,@Param("pwd207")String pwd207,@Param("phone")String phone);
	
	/**
	 * 获取表的记录条数
	 * @return
	 */
	public int getCount();
	
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<SmbmsUser> query();
	
	
	/**
	 * 登录
	 * @param smbmsUser
	 * @return
	 */
	public SmbmsUser login(SmbmsUser smbmsUser);
	
	
	/**
	 * 条件查询
	 * @param map
	 * @return
	 */
	public List<SmbmsUser> queryTj(Map<String,Object> map);
	
	
}
