package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Opacity: ImageVector
    get() {
        if (_Opacity != null) return _Opacity!!
        
        _Opacity = ImageVector.Builder(
            name = "opacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.5f)
                curveTo(10.5f, 4.25f, 12f, 6.5f, 12f, 9f)
                curveTo(12f, 11.4853f, 9.98528f, 13.5f, 7.5f, 13.5f)
                curveTo(5.01472f, 13.5f, 3f, 11.4853f, 3f, 9f)
                curveTo(3f, 6.5f, 4.5f, 4.25f, 7.5f, 1.5f)
                close()
                moveTo(7.5f, 2.87598f)
                curveTo(5.02773f, 5.27379f, 4f, 7.11234f, 4f, 9f)
                curveTo(4f, 10.933f, 5.567f, 12.5f, 7.5f, 12.5f)
                curveTo(9.433f, 12.5f, 11f, 10.933f, 11f, 9f)
                curveTo(11f, 7.11234f, 9.97227f, 5.27379f, 7.5f, 2.87598f)
                close()
            }
        }.build()
        
        return _Opacity!!
    }

private var _Opacity: ImageVector? = null

