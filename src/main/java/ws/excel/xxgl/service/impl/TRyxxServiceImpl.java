package ws.excel.xxgl.service.impl;

import com.alibaba.excel.EasyExcel;
import org.springframework.web.multipart.MultipartFile;
import ws.excel.xxgl.Listener.MyExcelListener;
import ws.excel.xxgl.entity.TRyxx;
import ws.excel.xxgl.entity.vo.TRyxxVo;
import ws.excel.xxgl.mapper.TRyxxMapper;
import ws.excel.xxgl.service.TRyxxService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhy
 * @since 2020-10-20
 */
@Service
public class TRyxxServiceImpl extends ServiceImpl<TRyxxMapper, TRyxx> implements TRyxxService {

    @Override
    public Boolean upload(MultipartFile file,TRyxxService tRyxxService) {
        try {
            //1 获取文件输入流
            InputStream inputStream = file.getInputStream();

            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcel.read(inputStream, TRyxxVo.class, new MyExcelListener(tRyxxService)).sheet().doRead();
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
