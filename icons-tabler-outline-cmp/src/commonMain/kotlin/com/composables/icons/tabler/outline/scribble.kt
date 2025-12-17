package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Scribble: ImageVector
    get() {
        if (_Scribble != null) return _Scribble!!
        
        _Scribble = ImageVector.Builder(
            name = "scribble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 15f)
                curveToRelative(2f, 3f, 4f, 4f, 7f, 4f)
                reflectiveCurveToRelative(7f, -3f, 7f, -7f)
                reflectiveCurveToRelative(-3f, -7f, -6f, -7f)
                reflectiveCurveToRelative(-5f, 1.5f, -5f, 4f)
                reflectiveCurveToRelative(2f, 5f, 6f, 5f)
                reflectiveCurveToRelative(8.408f, -2.453f, 10f, -5f)
            }
        }.build()
        
        return _Scribble!!
    }

private var _Scribble: ImageVector? = null

