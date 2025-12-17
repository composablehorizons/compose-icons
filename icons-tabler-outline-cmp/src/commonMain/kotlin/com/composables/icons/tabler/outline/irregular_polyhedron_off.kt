package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.IrregularPolyhedronOff: ImageVector
    get() {
        if (_IrregularPolyhedronOff != null) return _IrregularPolyhedronOff!!
        
        _IrregularPolyhedronOff = ImageVector.Builder(
            name = "irregular-polyhedron-off",
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
                moveTo(4.706f, 4.73f)
                arcToRelative(1f, 1f, 0f, false, false, -0.458f, 1.14f)
                lineToRelative(1.752f, 6.13f)
                lineToRelative(-1.752f, 6.13f)
                arcToRelative(1f, 1f, 0f, false, false, 0.592f, 1.205f)
                lineToRelative(6.282f, 2.503f)
                arcToRelative(2.46f, 2.46f, 0f, false, false, 1.756f, 0f)
                lineToRelative(6.282f, -2.503f)
                curveToRelative(0.04f, -0.016f, 0.079f, -0.035f, 0.116f, -0.055f)
                moveToRelative(-0.474f, -4.474f)
                lineToRelative(-0.802f, -2.806f)
                lineToRelative(1.752f, -6.13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.592f, -1.205f)
                lineToRelative(-6.282f, -2.503f)
                arcToRelative(2.46f, 2.46f, 0f, false, false, -1.756f, 0f)
                lineToRelative(-3.544f, 1.412f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 5.5f)
                curveToRelative(0.661f, 0.214f, 1.161f, 0.38f, 1.5f, 0.5f)
                moveToRelative(6f, 2f)
                curveToRelative(0.29f, -0.003f, 0.603f, -0.06f, 0.878f, -0.17f)
                lineToRelative(6.622f, -2.33f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                lineToRelative(5.21f, 1.862f)
                arcToRelative(2.34f, 2.34f, 0f, false, false, 1.58f, 0f)
                lineToRelative(0.742f, -0.265f)
                moveToRelative(2.956f, -1.057f)
                curveToRelative(0.312f, -0.11f, 0.816f, -0.291f, 1.512f, -0.54f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineToRelative(-10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _IrregularPolyhedronOff!!
    }

private var _IrregularPolyhedronOff: ImageVector? = null

