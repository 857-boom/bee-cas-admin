package org.okboom.bee.cas.domain.authorization.repository.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.okboom.yuumi.mybatis.base.BaseDomain;

/**
 * @author tookbra
 * @date 2020/8/24
 * @description
 */
@Data
@TableName("param")
public class ParamPO extends BaseDomain {
    private static final long serialVersionUID = 2085443868809401861L;
}
