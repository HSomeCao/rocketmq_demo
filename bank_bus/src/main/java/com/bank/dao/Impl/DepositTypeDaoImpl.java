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
import com.bank.dao.DepositTypeDao;
import com.bank.pojo.DepositType;

import vig.core.exception.VIGException;
import vig.library.AbstractObject.AbstractDAO;

/**
 * @author admin
 * 2019年4月26日
 */
public class DepositTypeDaoImpl extends AbstractDAO implements DepositTypeDao{

	//存款类型
	public static String tablename = "deposit_type";

	public DepositTypeDaoImpl() {
	};

	public DepositTypeDaoImpl(String cid) {
		try {
			super.setEnv(AppConfig.getApp(), cid, tablename, new DepositType());
			// super.setAbstractConstructorInstance(arg0, arg1);
		} catch (VIGException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<DepositType> getList(DepositType pojo) {
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
	public Boolean insertOne(DepositType pojo) {
		pojo.setCid(CidAuth.cid());
		try {
			return insertObject(pojo);
		} catch (VIGException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Integer updateOne(DepositType pojo) {
		String where = "id = " + pojo.getId();
		try {
			return updateObject(pojo, CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer deleteOne(DepositType pojo) {
		try {
			return deleteObject(CidAuth.whereCid("id = " + pojo.id));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Pagehelper<DepositType> getPagehelper(DepositType pojo, Integer page, Integer size) {
		Pagehelper<DepositType> pagehelper = new Pagehelper<DepositType>();
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
			return (Pagehelper<DepositType>) PageReturn.pageReturn(pagehelper);
		} catch (VIGException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
