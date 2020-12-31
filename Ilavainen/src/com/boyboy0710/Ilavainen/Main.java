package com.boyboy0710.Ilavainen;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
		@Override
		public void onEnable() {
			System.out.println("----------------------------------------------------------");
			System.out.println("  마인크래프트 Ilavainen 를러그인을 성공적으로 불러왔습니다                      ");
			System.out.println("           플러그인 제작자ㅣ:boyboy0710                        ");
			System.out.println("       tip:이스터 애그가 들어있습니다 잘 찾아보세요                                 ");
			System.out.println("----------------------------------------------------------");
			
		}

		@Override
		public void onDisable() {
			System.out.println("사실 이스터애그는 없었습니다");
			System.out.println("Ilavainen 플러그인이 비활성화 되었습니다");
		}
		
		@EventHandler
		public void onInteract(PlayerInteractEvent e) {
			Player p = e.getPlayer();
	        if (e.getAction() == Action.RIGHT_CLICK_AIR
	            || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        	
	        	if (e.getItem().getType() == Material.APPLE) {
	        		p.getWorld().createExplosion(p.getLocation(), 20);
	        	}
	            
	        	if(e.getItem().getType() == Material.NETHER_STAR) {
	        		p.getLocation().getBlock().setType(Material.LAVA);
	        	}
	        }
		}
}
