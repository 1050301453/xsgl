package ws.excel.xxgl.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import ws.excel.xxgl.entity.TRyxx;
import ws.excel.xxgl.entity.vo.TRyxxVo;
import ws.excel.xxgl.service.TRyxxService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyExcelListener
 * @Author lihaiyuan
 * @Date 2020/10/20 17:21
 * @Version 1.0.0
 **/
public class MyExcelListener extends AnalysisEventListener<TRyxxVo> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyExcelListener.class);

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    List<TRyxx> list = new ArrayList<TRyxx>();

    public TRyxxService tRyxxService;
    public MyExcelListener() {}
    //创建有参数构造，传递subjectService用于操作数据库
    public MyExcelListener(TRyxxService tRyxxService) {
        this.tRyxxService = tRyxxService;
    }
    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(TRyxxVo data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", data);
        TRyxx tRyxx = new TRyxx();
        BeanUtils.copyProperties(data,tRyxx);
        list.add(tRyxx);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }
    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        LOGGER.info("所有数据解析完成！");
    }
    /**
     * 存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        tRyxxService.saveBatch(list);
        LOGGER.info("存储数据库成功！");
    }
}
