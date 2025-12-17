package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Origami: ImageVector
    get() {
        if (_Origami != null) return _Origami!!
        
        _Origami = ImageVector.Builder(
            name = "origami",
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
                moveTo(12f, 12f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6.297f)
                arcToRelative(1f, 1f, 0f, false, true, 0.651f, 1.759f)
                lineToRelative(-4.696f, 4.025f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                lineToRelative(-7.414f, -7.414f)
                arcTo(2f, 2f, 0f, false, true, 4f, 12.172f)
                verticalLineTo(6.415f)
                arcToRelative(1.002f, 1.002f, 0f, false, true, 1.707f, -0.707f)
                lineTo(20f, 20.009f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.214f, 3.381f)
                lineToRelative(8.414f, 14.966f)
                arcToRelative(1f, 1f, 0f, false, true, -0.167f, 1.199f)
                lineToRelative(-1.168f, 1.163f)
                arcToRelative(1f, 1f, 0f, false, true, -0.706f, 0.291f)
                horizontalLineTo(6.351f)
                arcToRelative(1f, 1f, 0f, false, true, -0.625f, -0.219f)
                lineTo(3.25f, 18.8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.631f, -1.781f)
                lineToRelative(4.165f, 0.027f)
            }
        }.build()
        
        return _Origami!!
    }

private var _Origami: ImageVector? = null

