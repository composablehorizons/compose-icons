package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Feather: ImageVector
    get() {
        if (_Feather != null) return _Feather!!
        
        _Feather = ImageVector.Builder(
            name = "feather",
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
                moveTo(12.67f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 1.416f, -0.588f)
                lineToRelative(6.154f, -6.172f)
                arcToRelative(6f, 6f, 0f, false, false, -8.49f, -8.49f)
                lineTo(5.586f, 9.914f)
                arcTo(2f, 2f, 0f, false, false, 5f, 11.328f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                lineTo(2f, 22f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 15f)
                horizontalLineTo(9f)
            }
        }.build()
        
        return _Feather!!
    }

private var _Feather: ImageVector? = null

