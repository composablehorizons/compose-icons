package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Alpha: ImageVector
    get() {
        if (_Alpha != null) return _Alpha!!
        
        _Alpha = ImageVector.Builder(
            name = "alpha",
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
                moveTo(18.1f, 6f)
                curveToRelative(-1.1f, 2.913f, -1.9f, 4.913f, -2.4f, 6f)
                curveToRelative(-1.879f, 4.088f, -3.713f, 6f, -6f, 6f)
                curveToRelative(-2.4f, 0f, -4.8f, -2.4f, -4.8f, -6f)
                reflectiveCurveToRelative(2.4f, -6f, 4.8f, -6f)
                curveToRelative(2.267f, 0f, 4.135f, 1.986f, 6f, 6f)
                curveToRelative(0.512f, 1.102f, 1.312f, 3.102f, 2.4f, 6f)
            }
        }.build()
        
        return _Alpha!!
    }

private var _Alpha: ImageVector? = null

