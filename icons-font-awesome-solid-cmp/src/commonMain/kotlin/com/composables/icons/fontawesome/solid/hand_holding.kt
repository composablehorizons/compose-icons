package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandHolding: ImageVector
    get() {
        if (_HandHolding != null) return _HandHolding!!
        
        _HandHolding = ImageVector.Builder(
            name = "hand-holding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(565.3f, 328.1f)
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
        
        return _HandHolding!!
    }

private var _HandHolding: ImageVector? = null

