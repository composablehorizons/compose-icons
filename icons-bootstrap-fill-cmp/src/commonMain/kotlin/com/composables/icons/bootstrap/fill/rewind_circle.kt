package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.RewindCircle: ImageVector
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
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveTo(7.729f, 5.055f)
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
        
        return _RewindCircle!!
    }

private var _RewindCircle: ImageVector? = null

