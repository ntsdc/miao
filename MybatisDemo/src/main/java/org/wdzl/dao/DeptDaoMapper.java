package org.wdzl.dao;

import org.wdzl.entity.Dept;

import java.util.List;

/**
 * 部门持久层接口
 */
public interface DeptDaoMapper {
    /**
     * 根据部门编号查找指定部门对象
     * @param dno
     * @return
     */
    Dept findDeptByDno(int dno);

    /**
     * 查询所有部门列表信息
     * @return
     */
    List<Dept> findAll();
}
