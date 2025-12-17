package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.TimesCircle: ImageVector
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
                moveToRelative(0f, 448f)
                curveToRelative(-110.5f, 0f, -200f, -89.5f, -200f, -200f)
                reflectiveCurveTo(145.5f, 56f, 256f, 56f)
                reflectiveCurveToRelative(200f, 89.5f, 200f, 200f)
                reflectiveCurveToRelative(-89.5f, 200f, -200f, 200f)
                close()
                moveToRelative(101.8f, -262.2f)
                lineTo(295.6f, 256f)
                lineToRelative(62.2f, 62.2f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0f, 17f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17f, 0f)
                lineTo(256f, 295.6f)
                lineToRelative(-62.2f, 62.2f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17f, 0f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(62.2f, -62.2f)
                lineToRelative(-62.2f, -62.2f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(62.2f, 62.2f)
                lineToRelative(62.2f, -62.2f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0f, 17f)
                close()
            }
        }.build()
        
        return _TimesCircle!!
    }

private var _TimesCircle: ImageVector? = null

