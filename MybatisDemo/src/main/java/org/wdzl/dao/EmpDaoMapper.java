package org.wdzl.dao;


import org.wdzl.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * 雇员持久层接口
 */
public interface EmpDaoMapper {
    //添加雇员方法
    boolean addEmp(Emp emp);

    //动态sql if
    List<Emp> dynamicIfTest(Emp emp);

    /**
     * 动态choose
     * @param emp
     * @return
     */
    List<Emp> dynamicChooseTest(Emp emp);

    /**
     * 动态where
     * @param emp
     * @return
     */
    List<Emp> dynamicWhereTest(Emp emp);

    /**
     * 动态trim
     * @param emp
     * @return
     */
    List<Emp> dynamicTrimTest(Emp emp);

    /**
     * 动态set
     * @param emp
     * @return
     */
    void dynamicSetTest(Emp emp);

    /**
     * 动态foreach
     * @param ids
     * @return
     */
     List<Emp> dynamicForeachByListTest(List<Integer> ids);

    /**
     * 动态foreach
     * @param ids
     * @return
     */
    List<Emp> dynamicForeachListTest(List<Integer> ids);

    /**
     * 动态foreach array
     * @param enos
     * @return
     */
    List<Emp> dynamicForeachArrayTest(Integer[] enos);

    /**
     * 动态foreach map
     * @param params
     * @return
     */
    List<Emp> dynamicForeachMapTest(Map<String,Object> params);
}
