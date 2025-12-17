package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.LaughWink: ImageVector
    get() {
        if (_LaughWink != null) return _LaughWink!!
        
        _LaughWink = ImageVector.Builder(
            name = "laugh-wink",
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
                moveToRelative(141.4f, 389.4f)
                curveToRelative(-37.8f, 37.8f, -88f, 58.6f, -141.4f, 58.6f)
                reflectiveCurveToRelative(-103.6f, -20.8f, -141.4f, -58.6f)
                curveTo(68.8f, 359.6f, 48f, 309.4f, 48f, 256f)
                reflectiveCurveToRelative(20.8f, -103.6f, 58.6f, -141.4f)
                curveTo(144.4f, 76.8f, 194.6f, 56f, 248f, 56f)
                reflectiveCurveToRelative(103.6f, 20.8f, 141.4f, 58.6f)
                curveToRelative(37.8f, 37.8f, 58.6f, 88f, 58.6f, 141.4f)
                reflectiveCurveToRelative(-20.8f, 103.6f, -58.6f, 141.4f)
                close()
                moveTo(328f, 164f)
                curveToRelative(-25.7f, 0f, -55.9f, 16.9f, -59.9f, 42.1f)
                curveToRelative(-1.7f, 11.2f, 11.5f, 18.2f, 19.8f, 10.8f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61f, 0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(8.5f, 7.4f, 21.6f, 0.3f, 19.8f, -10.8f)
                curveToRelative(-3.8f, -25.2f, -34f, -42.1f, -59.7f, -42.1f)
                close()
                moveToRelative(-160f, 60f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
                moveToRelative(194.4f, 64f)
                horizontalLineTo(133.6f)
                curveToRelative(-8.2f, 0f, -14.5f, 7f, -13.5f, 15f)
                curveToRelative(7.5f, 59.2f, 58.9f, 105f, 121.1f, 105f)
                horizontalLineToRelative(13.6f)
                curveToRelative(62.2f, 0f, 113.6f, -45.8f, 121.1f, -105f)
                curveToRelative(1f, -8f, -5.3f, -15f, -13.5f, -15f)
                close()
            }
        }.build()
        
        return _LaughWink!!
    }

private var _LaughWink: ImageVector? = null

