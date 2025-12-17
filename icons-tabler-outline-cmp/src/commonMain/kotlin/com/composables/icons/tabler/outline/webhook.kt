package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Webhook: ImageVector
    get() {
        if (_Webhook != null) return _Webhook!!
        
        _Webhook = ImageVector.Builder(
            name = "webhook",
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
                moveTo(4.876f, 13.61f)
                arcToRelative(4f, 4f, 0f, true, false, 6.124f, 3.39f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.066f, 20.502f)
                arcToRelative(4f, 4f, 0f, true, false, 1.934f, -7.502f)
                curveToRelative(-0.706f, 0f, -1.424f, 0.179f, -2f, 0.5f)
                lineToRelative(-3f, -5.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
                curveToRelative(0f, 1.506f, 0.77f, 2.818f, 2f, 3.5f)
                lineToRelative(-3f, 5.5f)
            }
        }.build()
        
        return _Webhook!!
    }

private var _Webhook: ImageVector? = null

