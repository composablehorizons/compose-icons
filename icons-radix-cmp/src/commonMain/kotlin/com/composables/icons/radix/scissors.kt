package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Scissors: ImageVector
    get() {
        if (_Scissors != null) return _Scissors!!
        
        _Scissors = ImageVector.Builder(
            name = "scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.77552f, 9.59498f)
                curveTo(4.88703f, 9.87512f, 4.95032f, 10.1804f, 4.95032f, 10.5002f)
                curveTo(4.95011f, 11.8531f, 3.85302f, 12.9503f, 2.50015f, 12.9504f)
                curveTo(1.1472f, 12.9504f, 0.0501965f, 11.8531f, 0.0499872f, 10.5002f)
                curveTo(0.0499872f, 9.14716f, 1.14707f, 8.05007f, 2.50015f, 8.05007f)
                curveTo(3.17229f, 8.05012f, 3.78109f, 8.32067f, 4.22376f, 8.75905f)
                lineTo(6.42686f, 7.28739f)
                lineTo(6.67979f, 6.38017f)
                curveTo(6.75165f, 6.12313f, 6.92313f, 5.9055f, 7.15635f, 5.77569f)
                lineTo(10.2305f, 4.06477f)
                curveTo(11.4087f, 3.40911f, 12.7079f, 2.99869f, 14.0488f, 2.85775f)
                lineTo(15f, 2.75717f)
                lineTo(4.77552f, 9.59498f)
                close()
                moveTo(15f, 12.2405f)
                lineTo(14.0488f, 12.1399f)
                curveTo(12.7082f, 11.999f, 11.4095f, 11.5883f, 10.2315f, 10.9328f)
                lineTo(7.15635f, 9.22193f)
                curveTo(7.15236f, 9.21971f, 7.14856f, 9.21644f, 7.14463f, 9.21412f)
                lineTo(8.81062f, 8.09988f)
                lineTo(15f, 12.2405f)
                close()
                moveTo(2.50015f, 8.95045f)
                curveTo(1.64412f, 8.95045f, 0.950367f, 9.64421f, 0.950367f, 10.5002f)
                curveTo(0.950576f, 11.3561f, 1.64425f, 12.05f, 2.50015f, 12.05f)
                curveTo(3.35597f, 12.0499f, 4.04973f, 11.356f, 4.04994f, 10.5002f)
                curveTo(4.04994f, 9.64427f, 3.3561f, 8.95056f, 2.50015f, 8.95045f)
                close()
                moveTo(2.50015f, 2.03452f)
                curveTo(3.85314f, 2.03463f, 4.95032f, 3.13167f, 4.95032f, 4.48469f)
                curveTo(4.95029f, 4.80808f, 4.88549f, 5.11608f, 4.77161f, 5.39874f)
                lineTo(5.73742f, 6.04521f)
                lineTo(5.71593f, 6.1126f)
                lineTo(5.56262f, 6.66239f)
                lineTo(5.21008f, 6.89774f)
                lineTo(4.214f, 6.23271f)
                curveTo(3.77206f, 6.66606f, 3.16792f, 6.9348f, 2.50015f, 6.93485f)
                curveTo(1.14714f, 6.93485f, 0.0500929f, 5.83768f, 0.0499872f, 4.48469f)
                curveTo(0.0499872f, 3.13161f, 1.14707f, 2.03452f, 2.50015f, 2.03452f)
                close()
                moveTo(2.50015f, 2.9349f)
                curveTo(1.64412f, 2.9349f, 0.950367f, 3.62866f, 0.950367f, 4.48469f)
                curveTo(0.950472f, 5.34063f, 1.64419f, 6.03447f, 2.50015f, 6.03447f)
                curveTo(3.35603f, 6.03437f, 4.04983f, 5.34056f, 4.04994f, 4.48469f)
                curveTo(4.04994f, 3.62872f, 3.35609f, 2.93501f, 2.50015f, 2.9349f)
                close()
            }
        }.build()
        
        return _Scissors!!
    }

private var _Scissors: ImageVector? = null

