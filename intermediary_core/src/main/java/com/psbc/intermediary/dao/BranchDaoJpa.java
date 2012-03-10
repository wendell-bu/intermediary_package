package com.psbc.intermediary.dao;

import com.psbc.intermediary.domain.Branch;

/**
 * Created by IntelliJ IDEA.
 * User: savile
 * Date: 12-3-7
 * Time: 下午12:11
 * To change this template use File | Settings | File Templates.
 */
public class BranchDaoJpa extends GenericDaoJpa<Branch> implements BranchDao{
    public BranchDaoJpa(){
        super(Branch.class);
    }

    public Branch getBranchByName(String name) {
        return null;
    }
}
