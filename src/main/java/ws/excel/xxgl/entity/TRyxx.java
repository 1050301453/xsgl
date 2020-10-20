package ws.excel.xxgl.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lhy
 * @since 2020-10-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_RYXX")
@ApiModel(value="TRyxx对象", description="")
public class TRyxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelProperty(index = 0)
    @TableField("ID")
    private String id;

    @ExcelProperty(index = 1)
    @TableField("XM")
    private String xm;

    @ExcelProperty(index = 2)
    @TableField("XB")
    private String xb;

    @ExcelProperty(index = 3)
    @TableField("ZJH")
    private String zjh;

    @ExcelProperty(index = 4)
    @TableField("HJDZ")
    private String hjdz;

    @ExcelProperty(index = 5)
    @TableField("SJZZD")
    private String sjzzd;

    @ExcelProperty(index = 6)
    @TableField("SJH")
    private String sjh;

    @ExcelProperty(index = 7)
    @TableField("QQH")
    private String qqh;

    @ExcelProperty(index = 8)
    @TableField("WXH")
    private String wxh;

    @ExcelProperty(index = 9)
    @TableField("YXH")
    private String yxh;

    @ExcelProperty(index = 10)
    @TableField("RYBS")
    private String rybs;


}
