package com.william.batch.processor;

import com.william.batch.model.RecordSO;
import com.william.batch.model.WriterSO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by sungang on 2017/12/4.
 */
public class RecordProcessor implements ItemProcessor<RecordSO, WriterSO> {


    private static final Logger LOGGER = LoggerFactory.getLogger(RecordProcessor.class);

    @Override
    public WriterSO process(RecordSO item) throws Exception {
        LOGGER.info("Processing Record: {}", item);
        WriterSO writerSo = new WriterSO();
        writerSo.setId(item.getId());
        writerSo.setFullName(item.getFirstName() + " " + item.getLastName());
        String substring = String.valueOf(Math.random()).substring(3, 8);
        if (substring.contains("0")) {
            return null; // 返回空，即词条不插入
        }
        writerSo.setRandomNum(substring);
        LOGGER.info("Processed Writer: {}", writerSo);
        return writerSo;
    }
}
