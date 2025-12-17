package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bars3BottomLeft: ImageVector
    get() {
        if (_Bars3BottomLeft != null) return _Bars3BottomLeft!!
        
        _Bars3BottomLeft = ImageVector.Builder(
            name = "bars-3-bottom-left",
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
                moveToRelative(-16.5f, 5.25f)
                horizontalLineTo(12f)
            }
        }.build()
        
        return _Bars3BottomLeft!!
    }

private var _Bars3BottomLeft: ImageVector? = null

