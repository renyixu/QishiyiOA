package com.qishiyi.oa.dao.impl;

import java.awt.print.Book;

import org.springframework.stereotype.Repository;

import com.qishiyi.oa.base.BaseDaoImpl;
import com.qishiyi.oa.dao.IBookDao;


/**
 * BookDao，继承BaseDaoImpl
 */
@Repository
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao {

}
