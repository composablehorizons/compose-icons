package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandHoldingWater: ImageVector
    get() {
        if (_HandHoldingWater != null) return _HandHoldingWater!!
        
        _HandHoldingWater = ImageVector.Builder(
            name = "hand-holding-water",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 256f)
                curveToRelative(53f, 0f, 96f, -42.1f, 96f, -94f)
                curveToRelative(0f, -40f, -57.1f, -120.7f, -83.2f, -155.6f)
                curveToRelative(-6.4f, -8.5f, -19.2f, -8.5f, -25.6f, 0f)
                curveTo(249.1f, 41.3f, 192f, 122f, 192f, 162f)
                curveToRelative(0f, 51.9f, 43f, 94f, 96f, 94f)
                close()
                moveToRelative(277.3f, 72.1f)
                curveToRelative(-11.8f, -10.7f, -30.2f, -10f, -42.6f, 0f)
                lineTo(430.3f, 402f)
                curveToRelative(-11.3f, 9.1f, -25.4f, 14f, -40f, 14f)
                horizontalLineTo(272f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(78.3f)
                curveToRelative(15.9f, 0f, 30.7f, -10.9f, 33.3f, -26.6f)
                curveToRelative(3.3f, -20f, -12.1f, -37.4f, -31.6f, -37.4f)
                horizontalLineTo(192f)
                curveToRelative(-27f, 0f, -53.1f, 9.3f, -74.1f, 26.3f)
                lineTo(71.4f, 384f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(356.8f)
                curveToRelative(14.5f, 0f, 28.6f, -4.9f, 40f, -14f)
                lineTo(564f, 377f)
                curveToRelative(15.2f, -12.1f, 16.4f, -35.3f, 1.3f, -48.9f)
                close()
            }
        }.build()
        
        return _HandHoldingWater!!
    }

private var _HandHoldingWater: ImageVector? = null

