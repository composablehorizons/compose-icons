package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cloudy: ImageVector
    get() {
        if (_Cloudy != null) return _Cloudy!!
        
        _Cloudy = ImageVector.Builder(
            name = "cloudy",
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
                moveTo(17.5f, 21f)
                horizontalLineTo(9f)
                arcToRelative(7f, 7f, 0f, true, true, 6.71f, -9f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-2.207f)
                arcToRelative(5.502f, 5.502f, 0f, false, false, -10.702f, 0.5f)
            }
        }.build()
        
        return _Cloudy!!
    }

private var _Cloudy: ImageVector? = null

