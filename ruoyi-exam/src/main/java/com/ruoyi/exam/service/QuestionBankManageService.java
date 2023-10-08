package com.ruoyi.exam.service;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.exam.domain.QuestionBankManage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 题库管理表 服务类
 * </p>
 *
 * @author hougq
 * @since 2023-09-28
 */
public interface QuestionBankManageService extends IService<QuestionBankManage> {

    /**
     * 获取题库列表
     * @param questionBankManage
     * @return
     */
    public List<QuestionBankManage> selectQuestionBankList(QuestionBankManage questionBankManage);

    /**
     * 获取最新题目编号
     * @return
     */
    public String getTopicCode();

    /**
     * 新增题库题目
     * @param questionBankManage
     * @return
     */
    public int insertQuestionBankData(QuestionBankManage questionBankManage);

    /**
     * 获取当前题目详情
     * @param topicId
     * @return
     */
    public QuestionBankManage questionBankInfo(String topicId);

    /**
     * 修改当前题目
     * @param questionBankManage
     * @return
     */
    public int updateQuestionBank(QuestionBankManage questionBankManage);

}
