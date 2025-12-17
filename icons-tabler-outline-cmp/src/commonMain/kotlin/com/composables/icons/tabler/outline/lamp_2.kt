package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Lamp2: ImageVector
    get() {
        if (_Lamp2 != null) return _Lamp2!!
        
        _Lamp2 = ImageVector.Builder(
            name = "lamp-2",
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
                moveTo(5f, 21f)
                horizontalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 21f)
                lineToRelative(-7f, -8f)
                lineToRelative(8.5f, -5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                curveToRelative(-2.148f, -2.148f, -2.148f, -5.852f, 0f, -8f)
                curveToRelative(2.088f, -2.088f, 5.842f, -1.972f, 8f, 0f)
                lineToRelative(-8f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.742f, 7.574f)
                lineToRelative(-1.156f, -1.156f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, -2.829f)
                lineToRelative(1.144f, 1.144f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 12f)
                lineToRelative(0.208f, 0.274f)
                arcToRelative(2.527f, 2.527f, 0f, false, false, 3.556f, 0f)
                curveToRelative(0.939f, -0.933f, 0.98f, -2.42f, 0.122f, -3.4f)
                lineToRelative(-0.366f, -0.369f)
            }
        }.build()
        
        return _Lamp2!!
    }

private var _Lamp2: ImageVector? = null

