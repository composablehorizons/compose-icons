package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.RewindCircle: ImageVector
    get() {
        if (_RewindCircle != null) return _RewindCircle!!
        
        _RewindCircle = ImageVector.Builder(
            name = "rewind-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.729f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.52f, 0.038f)
                lineToRelative(-3.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.814f)
                lineToRelative(3.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 8f, 10.5f)
                verticalLineTo(8.614f)
                lineToRelative(3.21f, 2.293f)
                arcTo(0.5f, 0.5f, 0f, false, false, 12f, 10.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.79f, -0.407f)
                lineTo(8f, 7.386f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.271f, -0.445f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
            }
        }.build()
        
        return _RewindCircle!!
    }

private var _RewindCircle: ImageVector? = null

