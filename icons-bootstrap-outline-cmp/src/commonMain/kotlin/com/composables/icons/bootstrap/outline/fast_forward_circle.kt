package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FastForwardCircle: ImageVector
    get() {
        if (_FastForwardCircle != null) return _FastForwardCircle!!
        
        _FastForwardCircle = ImageVector.Builder(
            name = "fast-forward-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.271f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.52f, 0.038f)
                lineTo(8f, 7.386f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.79f, -0.407f)
                lineToRelative(3.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.814f)
                lineToRelative(-3.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 10.5f)
                verticalLineTo(8.614f)
                lineToRelative(-3.21f, 2.293f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 10.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.271f, -0.445f)
            }
        }.build()
        
        return _FastForwardCircle!!
    }

private var _FastForwardCircle: ImageVector? = null

