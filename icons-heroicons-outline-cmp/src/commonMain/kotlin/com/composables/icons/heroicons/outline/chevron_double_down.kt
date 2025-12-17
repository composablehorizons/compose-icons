package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronDoubleDown: ImageVector
    get() {
        if (_ChevronDoubleDown != null) return _ChevronDoubleDown!!
        
        _ChevronDoubleDown = ImageVector.Builder(
            name = "chevron-double-down",
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
                moveTo(4.5f, 5.25f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(7.5f, -7.5f)
                moveToRelative(-15f, 6f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(7.5f, -7.5f)
            }
        }.build()
        
        return _ChevronDoubleDown!!
    }

private var _ChevronDoubleDown: ImageVector? = null

