package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronDoubleRight: ImageVector
    get() {
        if (_ChevronDoubleRight != null) return _ChevronDoubleRight!!
        
        _ChevronDoubleRight = ImageVector.Builder(
            name = "chevron-double-right",
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
                moveTo(5.25f, 4.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
                moveToRelative(6f, -15f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
            }
        }.build()
        
        return _ChevronDoubleRight!!
    }

private var _ChevronDoubleRight: ImageVector? = null

