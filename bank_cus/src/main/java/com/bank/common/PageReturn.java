package com.bank.common;

public class PageReturn {

	public static Pagehelper<?> pageReturn(Pagehelper<?> p) {
		if(p==null) {
			return null;
		}
		Integer size = p.getSize();
		Integer total =p.getTotal();
		Integer page = p.getPageNum();
		
		if(total==null||total<0) {
			return null;
		}
		if (size==null||size <= 0) {
			size = total;
		}
		if(page==null||page<=0) {
			page=1;
		}
		
		int pages = total / size;
		int psize = size;
		int start = (page - 1) * size + 1;
		int end = page * size;
		if (total % size != 0) {
			pages++;
			if (page == pages) {
				end = total;
				psize = end - start + 1;
			}
		}

		p.setPageNum(page);
		p.setSize(psize);
		p.setPages(pages);
		p.setTotal(total);
		p.setStartRow(start);
		p.setEndRow(end);
		p.setPageSize(size);
		
		return p;
	}
}
