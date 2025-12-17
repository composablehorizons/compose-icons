package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LayersPlus: ImageVector
    get() {
        if (_LayersPlus != null) return _LayersPlus!!
        
        _LayersPlus = ImageVector.Builder(
            name = "layers-plus",
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
                moveTo(12.83f, 2.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 6.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.83f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 0.83f, 0.18f)
                arcToRelative(2f, 2f, 0f, false, false, 0.83f, -0.18f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.831f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 14f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 0.825f, 0.178f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17f)
                arcToRelative(1f, 1f, 0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.65f, 0f)
                lineToRelative(2.116f, -0.962f)
            }
        }.build()
        
        return _LayersPlus!!
    }

private var _LayersPlus: ImageVector? = null

