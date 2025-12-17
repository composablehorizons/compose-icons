package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlertSquareRoundedOff: ImageVector
    get() {
        if (_AlertSquareRoundedOff != null) return _AlertSquareRoundedOff!!
        
        _AlertSquareRoundedOff = ImageVector.Builder(
            name = "alert-square-rounded-off",
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
                moveTo(19.201f, 19.199f)
                curveToRelative(-1.35f, 1.35f, -3.6f, 1.801f, -7.201f, 1.801f)
                curveToRelative(-7.2f, 0f, -9f, -1.8f, -9f, -9f)
                curveToRelative(0f, -3.598f, 0.45f, -5.847f, 1.797f, -7.197f)
                moveToRelative(2.626f, -1.376f)
                curveToRelative(1.204f, -0.307f, 2.709f, -0.427f, 4.577f, -0.427f)
                curveToRelative(7.2f, 0f, 9f, 1.8f, 9f, 9f)
                curveToRelative(0f, 1.865f, -0.12f, 3.367f, -0.425f, 4.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
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
        
        return _AlertSquareRoundedOff!!
    }

private var _AlertSquareRoundedOff: ImageVector? = null

