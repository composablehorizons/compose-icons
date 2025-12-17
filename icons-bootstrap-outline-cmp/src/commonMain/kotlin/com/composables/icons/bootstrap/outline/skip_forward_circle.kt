package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SkipForwardCircle: ImageVector
    get() {
        if (_SkipForwardCircle != null) return _SkipForwardCircle!!
        
        _SkipForwardCircle = ImageVector.Builder(
            name = "skip-forward-circle",
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
                lineTo(7.5f, 7.028f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.79f, -0.407f)
                lineTo(11f, 7.028f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8.972f)
                lineToRelative(-2.71f, 1.935f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.79f, -0.407f)
                verticalLineTo(8.972f)
                lineToRelative(-2.71f, 1.935f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 10.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.271f, -0.445f)
            }
        }.build()
        
        return _SkipForwardCircle!!
    }

private var _SkipForwardCircle: ImageVector? = null

