package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
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
                moveTo(3.75f, 13.5f)
                lineToRelative(10.5f, -11.25f)
                lineTo(12f, 10.5f)
                horizontalLineToRelative(8.25f)
                lineTo(9.75f, 21.75f)
                lineTo(12f, 13.5f)
                horizontalLineTo(3.75f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

