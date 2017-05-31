package com.strawberry.master.service.mongo.translation;

import java.util.Collection;

/**
 * 翻译框架
 * Created by yaguang.wang
 * on 2017/5/20.
 */
public interface Translation<T> {
    TranslationAble and();

    TranslationAble is();

    TranslationAble like();

    TranslationAble exists();

    TranslationAble in();

    TranslationAble or();

    T query(QueryAble q);

    Collection<T> querys(QueryAble q);

    Long count(QueryAble q);
}
