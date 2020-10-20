package ws.excel.xxgl.service;

import org.springframework.web.multipart.MultipartFile;
import ws.excel.xxgl.entity.TRyxx;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lhy
 * @since 2020-10-20
 */
public interface TRyxxService extends IService<TRyxx> {

    Boolean upload(MultipartFile file,TRyxxService tRyxxService);
}
