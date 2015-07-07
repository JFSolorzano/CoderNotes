package Procesos.Animacion;

import com.alee.extended.transition.effects.Direction;
import com.alee.extended.transition.effects.blocks.BlocksTransitionEffect;
import com.alee.extended.transition.effects.curtain.CurtainTransitionEffect;
import com.alee.extended.transition.effects.curtain.CurtainType;
import com.alee.extended.transition.effects.fade.FadeTransitionEffect;
import com.alee.extended.transition.effects.slide.SlideTransitionEffect;
import com.alee.extended.transition.effects.zoom.ZoomTransitionEffect;

/**
 *
 * @author JSolorzano
 */
public class Transiciones {
    
    public static FadeTransitionEffect desvanecimiento ()
    {
        FadeTransitionEffect effect = new FadeTransitionEffect ();
        effect.setMinimumSpeed ( 0.03f );
        effect.setSpeed ( 0.1f );
        return effect;
    }

    public static ZoomTransitionEffect zoom ()
    {
        ZoomTransitionEffect effect = new ZoomTransitionEffect ();
        effect.setMinimumSpeed ( 0.03f );
        effect.setSpeed ( 0.1f );
        return effect;
    }

    public static CurtainTransitionEffect cortina ()
    {
        CurtainTransitionEffect effect = new CurtainTransitionEffect ();
        effect.setSpeed ( 2 );
        effect.setSize ( 20 );
        effect.setType ( CurtainType.fade );
        return effect;
    }

    public static CurtainTransitionEffect cortinaLlenado ()
    {
        CurtainTransitionEffect effect = new CurtainTransitionEffect ();
        effect.setSpeed ( 2 );
        effect.setSize ( 40 );
        effect.setType ( CurtainType.fill );
        return effect;
    }

    public static CurtainTransitionEffect cortinaCorredorHorizontal ()
    {
        CurtainTransitionEffect effect = new CurtainTransitionEffect ();
        effect.setSpeed ( 20 );
        effect.setSize ( 20 );
        effect.setType ( CurtainType.slide );
        effect.setDirection ( Direction.horizontal );
        return effect;
    }

    public static CurtainTransitionEffect cortinaCorredorVertical ()
    {
        CurtainTransitionEffect effect = new CurtainTransitionEffect ();
        effect.setSpeed ( 30 );
        effect.setSize ( 20 );
        effect.setType ( CurtainType.slide );
        effect.setDirection ( Direction.vertical );
        return effect;
    }

    public static BlocksTransitionEffect bloqueDesvanecimiento ()
    {
        BlocksTransitionEffect effect = new BlocksTransitionEffect ();
        effect.setSize ( 40 );
        effect.setSpeed ( 4 );
        return effect;
    }

    public static BlocksTransitionEffect bloque ()
    {
        BlocksTransitionEffect effect = new BlocksTransitionEffect ();
        effect.setFade ( false );
        effect.setSize ( 40 );
        effect.setSpeed ( 4 );
        return effect;
    }

    public static SlideTransitionEffect corredorDesvanecimiento ()
    {
        return new SlideTransitionEffect ();
    }

    public static SlideTransitionEffect corrido ()
    {
        SlideTransitionEffect effect = new SlideTransitionEffect ();
        effect.setFade ( false );
        return effect;
    }

    
}
