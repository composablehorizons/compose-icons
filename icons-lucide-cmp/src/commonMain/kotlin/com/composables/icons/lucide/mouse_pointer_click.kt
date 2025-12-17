package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MousePointerClick: ImageVector
    get() {
        if (_MousePointerClick != null) return _MousePointerClick!!
        
        _MousePointerClick = ImageVector.Builder(
            name = "mouse-pointer-click",
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
                moveTo(14f, 4.1f)
                lineTo(12f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.1f, 8f)
                lineToRelative(-2.9f, -0.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                lineToRelative(-1.9f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.2f, 2.2f)
                lineTo(8f, 5.1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.037f, 9.69f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, 0.653f, -0.653f)
                lineToRelative(11f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.074f, 0.949f)
                lineToRelative(-4.349f, 1.041f)
                arcToRelative(1f, 1f, 0f, false, false, -0.74f, 0.739f)
                lineToRelative(-1.04f, 4.35f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.95f, 0.074f)
                close()
            }
        }.build()
        
        return _MousePointerClick!!
    }

private var _MousePointerClick: ImageVector? = null

