package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SkipBackwardCircle: ImageVector
    get() {
        if (_SkipBackwardCircle != null) return _SkipBackwardCircle!!
        
        _SkipBackwardCircle = ImageVector.Builder(
            name = "skip-backward-circle",
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
                moveTo(11.729f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.52f, 0.038f)
                lineTo(8.5f, 7.028f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.79f, -0.407f)
                lineTo(5f, 7.028f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(8.972f)
                lineToRelative(2.71f, 1.935f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.79f, -0.407f)
                verticalLineTo(8.972f)
                lineToRelative(2.71f, 1.935f)
                arcTo(0.5f, 0.5f, 0f, false, false, 12f, 10.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.271f, -0.445f)
            }
        }.build()
        
        return _SkipBackwardCircle!!
    }

private var _SkipBackwardCircle: ImageVector? = null

