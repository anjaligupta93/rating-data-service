package resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.ratingdataservice.model.Rating;


@RestController
@RequestMapping("/")
public class RatingDataResource {

	@RequestMapping("/rating/{userID}")
	public List<Rating> getMovie(@PathVariable String userID)
	{
		return Arrays.asList(
				new Rating(123, 4),
				new Rating(234, 5)
				);
	}
	
}
