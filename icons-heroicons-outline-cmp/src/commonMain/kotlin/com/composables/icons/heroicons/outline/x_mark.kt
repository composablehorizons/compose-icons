package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.XMark: ImageVector
    get() {
        if (_XMark != null) return _XMark!!
        
        _XMark = ImageVector.Builder(
            name = "x-mark",
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
                moveTo(6f, 18f)
                lineTo(18f, 6f)
                moveTo(6f, 6f)
                lineToRelative(12f, 12f)
            }
        }.build()
        
        return _XMark!!
    }

private var _XMark: ImageVector? = null

