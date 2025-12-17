package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipBackwardBtn: ImageVector
    get() {
        if (_SkipBackwardBtn != null) return _SkipBackwardBtn!!
        
        _SkipBackwardBtn = ImageVector.Builder(
            name = "skip-backward-btn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 12f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                moveToRelative(11.21f, -6.907f)
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
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.79f, -0.407f)
            }
        }.build()
        
        return _SkipBackwardBtn!!
    }

private var _SkipBackwardBtn: ImageVector? = null

