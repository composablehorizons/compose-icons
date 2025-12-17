package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bars3BottomRight: ImageVector
    get() {
        if (_Bars3BottomRight != null) return _Bars3BottomRight!!
        
        _Bars3BottomRight = ImageVector.Builder(
            name = "bars-3-bottom-right",
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
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(16.5f)
                moveTo(3.75f, 12f)
                horizontalLineToRelative(16.5f)
                moveTo(12f, 17.25f)
                horizontalLineToRelative(8.25f)
            }
        }.build()
        
        return _Bars3BottomRight!!
    }

private var _Bars3BottomRight: ImageVector? = null

