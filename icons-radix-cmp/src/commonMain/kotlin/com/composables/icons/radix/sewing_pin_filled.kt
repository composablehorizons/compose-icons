package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SewingPinFilled: ImageVector
    get() {
        if (_SewingPinFilled != null) return _SewingPinFilled!!
        
        _SewingPinFilled = ImageVector.Builder(
            name = "sewing-pin-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1f)
                curveTo(8.88071f, 1f, 10f, 2.11929f, 10f, 3.5f)
                curveTo(10f, 4.70943f, 9.14105f, 5.71753f, 8f, 5.94922f)
                verticalLineTo(13.5f)
                curveTo(8f, 13.7761f, 7.77614f, 14f, 7.5f, 14f)
                curveTo(7.22386f, 14f, 7f, 13.7761f, 7f, 13.5f)
                verticalLineTo(5.94922f)
                curveTo(5.85895f, 5.71753f, 5f, 4.70943f, 5f, 3.5f)
                curveTo(5f, 2.11929f, 6.11929f, 1f, 7.5f, 1f)
                close()
            }
        }.build()
        
        return _SewingPinFilled!!
    }

private var _SewingPinFilled: ImageVector? = null

