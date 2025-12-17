package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bookmarks: ImageVector
    get() {
        if (_Bookmarks != null) return _Bookmarks!!
        
        _Bookmarks = ImageVector.Builder(
            name = "bookmarks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.777f, 0.416f)
                lineTo(7f, 13.101f)
                lineToRelative(-4.223f, 2.815f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(10.566f)
                lineToRelative(3.723f, -2.482f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.554f, 0f)
                lineTo(11f, 14.566f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.268f, 1f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(11.768f)
                lineToRelative(0.223f, 0.148f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 13.5f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -1.732f, 1f)
            }
        }.build()
        
        return _Bookmarks!!
    }

private var _Bookmarks: ImageVector? = null

