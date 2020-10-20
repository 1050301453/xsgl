package ws.excel.xxgl.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lhy
 * @since 2020-10-20
 */
@Data
public class TRyxxVo{
    @ExcelProperty(index = 0)
    private String id;

    @ExcelProperty(index = 1)
    private String xm;

    @ExcelProperty(index = 2)
    private String xb;

    @ExcelProperty(index = 3)
    private String zjh;

    @ExcelProperty(index = 4)
    private String hjdz;

    @ExcelProperty(index = 5)
    private String sjzzd;

    @ExcelProperty(index = 6)
    private String sjh;

    @ExcelProperty(index = 7)
    private String qqh;

    @ExcelProperty(index = 8)
    private String wxh;

    @ExcelProperty(index = 9)
    private String yxh;

    @ExcelProperty(index = 10)
    private String rybs;


}
