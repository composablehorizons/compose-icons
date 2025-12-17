package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BookmarkSquare: ImageVector
    get() {
        if (_BookmarkSquare != null) return _BookmarkSquare!!
        
        _BookmarkSquare = ImageVector.Builder(
            name = "bookmark-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2f, 4.25f)
                verticalLineToRelative(11.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.25f, 18f)
                horizontalLineToRelative(11.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 15.75f)
                verticalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 2f)
                horizontalLineTo(4.25f)
                close()
                moveTo(6f, 13.25f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.064f, 0.681f)
                lineTo(10f, 12.576f)
                lineToRelative(-2.936f, 1.355f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 13.25f)
                close()
            }
        }.build()
        
        return _BookmarkSquare!!
    }

private var _BookmarkSquare: ImageVector? = null

