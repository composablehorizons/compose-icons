package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BlendingMode: ImageVector
    get() {
        if (_BlendingMode != null) return _BlendingMode!!
        
        _BlendingMode = ImageVector.Builder(
            name = "blending-mode",
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
                lineTo(11.9941f, 9.23145f)
                curveTo(11.8737f, 11.6092f, 9.90766f, 13.5f, 7.5f, 13.5f)
                curveTo(5.01472f, 13.5f, 3f, 11.4853f, 3f, 9f)
                curveTo(3f, 6.5f, 4.5f, 4.25f, 7.5f, 1.5f)
                close()
                moveTo(7.5f, 2.87598f)
                curveTo(5.02773f, 5.27379f, 4f, 7.11234f, 4f, 9f)
                curveTo(4f, 9.28259f, 4.03443f, 9.55712f, 4.09766f, 9.82031f)
                curveTo(5.96219f, 10.2476f, 8.63227f, 7.42971f, 10.9521f, 8.30371f)
                curveTo(10.7246f, 6.65104f, 9.6678f, 4.97848f, 7.5f, 2.87598f)
                close()
            }
        }.build()
        
        return _BlendingMode!!
    }

private var _BlendingMode: ImageVector? = null

