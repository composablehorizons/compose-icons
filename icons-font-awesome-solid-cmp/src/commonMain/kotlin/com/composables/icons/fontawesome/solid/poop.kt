package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Poop: ImageVector
    get() {
        if (_Poop != null) return _Poop!!
        
        _Poop = ImageVector.Builder(
            name = "poop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(451.36f, 369.14f)
                curveTo(468.66f, 355.99f, 480f, 335.41f, 480f, 312f)
                curveToRelative(0f, -39.77f, -32.24f, -72f, -72f, -72f)
                horizontalLineToRelative(-14.07f)
                curveToRelative(13.42f, -11.73f, 22.07f, -28.78f, 22.07f, -48f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                horizontalLineToRelative(-5.88f)
                curveToRelative(3.57f, -10.05f, 5.88f, -20.72f, 5.88f, -32f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                curveToRelative(-5.17f, 0f, -10.15f, 0.74f, -15.11f, 1.52f)
                curveTo(250.31f, 14.64f, 256f, 30.62f, 256f, 48f)
                curveToRelative(0f, 44.18f, -35.82f, 80f, -80f, 80f)
                horizontalLineToRelative(-16f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                curveToRelative(0f, 19.22f, 8.65f, 36.27f, 22.07f, 48f)
                horizontalLineTo(104f)
                curveToRelative(-39.76f, 0f, -72f, 32.23f, -72f, 72f)
                curveToRelative(0f, 23.41f, 11.34f, 43.99f, 28.64f, 57.14f)
                curveTo(26.31f, 374.62f, 0f, 404.12f, 0f, 440f)
                curveToRelative(0f, 39.76f, 32.24f, 72f, 72f, 72f)
                horizontalLineToRelative(368f)
                curveToRelative(39.76f, 0f, 72f, -32.24f, 72f, -72f)
                curveToRelative(0f, -35.88f, -26.31f, -65.38f, -60.64f, -70.86f)
                close()
            }
        }.build()
        
        return _Poop!!
    }

private var _Poop: ImageVector? = null

