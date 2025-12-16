package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrafficCone: ImageVector
    get() {
        if (_TrafficCone != null) return _TrafficCone!!
        
        _TrafficCone = ImageVector.Builder(
            name = "traffic-cone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.05f, 10.966f)
                arcToRelative(5f, 2.5f, 0f, false, true, -8.1f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.923f, 14.049f)
                lineToRelative(4.48f, 2.04f)
                arcToRelative(1f, 1f, 0f, false, true, 0.001f, 1.831f)
                lineToRelative(-8.574f, 3.9f)
                arcToRelative(2f, 2f, 0f, false, true, -1.66f, 0f)
                lineToRelative(-8.574f, -3.91f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.83f)
                lineToRelative(4.484f, -2.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.949f, 14.14f)
                arcToRelative(5f, 2.5f, 0f, true, true, -9.9f, 0f)
                lineTo(10.063f, 3.5f)
                arcToRelative(2f, 2f, 0f, false, true, 3.874f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.194f, 6.57f)
                arcToRelative(5f, 2.5f, 0f, false, false, 5.61f, 0f)
            }
        }.build()
        
        return _TrafficCone!!
    }

private var _TrafficCone: ImageVector? = null

