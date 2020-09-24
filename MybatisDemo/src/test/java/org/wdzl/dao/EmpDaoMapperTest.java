package org.wdzl.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wdzl.entity.Emp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDaoMapperTest {
    private InputStream inputStream = null;
    private SqlSessionFactory factory = null;
    private SqlSession sqlSession = null;
    private EmpDaoMapper mapper = null;


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
        mapper = sqlSession.getMapper(EmpDaoMapper.class);
    }

    @Test
    public void testAddEmp() throws Exception{
        Emp emp = new Emp(null,"小丽","xiaoli@163.com",5000.0,2);
        boolean res = mapper.addEmp(emp);
        //提交事务
        sqlSession.commit();
        //输出添加后的雇员信息
        System.out.println(emp);
    }

    @Test
    public void dynamicIfTest(){
        Emp emp = new Emp();
        emp.setEname("%t%");
        emp.setEmail("tom@163.com");
        emp.setDno(30);
        List<Emp> emps = mapper.dynamicIfTest(emp);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }

    @Test
    public void dynamicChooseTest(){
        Emp emp = new Emp();
        emp.setEno(6);
//        emp.setEname("%t%");
//        emp.setEmail("lily@163.com");
//        emp.setDno(30);
        List<Emp> emps = mapper.dynamicChooseTest(emp);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }

    @Test
    public void dynamicWhereTest(){
        Emp emp = new Emp();
        emp.setEmail("tom@163.com");
        emp.setDno(30);
        List<Emp> emps = mapper.dynamicWhereTest(emp);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }

    @Test
    public void dynamicTrimTest(){
        Emp emp = new Emp();
        emp.setEmail("tom@163.com");
        emp.setDno(30);
        List<Emp> emps = mapper.dynamicTrimTest(emp);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }
    @Test
    public void dynamicSetTest(){
        Emp emp = new Emp();
        emp.setEno(6);
        emp.setEname("lily");
        emp.setEmail("lily@163.com");
        emp.setDno(40);
        mapper.dynamicSetTest(emp);
        sqlSession.commit();
    }

    @Test
    public void dynamicForeachListTest(){
        List<Integer> enos = new ArrayList<Integer>();
        enos.add(1);
        enos.add(2);
        enos.add(6);
        List<Emp> emps = mapper.dynamicForeachListTest(enos);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }

    @Test
    public void dynamicForeachArrayTest(){
       Integer[] enos = new Integer[]{1,2,6};
        List<Emp> emps = mapper.dynamicForeachArrayTest(enos);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }

    @Test
    public void dynamicForeachMapTest(){
        List<Integer> enos = new ArrayList<Integer>();
        enos.add(1);
        enos.add(2);
        enos.add(6);

        Map<String,Object> maps = new HashMap<String,Object>();
        maps.put("ename","%t%");
        maps.put("enos",enos);
        List<Emp> emps = mapper.dynamicForeachMapTest(maps);
        for (Emp e: emps) {
            System.out.println(e);
        }
    }
    @After
    public void closeAll() throws Exception{
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}
