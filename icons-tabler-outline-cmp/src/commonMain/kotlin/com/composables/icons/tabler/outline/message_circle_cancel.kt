package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MessageCircleCancel: ImageVector
    get() {
        if (_MessageCircleCancel != null) return _MessageCircleCancel!!
        
        _MessageCircleCancel = ImageVector.Builder(
            name = "message-circle-cancel",
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
                moveTo(12.015f, 19.98f)
                arcToRelative(9.87f, 9.87f, 0f, false, true, -4.315f, -0.98f)
                lineToRelative(-4.7f, 1f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.324f, -3.437f, -1.426f, -7.872f, 2.1f, -10.374f)
                curveToRelative(3.526f, -2.501f, 8.59f, -2.296f, 11.845f, 0.48f)
                curveToRelative(1.927f, 1.644f, 2.867f, 3.887f, 2.761f, 6.114f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 21f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _MessageCircleCancel!!
    }

private var _MessageCircleCancel: ImageVector? = null

