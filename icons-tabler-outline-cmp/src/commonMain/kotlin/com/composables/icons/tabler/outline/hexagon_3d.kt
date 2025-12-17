package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Hexagon3d: ImageVector
    get() {
        if (_Hexagon3d != null) return _Hexagon3d!!
        
        _Hexagon3d = ImageVector.Builder(
            name = "hexagon-3d",
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
                moveTo(19f, 6.844f)
                arcToRelative(2.007f, 2.007f, 0f, false, true, 1f, 1.752f)
                verticalLineToRelative(6.555f)
                curveToRelative(0f, 0.728f, -0.394f, 1.399f, -1.03f, 1.753f)
                lineToRelative(-6f, 3.844f)
                arcToRelative(2f, 2f, 0f, false, true, -1.942f, 0f)
                lineToRelative(-6f, -3.844f)
                arcToRelative(2.007f, 2.007f, 0f, false, true, -1.029f, -1.752f)
                verticalLineToRelative(-6.556f)
                curveToRelative(0f, -0.729f, 0.394f, -1.4f, 1.029f, -1.753f)
                lineToRelative(6f, -3.583f)
                arcToRelative(2.05f, 2.05f, 0f, false, true, 2f, 0f)
                lineToRelative(6f, 3.584f)
                horizontalLineToRelative(-0.03f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16.5f)
                verticalLineToRelative(4.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 7.5f)
                lineToRelative(3.5f, 2.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 10f)
                lineToRelative(4f, -2.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-4f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(4f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16.5f)
                lineToRelative(4f, -2.5f)
                verticalLineToRelative(-4f)
                lineToRelative(-4f, -2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Hexagon3d!!
    }

private var _Hexagon3d: ImageVector? = null

