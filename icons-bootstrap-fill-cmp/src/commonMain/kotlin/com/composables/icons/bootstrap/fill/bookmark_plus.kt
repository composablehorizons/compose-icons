package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkPlus: ImageVector
    get() {
        if (_BookmarkPlus != null) return _BookmarkPlus!!
        
        _BookmarkPlus = ImageVector.Builder(
            name = "bookmark-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 15.5f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.74f, 0.439f)
                lineTo(8f, 13.069f)
                lineToRelative(-5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                moveToRelative(6.5f, -11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        
        return _BookmarkPlus!!
    }

private var _BookmarkPlus: ImageVector? = null

