package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Language: ImageVector
    get() {
        if (_Language != null) return _Language!!
        
        _Language = ImageVector.Builder(
            name = "language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(152.1f, 236.2f)
                curveToRelative(-3.5f, -12.1f, -7.8f, -33.2f, -7.8f, -33.2f)
                horizontalLineToRelative(-0.5f)
                reflectiveCurveToRelative(-4.3f, 21.1f, -7.8f, 33.2f)
                lineToRelative(-11.1f, 37.5f)
                horizontalLineTo(163f)
                close()
                moveTo(616f, 96f)
                horizontalLineTo(336f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(280f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(-24f, 120f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-11.4f)
                curveToRelative(-6.9f, 23.6f, -21.7f, 47.4f, -42.7f, 69.9f)
                curveToRelative(8.4f, 6.4f, 17.1f, 12.5f, 26.1f, 18f)
                curveToRelative(5.5f, 3.4f, 7.3f, 10.5f, 4.1f, 16.2f)
                lineToRelative(-7.9f, 13.9f)
                curveToRelative(-3.4f, 5.9f, -10.9f, 7.8f, -16.7f, 4.3f)
                curveToRelative(-12.6f, -7.8f, -24.5f, -16.1f, -35.4f, -24.9f)
                curveToRelative(-10.9f, 8.7f, -22.7f, 17.1f, -35.4f, 24.9f)
                curveToRelative(-5.8f, 3.5f, -13.3f, 1.6f, -16.7f, -4.3f)
                lineToRelative(-7.9f, -13.9f)
                curveToRelative(-3.2f, -5.6f, -1.4f, -12.8f, 4.2f, -16.2f)
                curveToRelative(9.3f, -5.7f, 18f, -11.7f, 26.1f, -18f)
                curveToRelative(-7.9f, -8.4f, -14.9f, -17f, -21f, -25.7f)
                curveToRelative(-4f, -5.7f, -2.2f, -13.6f, 3.7f, -17.1f)
                lineToRelative(6.5f, -3.9f)
                lineToRelative(7.3f, -4.3f)
                curveToRelative(5.4f, -3.2f, 12.4f, -1.7f, 16f, 3.4f)
                curveToRelative(5f, 7f, 10.8f, 14f, 17.4f, 20.9f)
                curveToRelative(13.5f, -14.2f, 23.8f, -28.9f, 30f, -43.2f)
                horizontalLineTo(412f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(16f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(64f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveTo(0f, 120f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(280f)
                verticalLineTo(96f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                close()
                moveToRelative(58.9f, 216.1f)
                lineTo(116.4f, 167f)
                curveToRelative(1.7f, -4.9f, 6.2f, -8.1f, 11.4f, -8.1f)
                horizontalLineToRelative(32.5f)
                curveToRelative(5.1f, 0f, 9.7f, 3.3f, 11.4f, 8.1f)
                lineToRelative(57.5f, 169.1f)
                curveToRelative(2.6f, 7.8f, -3.1f, 15.9f, -11.4f, 15.9f)
                horizontalLineToRelative(-22.9f)
                arcToRelative(12f, 12f, 0f, false, true, -11.5f, -8.6f)
                lineToRelative(-9.4f, -31.9f)
                horizontalLineToRelative(-60.2f)
                lineToRelative(-9.1f, 31.8f)
                curveToRelative(-1.5f, 5.1f, -6.2f, 8.7f, -11.5f, 8.7f)
                horizontalLineTo(70.3f)
                curveToRelative(-8.2f, 0f, -14f, -8.1f, -11.4f, -15.9f)
                close()
            }
        }.build()
        
        return _Language!!
    }

private var _Language: ImageVector? = null

