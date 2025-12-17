package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Whirl: ImageVector
    get() {
        if (_Whirl != null) return _Whirl!!
        
        _Whirl = ImageVector.Builder(
            name = "whirl",
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
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                curveToRelative(-3.314f, 0f, -6f, -2.462f, -6f, -5.5f)
                reflectiveCurveToRelative(2.686f, -5.5f, 6f, -5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveToRelative(0f, 3.314f, -2.462f, 6f, -5.5f, 6f)
                reflectiveCurveToRelative(-5.5f, -2.686f, -5.5f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                curveToRelative(3.314f, 0f, 6f, -2.462f, 6f, -5.5f)
                reflectiveCurveToRelative(-2.686f, -5.5f, -6f, -5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                curveToRelative(0f, -3.314f, -2.462f, -6f, -5.5f, -6f)
                reflectiveCurveToRelative(-5.5f, 2.686f, -5.5f, 6f)
            }
        }.build()
        
        return _Whirl!!
    }

private var _Whirl: ImageVector? = null

