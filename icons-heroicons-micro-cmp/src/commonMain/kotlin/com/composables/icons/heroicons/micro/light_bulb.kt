package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.LightBulb: ImageVector
    get() {
        if (_LightBulb != null) return _LightBulb!!
        
        _LightBulb = ImageVector.Builder(
            name = "light-bulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.618f, 10.26f)
                curveToRelative(-0.361f, 0.223f, -0.618f, 0.598f, -0.618f, 1.022f)
                curveToRelative(0f, 0.226f, -0.142f, 0.43f, -0.36f, 0.49f)
                arcTo(6.006f, 6.006f, 0f, false, true, 8f, 12f)
                curveToRelative(-0.569f, 0f, -1.12f, -0.08f, -1.64f, -0.227f)
                arcToRelative(0.504f, 0.504f, 0f, false, true, -0.36f, -0.491f)
                curveToRelative(0f, -0.424f, -0.257f, -0.799f, -0.618f, -1.021f)
                arcToRelative(5f, 5f, 0f, true, true, 5.235f, 0f)
                close()
                moveTo(6.867f, 13.415f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.225f, 1.483f)
                arcToRelative(9.065f, 9.065f, 0f, false, false, 2.716f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.225f, -1.483f)
                arcToRelative(7.563f, 7.563f, 0f, false, true, -2.266f, 0f)
                close()
            }
        }.build()
        
        return _LightBulb!!
    }

private var _LightBulb: ImageVector? = null

