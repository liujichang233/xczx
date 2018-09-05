package com.xuecheng.manage_media_process.dao;

import com.xuecheng.framework.domain.media.MediaFile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mrt on 2018/7/11.
 */
public interface MediaFileRepository extends MongoRepository<MediaFile,String> {
}
