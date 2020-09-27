package org.wdzl.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wdzl.entity.Dept;
import org.wdzl.entity.Emp;

import java.io.InputStream;
import java.util.List;

public class DeptDaoMapperTest {
    private InputStream inputStream = null;
    private SqlSessionFactory factory = null;
    private SqlSession sqlSession1 = null;

    private DeptDaoMapper mapper = null;


    @Before
    public void init() throws Exception{
        //读取mybatis核心配置文件
        inputStream = Resources
                .getResourceAsStream("mybatis-config.xml");
        //创建sqlsessionfactory 对象
        factory =
                new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlsession对象
        sqlSession1 = factory.openSession();

        mapper = sqlSession1.getMapper(DeptDaoMapper.class);

    }

    @Test
    public void testOneToMany(){
        List<Dept> depts = mapper.findDeptAll();

    }



    @After
    public void closeAll() throws Exception{
        //释放资源
        sqlSession1.close();
        inputStream.close();
    }
}
