package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkDash: ImageVector
    get() {
        if (_BookmarkDash != null) return _BookmarkDash!!
        
        _BookmarkDash = ImageVector.Builder(
            name = "bookmark-dash",
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
                moveTo(6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _BookmarkDash!!
    }

private var _BookmarkDash: ImageVector? = null

