package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PlayCircle: ImageVector
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(6.79f, 5.093f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 5.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.79f, 0.407f)
                lineToRelative(3.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.814f)
                close()
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

