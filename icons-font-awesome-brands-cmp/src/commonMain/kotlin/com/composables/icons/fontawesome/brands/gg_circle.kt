package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GgCircle: ImageVector
    get() {
        if (_GgCircle != null) return _GgCircle!!
        
        _GgCircle = ImageVector.Builder(
            name = "gg-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(257f, 8f)
                curveTo(120f, 8f, 9f, 119f, 9f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(394f, 8f, 257f, 8f)
                close()
                moveToRelative(-49.5f, 374.8f)
                lineTo(81.8f, 257.1f)
                lineToRelative(125.7f, -125.7f)
                lineToRelative(35.2f, 35.4f)
                lineToRelative(-24.2f, 24.2f)
                lineToRelative(-11.1f, -11.1f)
                lineToRelative(-77.2f, 77.2f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(26.6f, -26.6f)
                lineToRelative(-53.1f, -52.9f)
                lineToRelative(24.4f, -24.4f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(-75f, 75.2f)
                close()
                moveToRelative(99f, -2.2f)
                lineToRelative(-35.2f, -35.2f)
                lineToRelative(24.1f, -24.4f)
                lineToRelative(11.1f, 11.1f)
                lineToRelative(77.2f, -77.2f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(-26.5f, 26.5f)
                lineToRelative(53.1f, 52.9f)
                lineToRelative(-24.4f, 24.4f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(75f, -75f)
                lineTo(432.2f, 255f)
                lineTo(306.5f, 380.6f)
                close()
            }
        }.build()
        
        return _GgCircle!!
    }

private var _GgCircle: ImageVector? = null

