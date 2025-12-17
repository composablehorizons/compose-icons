package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
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
                moveTo(20.84f, 4.61f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -7.78f, 0f)
                lineTo(12f, 5.67f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -7.78f, 7.78f)
                lineToRelative(1.06f, 1.06f)
                lineTo(12f, 21.23f)
                lineToRelative(7.78f, -7.78f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, -7.78f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

