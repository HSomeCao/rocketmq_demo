/**
 * 
 */
package com.bank.dao.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.bank.common.PageReturn;
import com.bank.common.Pagehelper;
import com.bank.config.AppConfig;
import com.bank.config.CidAuth;
import com.bank.dao.IdTypeDao;
import com.bank.pojo.IdType;

import vig.core.exception.VIGException;
import vig.library.AbstractObject.AbstractDAO;

/**
 * @author admin
 * 2019年4月27日
 */
public class IdTypeDaoImpl extends AbstractDAO implements IdTypeDao{

	//证件类型编号表
	public static String tablename = "id_type";

	public IdTypeDaoImpl() {
	};

	public IdTypeDaoImpl(String cid) {
		try {
			super.setEnv(AppConfig.getApp(), cid, tablename, new IdType());
			// super.setAbstractConstructorInstance(arg0, arg1);
		} catch (VIGException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<IdType> getList(IdType pojo) {
		String where = "";
		if (pojo != null ) {
			if (!StringUtils.isBlank(pojo.id)) {
				where = vig.core.util.SQLUtil.andCondition(where, vig.core.util.SQLUtil.composeSQL("id",pojo.id));
			}
		}
		
		try {
			return getObject(CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Boolean insertOne(IdType pojo) {
		pojo.setCid(CidAuth.cid());
		try {
			return insertObject(pojo);
		} catch (VIGException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Integer updateOne(IdType pojo) {
		String where = "id = " + pojo.getId();
		try {
			return updateObject(pojo, CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer deleteOne(IdType pojo) {
		try {
			return deleteObject(CidAuth.whereCid("id = " + pojo.id));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Pagehelper<IdType> getPagehelper(IdType pojo, Integer page, Integer size) {
		Pagehelper<IdType> pagehelper = new Pagehelper<IdType>();
		String where = "";
		if(pojo != null) {
			if(pojo.id != null) {
				where = vig.core.util.SQLUtil.andCondition(where, vig.core.util.SQLUtil.composeSQL("id", pojo.id));
			}
		}
		
		if(page == null) {
			page = 1;
		}
		if(size == null) {
			size = -1;
		}
		try {
			pagehelper.setList(getObject(null,CidAuth.whereCid(where),null, page , size));
			pagehelper.setTotal(getTotal());
			pagehelper.setPageNum(page);
			pagehelper.setSize(size);
			return (Pagehelper<IdType>) PageReturn.pageReturn(pagehelper);
		} catch (VIGException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	


}
