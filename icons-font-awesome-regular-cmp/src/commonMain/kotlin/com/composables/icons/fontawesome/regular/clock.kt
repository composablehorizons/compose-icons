package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Clock: ImageVector
    get() {
        if (_Clock != null) return _Clock!!
        
        _Clock = ImageVector.Builder(
            name = "clock",
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
                moveToRelative(61.8f, -104.4f)
                lineToRelative(-84.9f, -61.7f)
                curveToRelative(-3.1f, -2.3f, -4.9f, -5.9f, -4.9f, -9.7f)
                verticalLineTo(116f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(32f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(141.7f)
                lineToRelative(66.8f, 48.6f)
                curveToRelative(5.4f, 3.9f, 6.5f, 11.4f, 2.6f, 16.8f)
                lineTo(334.6f, 349f)
                curveToRelative(-3.9f, 5.3f, -11.4f, 6.5f, -16.8f, 2.6f)
                close()
            }
        }.build()
        
        return _Clock!!
    }

private var _Clock: ImageVector? = null

