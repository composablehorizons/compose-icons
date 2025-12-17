package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Leaf: ImageVector
    get() {
        if (_Leaf != null) return _Leaf!!
        
        _Leaf = ImageVector.Builder(
            name = "leaf",
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
                moveTo(11f, 20f)
                arcTo(7f, 7f, 0f, false, true, 9.8f, 6.1f)
                curveTo(15.5f, 5f, 17f, 4.48f, 19f, 2f)
                curveToRelative(1f, 2f, 2f, 4.18f, 2f, 8f)
                curveToRelative(0f, 5.5f, -4.78f, 10f, -10f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                curveToRelative(0f, -3f, 1.85f, -5.36f, 5.08f, -6f)
                curveTo(9.5f, 14.52f, 12f, 13f, 13f, 12f)
            }
        }.build()
        
        return _Leaf!!
    }

private var _Leaf: ImageVector? = null

