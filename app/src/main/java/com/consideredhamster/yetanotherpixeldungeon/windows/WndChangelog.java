/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Yet Another Pixel Dungeon
 * Copyright (C) 2015-2016 Considered Hamster
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.consideredhamster.yetanotherpixeldungeon.windows;

import com.consideredhamster.yetanotherpixeldungeon.Assets;
import com.consideredhamster.yetanotherpixeldungeon.YetAnotherPixelDungeon;
import com.consideredhamster.yetanotherpixeldungeon.scenes.PixelScene;
import com.consideredhamster.yetanotherpixeldungeon.ui.ScrollPane;
import com.consideredhamster.yetanotherpixeldungeon.ui.Window;
import com.consideredhamster.yetanotherpixeldungeon.utils.Utils;
import com.watabou.gltextures.SmartTexture;
import com.watabou.gltextures.TextureCache;
import com.watabou.noosa.BitmapText;
import com.watabou.noosa.BitmapTextMultiline;
import com.watabou.noosa.Game;
import com.watabou.noosa.Image;
import com.watabou.noosa.TextureFilm;
import com.watabou.noosa.ui.Component;

import java.util.ArrayList;

public class WndChangelog extends Window {

	private static final int WIDTH_P	= 128;
	private static final int HEIGHT_P	= 160;

	private static final int WIDTH_L	= 160;
	private static final int HEIGHT_L	= 128;

	private static final String TXT_TITLE	= "Version 0.3.0d is finally here!";

    private static final String TXT_DESCR =
        "Okay, first of all - glad to see you again! These several months were a bit rough for me, but there were so much more reasons why I've delayed this update for so long, and I have to admit that not all of them are actually reasonable. I am sorry for this awful lack of updates during this time, but I promise it'll get better from now on. This update was in the works for a very, very long time, and despite this it consists mostly of a myriad of minor tweaks and bugfixes, but soon after that the work will go according to a specific schedule. As I've said before, this mod is not even 50% complete.\n" +
        "\n" +
        "Second part is about that very schedule... I remember that I've said before about localization coming somewhere around version 0.4.0, but  since I've re-estimated all of the things I want to add, and realized that it would be much more effective to keep YAPD updates small, but frequent. Because of this, I have to take my words back and tell all of you that localization will happen only around version 0.7.0. This doesn't means that it will happen later, bcause th amount of work I want to complete before starting to work on localization is roughly the same. It just means that there will be more updates released between the current moment and that one.\n" +
        "\n" +
        "Okay, here comes a SHORT version of the change log. Because of a sheer amount of tweaks, and most of them being too small and/or too obvious to mention them, I'll skip most of them and will try to highlight the most important parts. If you really want it, you can find the full change log on the YAPD's github repository. Also, don't forget that you can always see this screen again by tapping the version number in the lower left corner of the title screen!\n" +
        "\n" +
        "CHARACTER\n" +
        "\n" +
        "- changed Wand skill attribute into Magic skill, which affects your accuracy with wands and power of some of the scrolls\n" +
        "\n" +
        "- changed Detection attribute into Perception, which affects your chances to expose your enemy to counter attacks instead of your chances to prevent equipping a cursed item\n" +
        "\n" +
        "- changed Magic power attribute into Willpower, which affects your chances to prevent equipping a cursed item instead of determining scroll's power\n" +
        "\n" +
        "- Warrior now gets increased amount of hp only on every 6th level instead of every 3rd level\n" +
        "\n" +
        "- Acolyte now gets decreased amount of hp only on every 6th level instead of every 3rd level\n" +
        "\n" +
        "- shields now apply their armor class bonus only with 50% chance or on failed guard attempts\n" +
        "\n" +
        "- shields now degrade and proc only when applying their bonus or when guarding\n" +
        "\n" +
        "- debuffs now affect chance to apply shield's bonus AC instead of the shield's AC\n" +
        "\n" +
        "- guard effectiveness is now affected by your base strength instead of excess strength\n" +
        "\n" +
        "- hero's remains are now separated by difficulties\n" +
        "\n" +
        "MOBS & BOSSES\n" +
        "\n" +
        "- all enemies in the fifth chapter now count as magical (but not necessarily having body or mind immunity)\n" +
        "\n" +
        "- third boss does not counts as magical, while still having body and mind immunity\n" +
        "\n" +
        "- evil eyes now drop raw meat instead of cave scorpions\n" +
        "\n" +
        "- fire elementals and evil eyes now only partially pierce target's armor instead of completely ignoring it\n" +
        "\n" +
        "- imps now deal physical damage and don't have fire resistance anymore\n" +
        "\n" +
        "- imps now will steal random amount of stackable items instead of the full stack\n" +
        "\n" +
        "ITEMS & SHOPS\n" +
        "\n" +
        "- ankhs now weaken curses on all of your items on activation\n" +
        "\n" +
        "- waterskins now can be used to wash away caustic ooze and douze burning effct on self\n" +
        "\n" +
        "- potions of Mending now heal 25% of health immediately\n" +
        "\n" +
        "- base duration of the effect of potions of Mending decreased to 15 turns instead of 20\n" +
        "\n" +
        "- base duration of effect of potions of Levitation increased to 20 turns (from 15 turns)\n" +
        "\n" +
        "- first four shops will not sell same repair tools in stock\n" +
        "\n" +
        "- first four shops will not have more than two of the same type of ammunition in stock\n" +
        "\n" +
        "RANGED WEAPONS\n" +
        "\n" +
        "- flintlock weapons now can be reloaded while moving\n" +
        "\n" +
        "- fixed issue with flintlock weapons being almost unable to deal sneak attacks\n" +
        "\n" +
        "- trying to shoot from a non-loaded flintlock weapon now will reload it instead of showing a warning\n" +
        "\n" +
        "- increased durability of ranged weapons\n" +
        "\n" +
        "- decreased price modifier when purchasing throwing weapons and ammunitions in shops\n" +
        "\n" +
        "- rebalanced amount of throwing weapons and ammunitions when generated in a wrong chapter\n" +
        "\n" +
        "WANDS & RINGS\n" +
        "\n" +
        "- wands of Disintegration/Firebolt do not completely ignore target's armor class anymore\n" +
        "\n" +
        "- wand of Entanglement is twice as effective now\n" +
        "\n" +
        "- rings of Perception were renamed into rings of Awareness and now affect bonus damage from counter attacks instead of view distance\n" +
        "\n" +
        "- rings of Energy were renamed into rings of Concentration and now increase mind resistance chance instead of enchantment's proc chance\n" +
        "\n" +
        "- rings of Sorcery now affect enchantment's proc chance instead of wand's miscast/squeeze chance\n" +
        "\n" +
        "- rings of Protection do not affect your mind and body resistance chance anymore\n" +
        "\n" +
        "SCROLLS\n" +
        "\n" +
        "- scrolls are now affected by your Magic skill instead of Willpower\n" +
        "\n" +
        "- scrolls of Challenge will not affect passive animated statues \n" +
        "\n" +
        "- scrolls of Enchantment now can be used to transmute fully upgraded rings/wands into another ones\n" +
        "\n" +
        "- scrolls of Torment are more powerful and reliable now, but their radius of effect is limited\n" +
        "\n" +
        "- scrolls of Transmutation can be used on ammunition and throwing weapons\n" +
        "\n" +
        "- scrolls of Transmutation should be way more useful now\n" +
        "\n" +
        "GENERAL\n" +
        "\n" +
        "- added confirmation window when trying to step on a revealed trap\n" +
        "\n" +
        "- added confirmation window when trying to equip obviously cursed item\n" +
        "\n" +
        "- added confirmation window when trying to drink water while your health is greater than 50%\n" +
        "\n" +
        "- added new lore about winners of The Impossible Contest into the game ;)\n" +
        "\n" +
        "- lots of tweaks, bugfixes and minor visual improvements";

	private BitmapText txtTitle;
	private ScrollPane list;

	public WndChangelog() {
		
		super();
		
		if (YetAnotherPixelDungeon.landscape()) {
			resize( WIDTH_L, HEIGHT_L );
		} else {
			resize( WIDTH_P, HEIGHT_P );
		}
		
		txtTitle = PixelScene.createText( TXT_TITLE, 9 );
		txtTitle.hardlight( Window.TITLE_COLOR );
		txtTitle.measure();
        txtTitle.x = PixelScene.align( PixelScene.uiCamera, (width - txtTitle.width()) / 2 );
		add( txtTitle );

		list = new ScrollPane( new ChangelogItem( TXT_DESCR, width ) );
        add( list );

        list.setRect( 0, txtTitle.height(), width, height - txtTitle.height() );
        list.scrollTo( 0, 0 );
	}

    private static class ChangelogItem extends Component {

        private final int GAP = 4;
        private BitmapTextMultiline label;

        public ChangelogItem( String text, int width ) {
            super();

            label.text( text );
            label.maxWidth = width;
            label.measure();

            height = label.height() + GAP;
        }

        @Override
        protected void createChildren() {
            label = PixelScene.createMultiline( 5 );
            add( label );
        }

        @Override
        protected void layout() {
            label.y = PixelScene.align( y + GAP );
        }
    }
}
