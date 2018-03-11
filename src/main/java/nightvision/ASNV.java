package nightvision;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ASNV extends JavaPlugin implements Listener
{
	@Override
	public void onDisable()
	{

	}

	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void
}
