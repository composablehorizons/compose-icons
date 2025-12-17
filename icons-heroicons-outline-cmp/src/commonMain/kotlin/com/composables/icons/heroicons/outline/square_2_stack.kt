package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Square2Stack: ImageVector
    get() {
        if (_Square2Stack != null) return _Square2Stack!!
        
        _Square2Stack = ImageVector.Builder(
            name = "square-2-stack",
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
                moveTo(16.5f, 8.25f)
                verticalLineTo(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.75f, 6f)
                verticalLineToRelative(8.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6f, 16.5f)
                horizontalLineToRelative(2.25f)
                moveToRelative(8.25f, -8.25f)
                horizontalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 20.25f)
                horizontalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 8.25f, 18f)
                verticalLineToRelative(-1.5f)
                moveToRelative(8.25f, -8.25f)
                horizontalLineToRelative(-6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _Square2Stack!!
    }

private var _Square2Stack: ImageVector? = null

