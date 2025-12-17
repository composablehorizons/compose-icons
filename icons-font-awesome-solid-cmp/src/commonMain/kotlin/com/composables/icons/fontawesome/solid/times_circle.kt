package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TimesCircle: ImageVector
    get() {
        if (_TimesCircle != null) return _TimesCircle!!
        
        _TimesCircle = ImageVector.Builder(
            name = "times-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(121.6f, 313.1f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0f, 17f)
                lineTo(338f, 377.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17f, 0f)
                lineTo(256f, 312f)
                lineToRelative(-65.1f, 65.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17f, 0f)
                lineTo(134.4f, 338f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(65.6f, -65f)
                lineToRelative(-65.6f, -65.1f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(39.6f, -39.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(65f, 65.7f)
                lineToRelative(65.1f, -65.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(39.6f, 39.6f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0f, 17f)
                lineTo(312f, 256f)
                lineToRelative(65.6f, 65.1f)
                close()
            }
        }.build()
        
        return _TimesCircle!!
    }

private var _TimesCircle: ImageVector? = null

