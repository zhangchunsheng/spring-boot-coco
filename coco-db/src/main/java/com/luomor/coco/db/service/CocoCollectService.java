package com.luomor.coco.db.service;

import com.github.pagehelper.PageHelper;
import com.luomor.coco.db.dao.CocoCollectMapper;
import com.luomor.coco.db.domain.CocoCollect;
import com.luomor.coco.db.domain.CocoCollectExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CocoCollectService {
    @Resource
    private CocoCollectMapper collectMapper;

    public int count(int uid, Integer gid) {
        CocoCollectExample example = new CocoCollectExample();
        example.or().andUserIdEqualTo(uid).andValueIdEqualTo(gid).andDeletedEqualTo(false);
        return (int) collectMapper.countByExample(example);
    }

    public List<CocoCollect> queryByType(Integer userId, Byte type, Integer page, Integer limit, String sort, String order) {
        CocoCollectExample example = new CocoCollectExample();
        CocoCollectExample.Criteria criteria = example.createCriteria();

        if (type != null) {
            criteria.andTypeEqualTo(type);
        }
        criteria.andUserIdEqualTo(userId);
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return collectMapper.selectByExample(example);
    }

    public int countByType(Integer userId, Byte type) {
        CocoCollectExample example = new CocoCollectExample();
        example.or().andUserIdEqualTo(userId).andTypeEqualTo(type).andDeletedEqualTo(false);
        return (int) collectMapper.countByExample(example);
    }

    public CocoCollect queryByTypeAndValue(Integer userId, Byte type, Integer valueId) {
        CocoCollectExample example = new CocoCollectExample();
        example.or().andUserIdEqualTo(userId).andValueIdEqualTo(valueId).andTypeEqualTo(type).andDeletedEqualTo(false);
        return collectMapper.selectOneByExample(example);
    }

    public void deleteById(Integer id) {
        collectMapper.logicalDeleteByPrimaryKey(id);
    }

    public int add(CocoCollect collect) {
        collect.setAddTime(LocalDateTime.now());
        collect.setUpdateTime(LocalDateTime.now());
        return collectMapper.insertSelective(collect);
    }

    public List<CocoCollect> querySelective(String userId, String valueId, Integer page, Integer size, String sort, String order) {
        CocoCollectExample example = new CocoCollectExample();
        CocoCollectExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(userId)) {
            criteria.andUserIdEqualTo(Integer.valueOf(userId));
        }
        if (!StringUtils.isEmpty(valueId)) {
            criteria.andValueIdEqualTo(Integer.valueOf(valueId));
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return collectMapper.selectByExample(example);
    }
}
