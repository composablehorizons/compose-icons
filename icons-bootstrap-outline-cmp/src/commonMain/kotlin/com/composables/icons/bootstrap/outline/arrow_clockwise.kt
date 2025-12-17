package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowClockwise: ImageVector
    get() {
        if (_ArrowClockwise != null) return _ArrowClockwise!!
        
        _ArrowClockwise = ImageVector.Builder(
            name = "arrow-clockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(5f, 5f, 0f, true, false, 4.546f, 2.914f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.908f, -0.417f)
                arcTo(6f, 6f, 0f, true, true, 8f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4.466f)
                verticalLineTo(0.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineTo(8.41f, 4.658f)
                arcTo(0.25f, 0.25f, 0f, false, true, 8f, 4.466f)
            }
        }.build()
        
        return _ArrowClockwise!!
    }

private var _ArrowClockwise: ImageVector? = null

