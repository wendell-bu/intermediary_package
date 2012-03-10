package com.psbc.intermediary.dao;

import com.psbc.intermediary.domain.Branch;

/**
 * Created by IntelliJ IDEA.
 * User: savile
 * Date: 12-3-7
 * Time: 上午11:56
 * To change this template use File | Settings | File Templates.
 */
public interface BranchDao extends GenericDao<Branch>{
    public Branch getBranchByName(String name);
}
