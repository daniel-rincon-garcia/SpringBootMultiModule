package vectorialgames.vectorial.glscene.playerService.glsceneplayerservice.glsceneplayerservicecontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaMundo {
	@Value("${name}")
	private String name;
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return String.format("Hola mundo player %s", name);
	}

}
