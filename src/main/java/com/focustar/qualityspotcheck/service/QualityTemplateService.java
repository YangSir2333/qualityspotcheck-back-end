package com.focustar.qualityspotcheck.service;

import com.focustar.qualityspotcheck.pojo.req.MatchOrderReq;
import com.focustar.qualityspotcheck.pojo.vo.CheckPersonNamesVO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: yangxiansheng
 * @Since: 2021/1/28
 * description:
 */
public interface QualityTemplateService {
    List<CheckPersonNamesVO> getCheckNames(LocalDate start, LocalDate end);

    Integer matchOrder(MatchOrderReq req);
}
