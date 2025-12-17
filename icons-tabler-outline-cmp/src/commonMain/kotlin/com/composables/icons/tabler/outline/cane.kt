package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cane: ImageVector
    get() {
        if (_Cane != null) return _Cane!!
        
        _Cane = ImageVector.Builder(
            name = "cane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                lineToRelative(6.324f, -11.69f)
                curveToRelative(0.54f, -0.974f, 1.756f, -4.104f, -1.499f, -5.762f)
                curveToRelative(-3.255f, -1.657f, -5.175f, 0.863f, -5.825f, 2.032f)
            }
        }.build()
        
        return _Cane!!
    }

private var _Cane: ImageVector? = null

