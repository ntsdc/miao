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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptDaoMapperTest {
    private InputStream inputStream = null;
    private SqlSessionFactory factory = null;
    private SqlSession sqlSession = null;
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
        sqlSession = factory.openSession();
        mapper = sqlSession.getMapper(DeptDaoMapper.class);
    }

    @Test
    public void testOneToMany(){
        Dept dept = mapper.findDeptByDno(1);
        if(dept!=null){
            System.out.println("编号为"+dept.getDno()+"部门下的雇员信息如下：");
            List<Emp> emps = dept.getEmps();
            for (Emp emp:emps){
                System.out.println(emp);
            }
        }
    }



    @After
    public void closeAll() throws Exception{
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}
