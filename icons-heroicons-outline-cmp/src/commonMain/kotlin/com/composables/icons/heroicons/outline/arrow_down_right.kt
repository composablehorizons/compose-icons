package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) return _ArrowDownRight!!
        
        _ArrowDownRight = ImageVector.Builder(
            name = "arrow-down-right",
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
                moveTo(4.5f, 4.5f)
                lineToRelative(15f, 15f)
                moveToRelative(0f, 0f)
                verticalLineTo(8.25f)
                moveToRelative(0f, 11.25f)
                horizontalLineTo(8.25f)
            }
        }.build()
        
        return _ArrowDownRight!!
    }

private var _ArrowDownRight: ImageVector? = null

