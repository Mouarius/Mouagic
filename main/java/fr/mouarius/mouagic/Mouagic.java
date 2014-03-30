package fr.mouarius.mouagic;

/***
 * Mouagic
 * 
 * Mouagic
 * 
 * 
 * @author Mouarius
 * @license GNU Lesser General Public License v2
 *          (http://www.gnu.org/licenses/lgpl.html)
 * @copyright Copyright (C) 2014  Mouarius
 * 
 *  
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.mouarius.mouagic.lib.References;
import fr.mouarius.mouagic.proxies.CommonProxy;


@Mod(modid = References.MODID, name = References.MODNAME, version= References.MODVERSION)
public class Mouagic {
	
@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
public static CommonProxy proxy;

	@Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
		
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }

}
