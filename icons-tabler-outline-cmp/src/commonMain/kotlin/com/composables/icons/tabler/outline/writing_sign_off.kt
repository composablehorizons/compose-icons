package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WritingSignOff: ImageVector
    get() {
        if (_WritingSignOff != null) return _WritingSignOff!!
        
        _WritingSignOff = ImageVector.Builder(
            name = "writing-sign-off",
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
                moveTo(3f, 19f)
                curveToRelative(3.333f, -2f, 5f, -4f, 5f, -6f)
                curveToRelative(0f, -3f, -1f, -3f, -2f, -3f)
                reflectiveCurveToRelative(-2.032f, 1.085f, -2f, 3f)
                curveToRelative(0.034f, 2.048f, 1.658f, 2.877f, 2.5f, 4f)
                curveToRelative(1.5f, 2f, 2.5f, 2.5f, 3.5f, 1f)
                curveToRelative(0.667f, -1f, 1.167f, -1.833f, 1.5f, -2.5f)
                curveToRelative(1f, 2.333f, 2.333f, 3.5f, 4f, 3.5f)
                horizontalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                verticalLineToRelative(1f)
                lineToRelative(2f, 2f)
                lineToRelative(0.5f, -0.5f)
                moveToRelative(1.5f, -2.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.121f, -0.879f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.879f, -2f, 2f)
                verticalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _WritingSignOff!!
    }

private var _WritingSignOff: ImageVector? = null

