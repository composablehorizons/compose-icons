package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_ArrowTopRightOnSquare != null) return _ArrowTopRightOnSquare!!
        
        _ArrowTopRightOnSquare = ImageVector.Builder(
            name = "arrow-top-right-on-square",
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
                moveTo(13.5f, 6f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 8.25f)
                verticalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5.25f, 21f)
                horizontalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 18.75f)
                verticalLineTo(10.5f)
                moveToRelative(-10.5f, 6f)
                lineTo(21f, 3f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-5.25f)
                moveTo(21f, 3f)
                verticalLineToRelative(5.25f)
            }
        }.build()
        
        return _ArrowTopRightOnSquare!!
    }

private var _ArrowTopRightOnSquare: ImageVector? = null

