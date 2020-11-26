package dartquery.repository.dto;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Title {

	private String corp_code;
	private String corp_name;
	private String stock_code;
	private String corp_cls;
	private String report_nm;
	@Id
	private String rcept_no;
	private String flr_nm;
	private String rcept_dt;
	private String rm;
}
