package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkX: ImageVector
    get() {
        if (_BookmarkX != null) return _BookmarkX!!
        
        _BookmarkX = ImageVector.Builder(
            name = "bookmark-x",
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
                moveTo(6.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(7.293f, 7f)
                lineTo(6.146f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(8f, 7.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, -0.708f)
                lineTo(8.707f, 7f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8f, 6.293f)
                close()
            }
        }.build()
        
        return _BookmarkX!!
    }

private var _BookmarkX: ImageVector? = null

