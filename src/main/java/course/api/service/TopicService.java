package course.api.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import course.api.core.Topics;


@Service
public class TopicService {
	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			new Topics("C1","Java","Core Java"),
			new Topics("C2","Spring","Spring Framework"),
			new Topics("C3","Spring","Spring Boot")
			));
	public List<Topics> getAllTopic()
	{
		return topics;
		
	}
	public Topics getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	public void addTopic(Topics topic) {
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topics topic) {
	 for(int i=0;i<topics.size();i++) {
		Topics t=topics.get(i);
		if(t.getId().equals(id))
		{
			topics.set(i, topic);
			return;
		}
	}

   }
	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
}
