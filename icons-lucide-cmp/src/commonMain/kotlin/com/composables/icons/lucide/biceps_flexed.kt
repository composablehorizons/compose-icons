package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BicepsFlexed: ImageVector
    get() {
        if (_BicepsFlexed != null) return _BicepsFlexed!!
        
        _BicepsFlexed = ImageVector.Builder(
            name = "biceps-flexed",
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
                moveTo(12.409f, 13.017f)
                arcTo(5f, 5f, 0f, false, true, 22f, 15f)
                curveToRelative(0f, 3.866f, -4f, 7f, -9f, 7f)
                curveToRelative(-4.077f, 0f, -8.153f, -0.82f, -10.371f, -2.462f)
                curveToRelative(-0.426f, -0.316f, -0.631f, -0.832f, -0.62f, -1.362f)
                curveTo(2.118f, 12.723f, 2.627f, 2f, 10f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                curveToRelative(-1.105f, 0f, -1.64f, -0.444f, -2f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 14f)
                arcToRelative(5f, 5f, 0f, false, false, -7.584f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.964f, 6.825f)
                curveTo(8.019f, 7.977f, 9.5f, 13f, 8f, 15f)
            }
        }.build()
        
        return _BicepsFlexed!!
    }

private var _BicepsFlexed: ImageVector? = null

