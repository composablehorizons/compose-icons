package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PenOff: ImageVector
    get() {
        if (_PenOff != null) return _PenOff!!
        
        _PenOff = ImageVector.Builder(
            name = "pen-off",
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
                moveTo(10f, 10f)
                lineToRelative(-6.157f, 6.162f)
                arcToRelative(2f, 2f, 0f, false, false, -0.5f, 0.833f)
                lineToRelative(-1.322f, 4.36f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.622f, 0.624f)
                lineToRelative(4.358f, -1.323f)
                arcToRelative(2f, 2f, 0f, false, false, 0.83f, -0.5f)
                lineTo(14f, 13.982f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.829f, 7.172f)
                lineToRelative(4.359f, -4.346f)
                arcToRelative(1f, 1f, 0f, true, true, 3.986f, 3.986f)
                lineToRelative(-4.353f, 4.353f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()
        
        return _PenOff!!
    }

private var _PenOff: ImageVector? = null

