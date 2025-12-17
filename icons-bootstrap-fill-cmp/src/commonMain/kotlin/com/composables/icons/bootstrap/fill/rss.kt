package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Rss: ImageVector
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
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(1.5f, 2.5f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveToRelative(0f, 4f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveToRelative(0.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

