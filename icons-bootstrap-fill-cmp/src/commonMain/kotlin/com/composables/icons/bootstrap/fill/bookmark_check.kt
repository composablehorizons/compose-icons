package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkCheck: ImageVector
    get() {
        if (_BookmarkCheck != null) return _BookmarkCheck!!
        
        _BookmarkCheck = ImageVector.Builder(
            name = "bookmark-check",
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
                moveToRelative(8.854f, -9.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(7.5f, 7.793f)
                lineTo(6.354f, 6.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                close()
            }
        }.build()
        
        return _BookmarkCheck!!
    }

private var _BookmarkCheck: ImageVector? = null

