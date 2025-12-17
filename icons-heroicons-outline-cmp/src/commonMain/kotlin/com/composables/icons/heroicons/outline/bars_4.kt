package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bars4: ImageVector
    get() {
        if (_Bars4 != null) return _Bars4!!
        
        _Bars4 = ImageVector.Builder(
            name = "bars-4",
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
                moveTo(3.75f, 5.25f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
            }
        }.build()
        
        return _Bars4!!
    }

private var _Bars4: ImageVector? = null

