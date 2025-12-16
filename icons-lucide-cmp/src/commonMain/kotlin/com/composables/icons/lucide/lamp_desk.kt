package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LampDesk: ImageVector
    get() {
        if (_LampDesk != null) return _LampDesk!!
        
        _LampDesk = ImageVector.Builder(
            name = "lamp-desk",
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
                moveTo(10.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(5.994f, 1.227f)
                arcToRelative(1f, 1f, 0f, false, true, 0.506f, 1.687f)
                lineToRelative(-7f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, -1.687f, -0.506f)
                lineToRelative(-1.227f, -5.994f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.207f, 4.793f)
                lineToRelative(-3.414f, 3.414f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.086f, 6.5f)
                lineToRelative(-4.793f, 4.793f)
                arcToRelative(1f, 1f, 0f, false, false, -0.18f, 1.17f)
                lineTo(7f, 18f)
            }
        }.build()
        
        return _LampDesk!!
    }

private var _LampDesk: ImageVector? = null

