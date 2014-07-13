package com.labcheckin.dao;

import java.util.List;

import com.labcheckin.entity.Sex;
import com.labcheckin.entity.User;

public interface PersonManage{

	//��ȡ�û���Ϣ
	public User findUser(int userId);
	//��ͨ�û���¼��֤
	public User checkUser(String userName,String userPassword);
	//���ע���û����Ƿ��Ѿ�����
	public boolean isUserNameExist(String userName);
	//�޸�һ���û���Ϣ
	public int updateUserInfor(User user);
	//���sexId��ѯSex
	public Sex findSex(int sexId);
	//����һ���û���Ϣ
	public int addUser(User user);
}
