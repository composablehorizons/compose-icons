package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) return _PlayCircle!!
        
        _PlayCircle = ImageVector.Builder(
            name = "play-circle",
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
                moveTo(6.271f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.52f, 0.038f)
                lineToRelative(3.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.814f)
                lineToRelative(-3.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 10.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.271f, -0.445f)
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

