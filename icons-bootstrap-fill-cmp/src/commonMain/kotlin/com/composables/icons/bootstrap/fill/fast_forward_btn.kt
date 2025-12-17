package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FastForwardBtn: ImageVector
    get() {
        if (_FastForwardBtn != null) return _FastForwardBtn!!
        
        _FastForwardBtn = ImageVector.Builder(
            name = "fast-forward-btn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                moveToRelative(4.271f, 1.055f)
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
        
        return _FastForwardBtn!!
    }

private var _FastForwardBtn: ImageVector? = null

