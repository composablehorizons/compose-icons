package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudMoonRain: ImageVector
    get() {
        if (_CloudMoonRain != null) return _CloudMoonRain!!
        
        _CloudMoonRain = ImageVector.Builder(
            name = "cloud-moon-rain",
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
                moveTo(11f, 20f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.376f, 14.512f)
                arcToRelative(6f, 6f, 0f, false, false, 3.461f, -4.127f)
                curveToRelative(0.148f, -0.625f, -0.659f, -0.97f, -1.248f, -0.714f)
                arcToRelative(4f, 4f, 0f, false, true, -5.259f, -5.26f)
                curveToRelative(0.255f, -0.589f, -0.09f, -1.395f, -0.716f, -1.248f)
                arcToRelative(6f, 6f, 0f, false, false, -4.594f, 5.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                arcToRelative(5f, 5f, 0f, true, true, 8.9f, -4f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, true, 2f, 5.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _CloudMoonRain!!
    }

private var _CloudMoonRain: ImageVector? = null

