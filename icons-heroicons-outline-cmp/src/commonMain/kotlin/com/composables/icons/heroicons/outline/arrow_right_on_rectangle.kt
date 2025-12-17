package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowRightOnRectangle: ImageVector
    get() {
        if (_ArrowRightOnRectangle != null) return _ArrowRightOnRectangle!!
        
        _ArrowRightOnRectangle = ImageVector.Builder(
            name = "arrow-right-on-rectangle",
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
                moveTo(15.75f, 9f)
                verticalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.5f, 3f)
                horizontalLineToRelative(-6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 7.5f, 21f)
                horizontalLineToRelative(6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(15f)
                moveToRelative(3f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                horizontalLineTo(9f)
            }
        }.build()
        
        return _ArrowRightOnRectangle!!
    }

private var _ArrowRightOnRectangle: ImageVector? = null

