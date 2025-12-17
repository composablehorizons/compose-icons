package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipForwardCircle: ImageVector
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(4.79f, 5.093f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 5.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.79f, 0.407f)
                lineTo(7.5f, 8.972f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.79f, 0.407f)
                lineTo(11f, 8.972f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(1.528f)
                lineTo(8.29f, 5.093f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.79f, 0.407f)
                verticalLineToRelative(1.528f)
                close()
            }
        }.build()
        
        return _SkipForwardCircle!!
    }

private var _SkipForwardCircle: ImageVector? = null

