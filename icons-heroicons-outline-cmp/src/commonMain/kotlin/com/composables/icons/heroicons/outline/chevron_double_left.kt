package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronDoubleLeft: ImageVector
    get() {
        if (_ChevronDoubleLeft != null) return _ChevronDoubleLeft!!
        
        _ChevronDoubleLeft = ImageVector.Builder(
            name = "chevron-double-left",
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
                moveTo(18.75f, 4.5f)
                lineToRelative(-7.5f, 7.5f)
                lineToRelative(7.5f, 7.5f)
                moveToRelative(-6f, -15f)
                lineTo(5.25f, 12f)
                lineToRelative(7.5f, 7.5f)
            }
        }.build()
        
        return _ChevronDoubleLeft!!
    }

private var _ChevronDoubleLeft: ImageVector? = null

