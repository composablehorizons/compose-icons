package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Webhook: ImageVector
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
                moveTo(18f, 16.98f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-1.1f, 0f, -1.95f, 0.94f, -2.48f, 1.9f)
                arcTo(4f, 4f, 0f, false, true, 2f, 17f)
                curveToRelative(0.01f, -0.7f, 0.2f, -1.4f, 0.57f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                lineToRelative(3.13f, -5.78f)
                curveToRelative(0.53f, -0.97f, 0.1f, -2.18f, -0.5f, -3.1f)
                arcToRelative(4f, 4f, 0f, true, true, 6.89f, -4.06f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineToRelative(3.13f, 5.73f)
                curveTo(15.66f, 12.7f, 16.9f, 13f, 18f, 13f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _Webhook!!
    }

private var _Webhook: ImageVector? = null

