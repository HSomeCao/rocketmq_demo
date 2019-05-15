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
import com.bank.dao.TransferDao;
import com.bank.pojo.Transfer;

import vig.core.exception.VIGException;
import vig.library.AbstractObject.AbstractDAO;

/**
 * @author admin
 * 2019年4月26日
 */
public class TransferDaoImpl extends AbstractDAO implements TransferDao{

	//转账表
	public static String tablename = "transfer";

	public TransferDaoImpl() {
	};

	public TransferDaoImpl(String cid) {
		try {
			super.setEnv(AppConfig.getApp(), cid, tablename, new Transfer());
			// super.setAbstractConstructorInstance(arg0, arg1);
		} catch (VIGException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Transfer> getList(Transfer pojo) {
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
	public Boolean insertOne(Transfer pojo) {
		pojo.setCid(CidAuth.cid());
		try {
			return insertObject(pojo);
		} catch (VIGException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Integer updateOne(Transfer pojo) {
		String where = "id = " + pojo.getId();
		try {
			return updateObject(pojo, CidAuth.whereCid(where));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer deleteOne(Transfer pojo) {
		try {
			return deleteObject(CidAuth.whereCid("id = " + pojo.id));
		} catch (VIGException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Pagehelper<Transfer> getPagehelper(Transfer pojo, Integer page, Integer size) {
		Pagehelper<Transfer> pagehelper = new Pagehelper<Transfer>();
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
			return (Pagehelper<Transfer>) PageReturn.pageReturn(pagehelper);
		} catch (VIGException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
