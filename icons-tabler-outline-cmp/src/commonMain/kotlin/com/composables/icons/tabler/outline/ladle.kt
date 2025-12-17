package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ladle: ImageVector
    get() {
        if (_Ladle != null) return _Ladle!!
        
        _Ladle = ImageVector.Builder(
            name = "ladle",
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
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
                arcToRelative(6f, 6f, 0f, true, false, 12f, 0f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16f)
                curveToRelative(-0.663f, 0f, -1.3f, -0.036f, -1.896f, -0.102f)
                lineToRelative(-0.5f, -0.064f)
                curveToRelative(-2.123f, -0.308f, -3.604f, -1.013f, -3.604f, -1.834f)
                curveToRelative(0f, -0.82f, 1.482f, -1.526f, 3.603f, -1.834f)
                lineToRelative(0.5f, -0.064f)
                arcToRelative(17.27f, 17.27f, 0f, false, true, 1.897f, -0.102f)
                curveToRelative(0.663f, 0f, 1.3f, 0.036f, 1.896f, 0.102f)
                lineToRelative(0.5f, 0.064f)
                curveToRelative(2.123f, 0.308f, 3.604f, 1.013f, 3.604f, 1.834f)
                curveToRelative(0f, 0.82f, -1.482f, 1.526f, -3.603f, 1.834f)
                lineToRelative(-0.5f, 0.064f)
                arcToRelative(17.27f, 17.27f, 0f, false, true, -1.897f, 0.102f)
                close()
            }
        }.build()
        
        return _Ladle!!
    }

private var _Ladle: ImageVector? = null

