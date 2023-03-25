package niva;

import java.util.List;

public interface DaoNiva {
    public void create(PlayerNiva pn);
    public List<PlayerNiva> readAll();
}
