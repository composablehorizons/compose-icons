package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GrinWink: ImageVector
    get() {
        if (_GrinWink != null) return _GrinWink!!
        
        _GrinWink = ImageVector.Builder(
            name = "grin-wink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 256f)
                curveToRelative(0f, 137f, 111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                reflectiveCurveTo(0f, 119f, 0f, 256f)
                close()
                moveToRelative(200f, -48f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                close()
                moveToRelative(168f, 25f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(288f, 233f)
                curveToRelative(-8.3f, 7.4f, -21.6f, 0.4f, -19.8f, -10.8f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(384f, 197f, 388f, 222.2f)
                curveToRelative(1.6f, 11f, -11.5f, 18.2f, -20f, 10.8f)
                close()
                moveToRelative(-243.1f, 87.8f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.3f, -3.7f, 22.6f, 6f, 20.7f, 17.9f)
                curveToRelative(-9.2f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                reflectiveCurveToRelative(-134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.9f, 9.3f, -21.6f, 20.7f, -17.9f)
                close()
            }
        }.build()
        
        return _GrinWink!!
    }

private var _GrinWink: ImageVector? = null

