package dartquery.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dartquery.repository.dto.Title;
import dartquery.repository.TitleRepository;
@RestController
public class DartQueryRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TitleRepository titleRepository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Title> getTtile() throws Exception {
		List<Title> title = titleRepository.findAll();
		logger.info(title.toString());
		return title;
	}
}
