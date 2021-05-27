package com.xyf.srb.core.mapper;

import com.xyf.srb.core.pojo.dto.ExcelDictDTO;
import com.xyf.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author XYF
 * @since 2021-05-06
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<ExcelDictDTO> list);
}
