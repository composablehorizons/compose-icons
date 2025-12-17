package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipStartCircle: ImageVector
    get() {
        if (_SkipStartCircle != null) return _SkipStartCircle!!
        
        _SkipStartCircle = ImageVector.Builder(
            name = "skip-start-circle",
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
                moveTo(9.71f, 5.093f)
                lineTo(7f, 7.028f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(8.972f)
                lineToRelative(2.71f, 1.935f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.79f, -0.407f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.79f, -0.407f)
            }
        }.build()
        
        return _SkipStartCircle!!
    }

private var _SkipStartCircle: ImageVector? = null

