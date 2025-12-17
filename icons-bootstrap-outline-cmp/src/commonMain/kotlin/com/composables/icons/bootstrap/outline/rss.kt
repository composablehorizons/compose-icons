package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Rss: ImageVector
    get() {
        if (_Rss != null) return _Rss!!
        
        _Rss = ImageVector.Builder(
            name = "rss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(-3f, -8.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(0f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

