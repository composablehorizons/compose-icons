package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Moon: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(0.132f, 0f, 0.263f, 0f, 0.393f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 7.92f, 12.446f)
                arcToRelative(9f, 9f, 0f, true, true, -8.313f, -12.454f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

