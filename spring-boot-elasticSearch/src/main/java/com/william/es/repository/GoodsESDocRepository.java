package com.william.es.repository;

import com.william.es.model.GoodsModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by sungang on 2017/5/19.
 */
public interface GoodsESDocRepository extends ElasticsearchRepository<GoodsModel, Long> {
}
