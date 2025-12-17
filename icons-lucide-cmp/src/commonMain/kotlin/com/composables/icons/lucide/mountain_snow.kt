package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MountainSnow: ImageVector
    get() {
        if (_MountainSnow != null) return _MountainSnow!!
        
        _MountainSnow = ImageVector.Builder(
            name = "mountain-snow",
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
                moveTo(8f, 3f)
                lineToRelative(4f, 8f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 15f)
                horizontalLineTo(2f)
                lineTo(8f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.14f, 15.08f)
                curveToRelative(2.62f, -1.57f, 5.24f, -1.43f, 7.86f, 0.42f)
                curveToRelative(2.74f, 1.94f, 5.49f, 2f, 8.23f, 0.19f)
            }
        }.build()
        
        return _MountainSnow!!
    }

private var _MountainSnow: ImageVector? = null

