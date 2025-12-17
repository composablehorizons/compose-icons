package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudOff: ImageVector
    get() {
        if (_CloudOff != null) return _CloudOff!!
        
        _CloudOff = ImageVector.Builder(
            name = "cloud-off",
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
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.782f, 5.782f)
                arcTo(7f, 7f, 0f, false, false, 9f, 19f)
                horizontalLineToRelative(8.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 1.307f, -0.193f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.532f, 16.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 17.5f, 10f)
                horizontalLineToRelative(-1.79f)
                arcTo(7.008f, 7.008f, 0f, false, false, 10f, 5.07f)
            }
        }.build()
        
        return _CloudOff!!
    }

private var _CloudOff: ImageVector? = null

