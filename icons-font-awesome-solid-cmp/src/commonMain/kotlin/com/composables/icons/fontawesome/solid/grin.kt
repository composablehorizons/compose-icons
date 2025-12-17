package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Grin: ImageVector
    get() {
        if (_Grin != null) return _Grin!!
        
        _Grin = ImageVector.Builder(
            name = "grin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(80f, 168f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(-160f, 0f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(80f, 256f)
                curveToRelative(-60.6f, 0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2f, -11.8f, 9.3f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200f, 336f, 248f, 336f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.3f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }.build()
        
        return _Grin!!
    }

private var _Grin: ImageVector? = null

