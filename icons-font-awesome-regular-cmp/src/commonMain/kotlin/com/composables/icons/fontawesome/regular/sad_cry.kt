package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.SadCry: ImageVector
    get() {
        if (_SadCry != null) return _SadCry!!
        
        _SadCry = ImageVector.Builder(
            name = "sad-cry",
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
                moveToRelative(144f, 386.4f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.2f, -10.8f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.8f, -24f, 24f)
                verticalLineToRelative(151.4f)
                curveTo(315.5f, 447f, 282.8f, 456f, 248f, 456f)
                reflectiveCurveToRelative(-67.5f, -9f, -96f, -24.6f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.2f, -10.8f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.8f, -24f, 24f)
                verticalLineToRelative(114.4f)
                curveToRelative(-34.6f, -36f, -56f, -84.7f, -56f, -138.4f)
                curveToRelative(0f, -110.3f, 89.7f, -200f, 200f, -200f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                curveToRelative(0f, 53.7f, -21.4f, 102.5f, -56f, 138.4f)
                close()
                moveTo(205.8f, 234.5f)
                curveToRelative(4.4f, -2.4f, 6.9f, -7.4f, 6.1f, -12.4f)
                curveToRelative(-4f, -25.2f, -34.2f, -42.1f, -59.8f, -42.1f)
                reflectiveCurveToRelative(-55.9f, 16.9f, -59.8f, 42.1f)
                curveToRelative(-0.8f, 5f, 1.7f, 10f, 6.1f, 12.4f)
                curveToRelative(4.4f, 2.4f, 9.9f, 1.8f, 13.7f, -1.6f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61f, 0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(2.5f, 2.3f, 7.9f, 4.8f, 13.7f, 1.6f)
                close()
                moveTo(344f, 180f)
                curveToRelative(-25.7f, 0f, -55.9f, 16.9f, -59.8f, 42.1f)
                curveToRelative(-0.8f, 5f, 1.7f, 10f, 6.1f, 12.4f)
                curveToRelative(4.5f, 2.4f, 9.9f, 1.8f, 13.7f, -1.6f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61f, 0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(2.5f, 2.2f, 8f, 4.7f, 13.7f, 1.6f)
                curveToRelative(4.4f, -2.4f, 6.9f, -7.4f, 6.1f, -12.4f)
                curveToRelative(-3.9f, -25.2f, -34.1f, -42.1f, -59.8f, -42.1f)
                close()
                moveToRelative(-96f, 92f)
                curveToRelative(-30.9f, 0f, -56f, 28.7f, -56f, 64f)
                reflectiveCurveToRelative(25.1f, 64f, 56f, 64f)
                reflectiveCurveToRelative(56f, -28.7f, 56f, -64f)
                reflectiveCurveToRelative(-25.1f, -64f, -56f, -64f)
                close()
            }
        }.build()
        
        return _SadCry!!
    }

private var _SadCry: ImageVector? = null

