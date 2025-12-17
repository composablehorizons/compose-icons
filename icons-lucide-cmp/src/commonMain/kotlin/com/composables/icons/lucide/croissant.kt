package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Croissant: ImageVector
    get() {
        if (_Croissant != null) return _Croissant!!
        
        _Croissant = ImageVector.Builder(
            name = "croissant",
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
                moveTo(10.2f, 18f)
                horizontalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.352f, -0.97f)
                arcToRelative(11f, 11f, 0f, false, true, 0.132f, -6.487f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10.2f)
                verticalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.97f, -1.352f)
                arcToRelative(11f, 11f, 0f, false, false, -6.486f, 0.132f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 5f)
                arcToRelative(4f, 3f, 0f, false, true, 4f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(10f, 10f, 0f, false, false, -5.139f, 1.42f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                arcToRelative(3f, 4f, 0f, false, false, 3f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                arcToRelative(10f, 10f, 0f, false, true, 1.42f, -5.14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.709f, 2.554f)
                arcToRelative(10f, 10f, 0f, false, false, -6.155f, 6.155f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.676f, 1.626f)
                lineToRelative(9.807f, 5.42f)
                arcToRelative(2f, 2f, 0f, false, false, 2.718f, -2.718f)
                lineToRelative(-5.42f, -9.807f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.626f, -0.676f)
            }
        }.build()
        
        return _Croissant!!
    }

private var _Croissant: ImageVector? = null

