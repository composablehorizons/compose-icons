package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowUpOnSquare: ImageVector
    get() {
        if (_ArrowUpOnSquare != null) return _ArrowUpOnSquare!!
        
        _ArrowUpOnSquare = ImageVector.Builder(
            name = "arrow-up-on-square",
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
                moveTo(9f, 8.25f)
                horizontalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(15f)
                moveToRelative(0f, -3f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, 3f)
                moveToRelative(3f, -3f)
                verticalLineTo(15f)
            }
        }.build()
        
        return _ArrowUpOnSquare!!
    }

private var _ArrowUpOnSquare: ImageVector? = null

