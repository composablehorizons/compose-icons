package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) return _ChevronDoubleUp!!
        
        _ChevronDoubleUp = ImageVector.Builder(
            name = "chevron-double-up",
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
                moveTo(4.5f, 18.75f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(7.5f, 7.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(4.5f, 12.75f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(7.5f, 7.5f)
            }
        }.build()
        
        return _ChevronDoubleUp!!
    }

private var _ChevronDoubleUp: ImageVector? = null

