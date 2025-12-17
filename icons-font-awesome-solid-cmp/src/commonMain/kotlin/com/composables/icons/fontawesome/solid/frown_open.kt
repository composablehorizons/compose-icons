package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FrownOpen: ImageVector
    get() {
        if (_FrownOpen != null) return _FrownOpen!!
        
        _FrownOpen = ImageVector.Builder(
            name = "frown-open",
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
                moveTo(136f, 208f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                close()
                moveToRelative(187.3f, 183.3f)
                curveToRelative(-31.2f, -9.6f, -59.4f, -15.3f, -75.3f, -15.3f)
                reflectiveCurveToRelative(-44.1f, 5.7f, -75.3f, 15.3f)
                curveToRelative(-11.5f, 3.5f, -22.5f, -6.3f, -20.5f, -18.1f)
                curveToRelative(7f, -40f, 60.1f, -61.2f, 95.8f, -61.2f)
                reflectiveCurveToRelative(88.8f, 21.3f, 95.8f, 61.2f)
                curveToRelative(2f, 11.9f, -9.1f, 21.6f, -20.5f, 18.1f)
                close()
                moveTo(328f, 240f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _FrownOpen!!
    }

private var _FrownOpen: ImageVector? = null

