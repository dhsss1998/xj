package jee.support.dao;


import jee.support.entity.Reward;

public interface RewardDao {


  int addReward(Reward reward);
    //删除管理
    public void deleteReward(long inforId);

}
