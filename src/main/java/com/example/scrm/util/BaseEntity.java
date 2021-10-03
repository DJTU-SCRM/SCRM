package com.example.scrm.util;

import lombok.Data;

/**
 * @ClassName: BaseEntity
 * @Description:基础信息类
 */
@Data
public class BaseEntity {
    private String createdBy;//创建人
    private String gmtCreate;//创建时间
    private String lastModifiedBy;//更新人
    private String gmtModified;//更新时间
    private int isDeleted;//是否作废1表示作废，0表示未作废
    private int sortNo;//序号
    private int version;//版本号
    private String tokenBackend;
}
