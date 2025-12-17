package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLeftEndOnRectangle: ImageVector
    get() {
        if (_ArrowLeftEndOnRectangle != null) return _ArrowLeftEndOnRectangle!!
        
        _ArrowLeftEndOnRectangle = ImageVector.Builder(
            name = "arrow-left-end-on-rectangle",
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
                moveTo(12f, 9f)
                lineToRelative(-3f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 3f)
                moveToRelative(-3f, -3f)
                horizontalLineToRelative(12.75f)
            }
        }.build()
        
        return _ArrowLeftEndOnRectangle!!
    }

private var _ArrowLeftEndOnRectangle: ImageVector? = null

