package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MessageCircleOff: ImageVector
    get() {
        if (_MessageCircleOff != null) return _MessageCircleOff!!
        
        _MessageCircleOff = ImageVector.Builder(
            name = "message-circle-off",
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
                moveTo(8.595f, 4.577f)
                curveToRelative(3.223f, -1.176f, 7.025f, -0.61f, 9.65f, 1.63f)
                curveToRelative(2.982f, 2.543f, 3.601f, 6.523f, 1.636f, 9.66f)
                moveToRelative(-1.908f, 2.109f)
                curveToRelative(-2.787f, 2.19f, -6.89f, 2.666f, -10.273f, 1.024f)
                lineToRelative(-4.7f, 1f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.229f, -3.296f, -1.494f, -7.511f, 1.68f, -10.057f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _MessageCircleOff!!
    }

private var _MessageCircleOff: ImageVector? = null

