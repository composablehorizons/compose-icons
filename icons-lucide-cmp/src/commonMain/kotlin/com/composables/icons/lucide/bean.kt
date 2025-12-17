package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bean: ImageVector
    get() {
        if (_Bean != null) return _Bean!!
        
        _Bean = ImageVector.Builder(
            name = "bean",
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
                moveTo(10.165f, 6.598f)
                curveTo(9.954f, 7.478f, 9.64f, 8.36f, 9f, 9f)
                curveToRelative(-0.64f, 0.64f, -1.521f, 0.954f, -2.402f, 1.165f)
                arcTo(6f, 6f, 0f, false, false, 8f, 22f)
                curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
                arcToRelative(6f, 6f, 0f, false, false, -11.835f, -1.402f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4f, 4f, 0f, true, false, 5.279f, -5.28f)
            }
        }.build()
        
        return _Bean!!
    }

private var _Bean: ImageVector? = null

