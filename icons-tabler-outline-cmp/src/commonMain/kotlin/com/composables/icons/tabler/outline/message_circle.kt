package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MessageCircle: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.324f, -3.437f, -1.426f, -7.872f, 2.1f, -10.374f)
                curveToRelative(3.526f, -2.501f, 8.59f, -2.296f, 11.845f, 0.48f)
                curveToRelative(3.255f, 2.777f, 3.695f, 7.266f, 1.029f, 10.501f)
                curveToRelative(-2.666f, 3.235f, -7.615f, 4.215f, -11.574f, 2.293f)
                lineToRelative(-4.7f, 1f)
            }
        }.build()
        
        return _MessageCircle!!
    }

private var _MessageCircle: ImageVector? = null

