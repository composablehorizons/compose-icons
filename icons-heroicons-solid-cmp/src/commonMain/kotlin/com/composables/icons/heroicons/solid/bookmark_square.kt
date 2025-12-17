package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BookmarkSquare: ImageVector
    get() {
        if (_BookmarkSquare != null) return _BookmarkSquare!!
        
        _BookmarkSquare = ImageVector.Builder(
            name = "bookmark-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(6f)
                close()
                moveToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.085f, 0.67f)
                lineTo(12f, 15.089f)
                lineToRelative(4.165f, 2.083f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.085f, -0.671f)
                verticalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.build()
        
        return _BookmarkSquare!!
    }

private var _BookmarkSquare: ImageVector? = null

