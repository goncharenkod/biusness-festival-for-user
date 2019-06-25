package dao.abstraction;

import models.Festival;

import java.util.List;

public interface FestivalDao {
	Festival getById(long id);
	Festival getByName(String name);
	Long add(Festival festival);
	void update(Festival festival);
	void remove(long id);
	List<Festival> getAllList();
}
