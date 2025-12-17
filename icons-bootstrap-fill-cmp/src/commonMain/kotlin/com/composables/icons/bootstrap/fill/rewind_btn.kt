package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.RewindBtn: ImageVector
    get() {
        if (_RewindBtn != null) return _RewindBtn!!
        
        _RewindBtn = ImageVector.Builder(
            name = "rewind-btn",
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
                moveToRelative(7.729f, 1.055f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 5.5f)
                verticalLineToRelative(1.886f)
                lineToRelative(3.21f, -2.293f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 5.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.79f, 0.407f)
                lineTo(8f, 8.614f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.79f, 0.407f)
                lineToRelative(-3.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.814f)
                lineToRelative(3.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.519f, -0.038f)
            }
        }.build()
        
        return _RewindBtn!!
    }

private var _RewindBtn: ImageVector? = null

