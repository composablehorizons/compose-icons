package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Shield: ImageVector
    get() {
        if (_Shield != null) return _Shield!!
        
        _Shield = ImageVector.Builder(
            name = "shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 7.25f)
                curveTo(9.25f, 7.76258f, 8.94148f, 8.2031f, 8.5f, 8.39599f)
                verticalLineTo(9.50358f)
                curveTo(8.5f, 9.77973f, 8.27614f, 10.0036f, 8f, 10.0036f)
                curveTo(7.72386f, 10.0036f, 7.5f, 9.77973f, 7.5f, 9.50358f)
                verticalLineTo(8.39599f)
                curveTo(7.05852f, 8.2031f, 6.75f, 7.76258f, 6.75f, 7.25f)
                curveTo(6.75f, 6.55964f, 7.30964f, 6f, 8f, 6f)
                curveTo(8.69036f, 6f, 9.25f, 6.55964f, 9.25f, 7.25f)
                close()
                moveTo(7.14309f, 2.04175f)
                curveTo(6.78097f, 2.2883f, 6.21583f, 2.61563f, 5.42482f, 2.91681f)
                curveTo(4.6399f, 3.21566f, 3.90375f, 3.36204f, 3.36353f, 3.43333f)
                curveTo(3.09405f, 3.46889f, 2.87509f, 3.48554f, 2.72547f, 3.49331f)
                curveTo(2.6507f, 3.49719f, 2.5934f, 3.49885f, 2.55593f, 3.49954f)
                lineTo(2.50489f, 3.50003f)
                curveTo(2.37157f, 3.49872f, 2.24323f, 3.55072f, 2.14842f, 3.64449f)
                curveTo(2.05344f, 3.73841f, 2f, 3.86643f, 2f, 4f)
                verticalLineTo(6.75508f)
                curveTo(2f, 9.40779f, 3.4013f, 11.8632f, 5.68525f, 13.2124f)
                lineTo(7.74707f, 14.4305f)
                curveTo(7.90399f, 14.5232f, 8.09891f, 14.5232f, 8.2558f, 14.4304f)
                lineTo(10.3162f, 13.2126f)
                curveTo(12.5993f, 11.8632f, 14f, 9.40823f, 14f, 6.7561f)
                verticalLineTo(4f)
                curveTo(14f, 3.86598f, 13.9462f, 3.73757f, 13.8507f, 3.64358f)
                curveTo(13.7552f, 3.54964f, 13.626f, 3.49794f, 13.4921f, 3.50007f)
                lineTo(13.4421f, 3.49981f)
                curveTo(13.4048f, 3.49928f, 13.3478f, 3.49787f, 13.2735f, 3.49426f)
                curveTo(13.1246f, 3.48705f, 12.9066f, 3.47109f, 12.6384f, 3.43602f)
                curveTo(12.1006f, 3.36573f, 11.3679f, 3.21959f, 10.5869f, 2.91771f)
                curveTo(9.79733f, 2.61248f, 9.22913f, 2.28442f, 8.86335f, 2.03774f)
                curveTo(8.68039f, 1.91435f, 8.54795f, 1.81124f, 8.46371f, 1.74141f)
                curveTo(8.4256f, 1.70981f, 8.38768f, 1.6777f, 8.35191f, 1.64343f)
                curveTo(8.2576f, 1.55073f, 8.13037f, 1.49913f, 7.99807f, 1.50001f)
                curveTo(7.86585f, 1.50089f, 7.73916f, 1.55434f, 7.64611f, 1.64819f)
                lineTo(7.53744f, 1.74536f)
                curveTo(7.45475f, 1.81517f, 7.32423f, 1.91842f, 7.14309f, 2.04175f)
                close()
                moveTo(3f, 6.75508f)
                verticalLineTo(4.47725f)
                curveTo(3.14066f, 4.46608f, 3.30705f, 4.44945f, 3.49436f, 4.42473f)
                curveTo(4.09055f, 4.34605f, 4.90577f, 4.18447f, 5.78065f, 3.85136f)
                curveTo(6.64943f, 3.52057f, 7.28362f, 3.15585f, 7.70588f, 2.86835f)
                curveTo(7.82102f, 2.78996f, 7.92034f, 2.71735f, 8.00434f, 2.65277f)
                curveTo(8.08878f, 2.71677f, 8.18861f, 2.78886f, 8.30421f, 2.86682f)
                curveTo(8.72757f, 3.15233f, 9.362f, 3.51631f, 10.2264f, 3.85045f)
                curveTo(11.0994f, 4.18794f, 11.9134f, 4.34976f, 12.5088f, 4.42759f)
                curveTo(12.6947f, 4.45189f, 12.86f, 4.46809f, 13f, 4.47888f)
                verticalLineTo(6.7561f)
                curveTo(13f, 9.05461f, 11.7861f, 11.1822f, 9.80736f, 12.3518f)
                lineTo(8.00133f, 13.4192f)
                lineTo(6.19388f, 12.3515f)
                curveTo(4.21446f, 11.1821f, 3f, 9.0541f, 3f, 6.75508f)
                close()
            }
        }.build()
        
        return _Shield!!
    }

private var _Shield: ImageVector? = null

