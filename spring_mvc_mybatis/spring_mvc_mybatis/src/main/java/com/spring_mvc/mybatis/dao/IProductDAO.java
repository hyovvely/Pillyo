package com.spring_mvc.mybatis.dao;

import java.util.ArrayList;

import com.spring_mvc.mybatis.model.ProductVO;

public interface IProductDAO {
	ArrayList<ProductVO> listAllProduct();   		// ��ü ��ǰ ��ȸ
	void insertProduct(ProductVO prdVo);			// ��ǰ ���� ���
	void updateProduct(ProductVO prdVo);			// ��ǰ ���� ����
	void deleteProduct(String prdNo);					// ��ǰ ���� ����
	ProductVO detailViewProduct(String prdNo);// �� ��ǰ ��ȸ
}
