package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeartBroken: ImageVector
    get() {
        if (_HeartBroken != null) return _HeartBroken!!
        
        _HeartBroken = ImageVector.Builder(
            name = "heart-broken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(473.7f, 73.8f)
                lineToRelative(-2.4f, -2.5f)
                curveToRelative(-46f, -47f, -118f, -51.7f, -169.6f, -14.8f)
                lineTo(336f, 159.9f)
                lineToRelative(-96f, 64f)
                lineToRelative(48f, 128f)
                lineToRelative(-144f, -144f)
                lineToRelative(96f, -64f)
                lineToRelative(-28.6f, -86.5f)
                curveTo(159.7f, 19.6f, 87f, 24f, 40.7f, 71.4f)
                lineToRelative(-2.4f, 2.4f)
                curveTo(-10.4f, 123.6f, -12.5f, 202.9f, 31f, 256f)
                lineToRelative(212.1f, 218.6f)
                curveToRelative(7.1f, 7.3f, 18.6f, 7.3f, 25.7f, 0f)
                lineTo(481f, 255.9f)
                curveToRelative(43.5f, -53f, 41.4f, -132.3f, -7.3f, -182.1f)
                close()
            }
        }.build()
        
        return _HeartBroken!!
    }

private var _HeartBroken: ImageVector? = null

