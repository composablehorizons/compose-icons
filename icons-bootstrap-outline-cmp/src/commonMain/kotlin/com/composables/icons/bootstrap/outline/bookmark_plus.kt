package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BookmarkPlus: ImageVector
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
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.777f, 0.416f)
                lineTo(8f, 13.101f)
                lineToRelative(-5.223f, 2.815f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12.566f)
                lineToRelative(4.723f, -2.482f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.554f, 0f)
                lineTo(13f, 14.566f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 4f)
            }
        }.build()
        
        return _BookmarkPlus!!
    }

private var _BookmarkPlus: ImageVector? = null

