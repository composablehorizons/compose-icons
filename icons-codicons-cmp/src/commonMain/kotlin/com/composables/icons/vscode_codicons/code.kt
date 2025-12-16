package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.80307f, 3.0431f)
                curveTo(10.0554f, 3.15525f, 10.1691f, 3.45073f, 10.0569f, 3.70307f)
                lineTo(6.05691f, 12.7031f)
                curveTo(5.94475f, 12.9554f, 5.64927f, 13.0691f, 5.39693f, 12.9569f)
                curveTo(5.14459f, 12.8448f, 5.03094f, 12.5493f, 5.14309f, 12.2969f)
                lineTo(9.14309f, 3.29693f)
                curveTo(9.25525f, 3.04459f, 9.55073f, 2.93094f, 9.80307f, 3.0431f)
                close()
                moveTo(4.33218f, 5.3763f)
                curveTo(4.53857f, 5.55976f, 4.55716f, 5.87579f, 4.3737f, 6.08218f)
                lineTo(2.66898f, 8f)
                lineTo(4.3737f, 9.91782f)
                curveTo(4.55716f, 10.1242f, 4.53857f, 10.4402f, 4.33218f, 10.6237f)
                curveTo(4.12579f, 10.8072f, 3.80975f, 10.7886f, 3.6263f, 10.5822f)
                lineTo(1.6263f, 8.33218f)
                curveTo(1.4579f, 8.14274f, 1.4579f, 7.85726f, 1.6263f, 7.66782f)
                lineTo(3.6263f, 5.41782f)
                curveTo(3.80975f, 5.21143f, 4.12579f, 5.19284f, 4.33218f, 5.3763f)
                close()
                moveTo(11.6678f, 5.3763f)
                curveTo(11.8742f, 5.19284f, 12.1902f, 5.21143f, 12.3737f, 5.41782f)
                lineTo(14.3737f, 7.66782f)
                curveTo(14.5421f, 7.85726f, 14.5421f, 8.14274f, 14.3737f, 8.33218f)
                lineTo(12.3737f, 10.5822f)
                curveTo(12.1902f, 10.7886f, 11.8742f, 10.8072f, 11.6678f, 10.6237f)
                curveTo(11.4614f, 10.4402f, 11.4428f, 10.1242f, 11.6263f, 9.91782f)
                lineTo(13.331f, 8f)
                lineTo(11.6263f, 6.08218f)
                curveTo(11.4428f, 5.87579f, 11.4614f, 5.55976f, 11.6678f, 5.3763f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

