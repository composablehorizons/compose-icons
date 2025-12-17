package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BookmarkSquare: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(16.5f, 3.75f)
                verticalLineTo(16.5f)
                lineTo(12f, 14.25f)
                lineTo(7.5f, 16.5f)
                verticalLineTo(3.75f)
                moveToRelative(9f, 0f)
                horizontalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 20.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 20.25f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.75f, 18f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6f, 3.75f)
                horizontalLineToRelative(1.5f)
                moveToRelative(9f, 0f)
                horizontalLineToRelative(-9f)
            }
        }.build()
        
        return _BookmarkSquare!!
    }

private var _BookmarkSquare: ImageVector? = null

