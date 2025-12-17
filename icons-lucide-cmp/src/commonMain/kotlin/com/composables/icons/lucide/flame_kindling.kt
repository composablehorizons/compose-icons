package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlameKindling: ImageVector
    get() {
        if (_FlameKindling != null) return _FlameKindling!!
        
        _FlameKindling = ImageVector.Builder(
            name = "flame-kindling",
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
                moveTo(12f, 2f)
                curveToRelative(1f, 3f, 2.5f, 3.5f, 3.5f, 4.5f)
                arcTo(5f, 5f, 0f, false, true, 17f, 10f)
                arcToRelative(5f, 5f, 0f, true, true, -10f, 0f)
                curveToRelative(0f, -0.3f, 0f, -0.6f, 0.1f, -0.9f)
                arcToRelative(2f, 2f, 0f, true, false, 3.3f, -2f)
                curveTo(8f, 4.5f, 11f, 2f, 12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                lineToRelative(14f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                lineToRelative(14f, 4f)
            }
        }.build()
        
        return _FlameKindling!!
    }

private var _FlameKindling: ImageVector? = null

