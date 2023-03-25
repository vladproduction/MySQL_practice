package granit;

import java.util.List;

public interface DaoGranit {
    public void create(PlayerGranit pg);
    public List<PlayerGranit> readAll();
}
