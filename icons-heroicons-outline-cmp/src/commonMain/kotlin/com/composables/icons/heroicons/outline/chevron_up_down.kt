package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) return _ChevronUpDown!!
        
        _ChevronUpDown = ImageVector.Builder(
            name = "chevron-up-down",
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
                moveTo(8.25f, 15f)
                lineTo(12f, 18.75f)
                lineTo(15.75f, 15f)
                moveToRelative(-7.5f, -6f)
                lineTo(12f, 5.25f)
                lineTo(15.75f, 9f)
            }
        }.build()
        
        return _ChevronUpDown!!
    }

private var _ChevronUpDown: ImageVector? = null

