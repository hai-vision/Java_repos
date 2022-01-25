package com.hai.dao_.test;

import com.hai.dao_.dao.GoodsDAO;
import org.junit.jupiter.api.Test;

/**
 * @author hai
 * @date 2022/1/25
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestGoodsDAO {

    @Test
    public void testGoodsDAO() {
        GoodsDAO goodsDAO = new GoodsDAO();

        String sql = "insert into goods values(?, ?, ?)";
        int update = goodsDAO.update(sql, 1, "华为手机", 3999);
        System.out.println(update>0?"添加成功":"添加失败");
    }
}
