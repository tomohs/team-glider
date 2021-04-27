package jp.co.internous.glider.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.glider.model.domain.dto.PurchaseHistoryDto;

@Mapper
public interface TblPurchaseHistoryMapper {
	int insert(Map<String, Object> parameter);
	
	List<PurchaseHistoryDto> findByUserId(@Param("userId") int userId);
	
	@Update("update tbl_purchase_history set status = 0, updated_at = now() where user_id = #{userId}")
	int logicalDeleteByUserId(@Param("userId") int userId);
}
