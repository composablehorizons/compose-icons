package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bars2: ImageVector
    get() {
        if (_Bars2 != null) return _Bars2!!
        
        _Bars2 = ImageVector.Builder(
            name = "bars-2",
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
                moveTo(3.75f, 9f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 6.75f)
                horizontalLineToRelative(16.5f)
            }
        }.build()
        
        return _Bars2!!
    }

private var _Bars2: ImageVector? = null

