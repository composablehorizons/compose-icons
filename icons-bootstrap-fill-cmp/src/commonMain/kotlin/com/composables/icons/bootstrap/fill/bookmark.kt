package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.74f, 0.439f)
                lineTo(8f, 13.069f)
                lineToRelative(5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 15.5f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

