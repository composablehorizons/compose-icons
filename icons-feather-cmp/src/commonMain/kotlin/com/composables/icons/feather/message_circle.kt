package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.MessageCircle: ImageVector
    get() {
        if (_MessageCircle != null) return _MessageCircle!!
        
        _MessageCircle = ImageVector.Builder(
            name = "message-circle",
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
                moveTo(21f, 11.5f)
                arcToRelative(8.38f, 8.38f, 0f, false, true, -0.9f, 3.8f)
                arcToRelative(8.5f, 8.5f, 0f, false, true, -7.6f, 4.7f)
                arcToRelative(8.38f, 8.38f, 0f, false, true, -3.8f, -0.9f)
                lineTo(3f, 21f)
                lineToRelative(1.9f, -5.7f)
                arcToRelative(8.38f, 8.38f, 0f, false, true, -0.9f, -3.8f)
                arcToRelative(8.5f, 8.5f, 0f, false, true, 4.7f, -7.6f)
                arcToRelative(8.38f, 8.38f, 0f, false, true, 3.8f, -0.9f)
                horizontalLineToRelative(0.5f)
                arcToRelative(8.48f, 8.48f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.build()
        
        return _MessageCircle!!
    }

private var _MessageCircle: ImageVector? = null

