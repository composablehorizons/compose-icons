package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Melon: ImageVector
    get() {
        if (_Melon != null) return _Melon!!
        
        _Melon = ImageVector.Builder(
            name = "melon",
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
                moveTo(20f, 10f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                arcToRelative(9.967f, 9.967f, 0f, false, true, -6.984f, -2.842f)
                lineToRelative(4.343f, -4.153f)
                arcToRelative(4f, 4f, 0f, false, false, 5.76f, -5.51f)
                lineToRelative(4.342f, -4.153f)
                arcToRelative(9.963f, 9.963f, 0f, false, true, 2.539f, 6.658f)
                close()
            }
        }.build()
        
        return _Melon!!
    }

private var _Melon: ImageVector? = null

