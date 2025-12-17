package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowUturnRight: ImageVector
    get() {
        if (_ArrowUturnRight != null) return _ArrowUturnRight!!
        
        _ArrowUturnRight = ImageVector.Builder(
            name = "arrow-uturn-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15f, 15f)
                lineToRelative(6f, -6f)
                moveToRelative(0f, 0f)
                lineToRelative(-6f, -6f)
                moveToRelative(6f, 6f)
                horizontalLineTo(9f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, 12f)
                horizontalLineToRelative(3f)
            }
        }.build()
        
        return _ArrowUturnRight!!
    }

private var _ArrowUturnRight: ImageVector? = null

