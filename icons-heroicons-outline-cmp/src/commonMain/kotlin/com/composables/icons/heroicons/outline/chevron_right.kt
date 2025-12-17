package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!
        
        _ChevronRight = ImageVector.Builder(
            name = "chevron-right",
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
                moveTo(8.25f, 4.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
            }
        }.build()
        
        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

