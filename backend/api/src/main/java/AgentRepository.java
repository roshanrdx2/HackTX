import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hacktx.app.api.model.Agents;

public interface AgentRepository extends JpaRepository<Agents, Integer> {
	List<Agents> findByZipcode(Integer zipcode);
}
