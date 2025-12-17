package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Smile: ImageVector
    get() {
        if (_Smile != null) return _Smile!!
        
        _Smile = ImageVector.Builder(
            name = "smile",
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
                moveToRelative(194.8f, 170.2f)
                curveTo(334.3f, 380.4f, 292.5f, 400f, 248f, 400f)
                reflectiveCurveToRelative(-86.3f, -19.6f, -114.8f, -53.8f)
                curveToRelative(-13.6f, -16.3f, 11f, -36.7f, 24.6f, -20.5f)
                curveToRelative(22.4f, 26.9f, 55.2f, 42.2f, 90.2f, 42.2f)
                reflectiveCurveToRelative(67.8f, -15.4f, 90.2f, -42.2f)
                curveToRelative(13.4f, -16.2f, 38.1f, 4.2f, 24.6f, 20.5f)
                close()
            }
        }.build()
        
        return _Smile!!
    }

private var _Smile: ImageVector? = null

