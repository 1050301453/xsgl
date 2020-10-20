package ws.excel.xxgl.controller;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import ws.excel.xxgl.entity.TRyxx;
import ws.excel.xxgl.service.TRyxxService;
import ws.excel.xxgl.utils.Result;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lhy
 * @since 2020-10-20
 */
@RestController
@RequestMapping("/xxgl/ryxx")
@Api("线索管理")
@CrossOrigin//解决跨域问题
public class TRyxxController {

    @Autowired
    private TRyxxService tRyxxService;

    /**
     *功能描述
     * @author lihaiyuan
     * @date 2020/10/20
     * @param  * @param file
     * @return ws.excel.xxgl.utils.Result
     * easyExcel文件导入
     */
    @PostMapping("fileInsert")
    public Result fileInsert(MultipartFile file){
        Boolean flag = tRyxxService.upload(file,tRyxxService);
        return Result.ok().data("item",flag);
    }
}

