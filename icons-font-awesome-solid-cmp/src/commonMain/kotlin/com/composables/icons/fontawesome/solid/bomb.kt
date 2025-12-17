package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bomb: ImageVector
    get() {
        if (_Bomb != null) return _Bomb!!
        
        _Bomb = ImageVector.Builder(
            name = "bomb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440.5f, 88.5f)
                lineToRelative(-52f, 52f)
                lineTo(415f, 167f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(-17.4f, 17.4f)
                curveToRelative(11.8f, 26.1f, 18.4f, 55.1f, 18.4f, 85.6f)
                curveToRelative(0f, 114.9f, -93.1f, 208f, -208f, 208f)
                reflectiveCurveTo(0f, 418.9f, 0f, 304f)
                reflectiveCurveTo(93.1f, 96f, 208f, 96f)
                curveToRelative(30.5f, 0f, 59.5f, 6.6f, 85.6f, 18.4f)
                lineTo(311f, 97f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(26.5f, 26.5f)
                lineToRelative(52f, -52f)
                lineToRelative(17.1f, 17f)
                close()
                moveTo(500f, 60f)
                horizontalLineToRelative(-24f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                reflectiveCurveToRelative(5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(24f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                reflectiveCurveToRelative(-5.4f, -12f, -12f, -12f)
                close()
                moveTo(440f, 0f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.4f, 12f, -12f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveToRelative(33.9f, 55f)
                lineToRelative(17f, -17f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineToRelative(-17f, 17f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                curveToRelative(4.8f, 4.7f, 12.4f, 4.7f, 17f, 0f)
                close()
                moveToRelative(-67.8f, 0f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineToRelative(-17f, -17f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(17f, 17f)
                close()
                moveToRelative(67.8f, 34f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(17f, 17f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineToRelative(-17f, -17f)
                close()
                moveTo(112f, 272f)
                curveToRelative(0f, -35.3f, 28.7f, -64f, 64f, -64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                curveToRelative(-52.9f, 0f, -96f, 43.1f, -96f, 96f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                reflectiveCurveToRelative(16f, -7.2f, 16f, -16f)
                close()
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null

