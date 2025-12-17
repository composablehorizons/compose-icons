package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FlagUsa: ImageVector
    get() {
        if (_FlagUsa != null) return _FlagUsa!!
        
        _FlagUsa = ImageVector.Builder(
            name = "flag-usa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 0f)
                curveTo(14.3f, 0f, 0f, 14.3f, 0f, 32f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(32f)
                curveTo(64f, 14.3f, 49.7f, 0f, 32f, 0f)
                close()
                moveToRelative(267.9f, 303.6f)
                curveToRelative(-57.2f, -15.1f, -111.7f, -28.8f, -203.9f, 11.1f)
                verticalLineTo(384f)
                curveToRelative(185.7f, -92.2f, 221.7f, 53.3f, 397.5f, -23.1f)
                curveToRelative(11.4f, -5f, 18.5f, -16.5f, 18.5f, -28.8f)
                verticalLineToRelative(-36f)
                curveToRelative(-43.6f, 17.3f, -80.2f, 24.1f, -112.1f, 24.1f)
                curveToRelative(-37.4f, -0.1f, -68.9f, -8.4f, -100f, -16.6f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(-57.2f, -15.1f, -111.7f, -28.8f, -203.9f, 11.1f)
                verticalLineToRelative(61.5f)
                curveToRelative(94.8f, -37.6f, 154.6f, -22.7f, 212.1f, -7.6f)
                curveToRelative(57.2f, 15.1f, 111.7f, 28.8f, 203.9f, -11.1f)
                verticalLineTo(200f)
                curveToRelative(-43.6f, 17.3f, -80.2f, 24.1f, -112.1f, 24.1f)
                curveToRelative(-37.4f, 0f, -68.9f, -8.3f, -100f, -16.5f)
                close()
                moveToRelative(9.5f, -125.9f)
                curveToRelative(51.8f, 15.6f, 97.4f, 29f, 202.6f, -20.1f)
                verticalLineTo(30.8f)
                curveToRelative(0f, -25.1f, -26.8f, -38.1f, -49.4f, -26.6f)
                curveTo(291.3f, 91.5f, 305.4f, -62.2f, 96f, 32.4f)
                verticalLineToRelative(151.9f)
                curveToRelative(94.8f, -37.5f, 154.6f, -22.7f, 212.1f, -7.6f)
                curveToRelative(57.2f, 15f, 111.7f, 28.7f, 203.9f, -11.1f)
                verticalLineTo(96.7f)
                curveToRelative(-53.6f, 23.5f, -93.3f, 31.4f, -126.1f, 31.4f)
                reflectiveCurveToRelative(-59f, -7.8f, -85.7f, -15.9f)
                curveToRelative(-4f, -1.2f, -8.1f, -2.4f, -12.1f, -3.5f)
                verticalLineTo(75.5f)
                curveToRelative(7.2f, 2f, 14.3f, 4.1f, 21.3f, 6.2f)
                close()
                moveTo(160f, 128.1f)
                curveToRelative(-8.8f, 0f, -16f, -7.1f, -16f, -16f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.1f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
                moveToRelative(0f, -55.8f)
                curveToRelative(-8.8f, 0f, -16f, -7.1f, -16f, -16f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.1f, 16f, 16f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                close()
                moveToRelative(64f, 47.9f)
                curveToRelative(-8.8f, 0f, -16f, -7.1f, -16f, -16f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.1f, 16f, 16f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                close()
                moveToRelative(0f, -55.9f)
                curveToRelative(-8.8f, 0f, -16f, -7.1f, -16f, -16f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.1f, 16f, 16f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _FlagUsa!!
    }

private var _FlagUsa: ImageVector? = null

