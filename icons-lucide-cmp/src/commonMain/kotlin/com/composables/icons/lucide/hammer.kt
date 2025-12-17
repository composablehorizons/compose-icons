package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hammer: ImageVector
    get() {
        if (_Hammer != null) return _Hammer!!
        
        _Hammer = ImageVector.Builder(
            name = "hammer",
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
                moveTo(15f, 12f)
                lineToRelative(-9.373f, 9.373f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(12f, 9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 15f)
                lineToRelative(4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 11.5f)
                lineToRelative(-1.914f, -1.914f)
                arcTo(2f, 2f, 0f, false, true, 19f, 8.172f)
                verticalLineToRelative(-0.344f)
                arcToRelative(2f, 2f, 0f, false, false, -0.586f, -1.414f)
                lineToRelative(-1.657f, -1.657f)
                arcTo(6f, 6f, 0f, false, false, 12.516f, 3f)
                horizontalLineTo(9f)
                lineToRelative(1.243f, 1.243f)
                arcTo(6f, 6f, 0f, false, true, 12f, 8.485f)
                verticalLineTo(10f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(1.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineTo(18.5f, 14.5f)
            }
        }.build()
        
        return _Hammer!!
    }

private var _Hammer: ImageVector? = null

