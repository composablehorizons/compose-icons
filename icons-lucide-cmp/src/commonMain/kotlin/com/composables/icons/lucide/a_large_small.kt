package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ALargeSmall: ImageVector
    get() {
        if (_ALargeSmall != null) return _ALargeSmall!!
        
        _ALargeSmall = ImageVector.Builder(
            name = "a-large-small",
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
                moveTo(15f, 16f)
                lineToRelative(2.536f, -7.328f)
                arcToRelative(1.02f, 1.02f, 1f, false, true, 1.928f, 0f)
                lineTo(22f, 16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.697f, 14f)
                horizontalLineToRelative(5.606f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.923f, 0f)
                lineTo(11f, 16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.304f, 13f)
                horizontalLineToRelative(6.392f)
            }
        }.build()
        
        return _ALargeSmall!!
    }

private var _ALargeSmall: ImageVector? = null

