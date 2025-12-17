package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HexagonalPyramidOff: ImageVector
    get() {
        if (_HexagonalPyramidOff != null) return _HexagonalPyramidOff!!
        
        _HexagonalPyramidOff = ImageVector.Builder(
            name = "hexagonal-pyramid-off",
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
                moveTo(7.877f, 7.88f)
                lineToRelative(-4.56f, 7.53f)
                arcToRelative(1.988f, 1.988f, 0f, false, false, 0.266f, 2.484f)
                lineToRelative(2.527f, 2.523f)
                curveToRelative(0.374f, 0.373f, 0.88f, 0.583f, 1.408f, 0.583f)
                horizontalLineToRelative(8.964f)
                curveToRelative(0.528f, 0f, 1.034f, -0.21f, 1.408f, -0.583f)
                lineToRelative(1.264f, -1.263f)
                moveToRelative(1.792f, -2.205f)
                arcToRelative(1.986f, 1.986f, 0f, false, false, -0.262f, -1.538f)
                lineToRelative(-7.846f, -12.954f)
                arcToRelative(0.996f, 0.996f, 0f, false, false, -1.676f, 0f)
                lineToRelative(-1.772f, 2.926f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                lineToRelative(-1.254f, 4.742f)
                moveToRelative(-0.841f, 3.177f)
                lineToRelative(-2.905f, 10.981f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                lineToRelative(2.153f, 8.14f)
                moveToRelative(1.444f, 5.457f)
                lineToRelative(1.403f, 5.303f)
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
        
        return _HexagonalPyramidOff!!
    }

private var _HexagonalPyramidOff: ImageVector? = null

