package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
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
                moveTo(21.752f, 15.002f)
                arcTo(9.72f, 9.72f, 0f, false, true, 18f, 15.75f)
                curveToRelative(-5.385f, 0f, -9.75f, -4.365f, -9.75f, -9.75f)
                curveToRelative(0f, -1.33f, 0.266f, -2.597f, 0.748f, -3.752f)
                arcTo(9.753f, 9.753f, 0f, false, false, 3f, 11.25f)
                curveTo(3f, 16.635f, 7.365f, 21f, 12.75f, 21f)
                arcToRelative(9.753f, 9.753f, 0f, false, false, 9.002f, -5.998f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

