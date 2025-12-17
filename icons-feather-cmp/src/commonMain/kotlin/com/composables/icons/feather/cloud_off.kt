package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.CloudOff: ImageVector
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
                moveTo(22.61f, 16.95f)
                arcTo(5f, 5f, 0f, false, false, 18f, 10f)
                horizontalLineToRelative(-1.26f)
                arcToRelative(8f, 8f, 0f, false, false, -7.05f, -6f)
                moveTo(5f, 5f)
                arcToRelative(8f, 8f, 0f, false, false, 4f, 15f)
                horizontalLineToRelative(9f)
                arcToRelative(5f, 5f, 0f, false, false, 1.7f, -0.3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 1f)
                lineTo(23f, 23f)
            }
        }.build()
        
        return _CloudOff!!
    }

private var _CloudOff: ImageVector? = null

