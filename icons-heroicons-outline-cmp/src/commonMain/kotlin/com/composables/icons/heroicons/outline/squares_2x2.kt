package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Squares2x2: ImageVector
    get() {
        if (_Squares2x2 != null) return _Squares2x2!!
        
        _Squares2x2 = ImageVector.Builder(
            name = "squares-2x2",
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
                moveTo(3.75f, 6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6f, 3.75f)
                horizontalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 10.5f, 6f)
                verticalLineToRelative(2.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineTo(6f)
                close()
                moveTo(3.75f, 15.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6f, 13.5f)
                horizontalLineToRelative(2.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.75f, 18f)
                verticalLineToRelative(-2.25f)
                close()
                moveTo(13.5f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 20.25f, 6f)
                verticalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 10.5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineTo(6f)
                close()
                moveTo(13.5f, 15.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 20.25f)
                horizontalLineToRelative(-2.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13.5f, 18f)
                verticalLineToRelative(-2.25f)
                close()
            }
        }.build()
        
        return _Squares2x2!!
    }

private var _Squares2x2: ImageVector? = null

