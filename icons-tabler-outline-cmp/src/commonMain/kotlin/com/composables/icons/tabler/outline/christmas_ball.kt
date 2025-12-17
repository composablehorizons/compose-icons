package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChristmasBall: ImageVector
    get() {
        if (_ChristmasBall != null) return _ChristmasBall!!
        
        _ChristmasBall = ImageVector.Builder(
            name = "christmas-ball",
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
                moveTo(12f, 13f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, 16f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 5f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.512f, 10.161f)
                curveToRelative(2.496f, -1.105f, 4.992f, -0.825f, 7.488f, 0.839f)
                curveToRelative(2.627f, 1.752f, 5.255f, 1.97f, 7.882f, 0.653f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.315f, 15.252f)
                curveToRelative(2.561f, -1.21f, 5.123f, -0.96f, 7.685f, 0.748f)
                curveToRelative(2.293f, 1.528f, 4.585f, 1.889f, 6.878f, 1.081f)
            }
        }.build()
        
        return _ChristmasBall!!
    }

private var _ChristmasBall: ImageVector? = null

