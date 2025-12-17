package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(537.6f, 226.6f)
                curveToRelative(4.1f, -10.7f, 6.4f, -22.4f, 6.4f, -34.6f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                curveToRelative(-19.7f, 0f, -38.1f, 6f, -53.3f, 16.2f)
                curveTo(367f, 64.2f, 315.3f, 32f, 256f, 32f)
                curveToRelative(-88.4f, 0f, -160f, 71.6f, -160f, 160f)
                curveToRelative(0f, 2.7f, 0.1f, 5.4f, 0.2f, 8.1f)
                curveTo(40.2f, 219.8f, 0f, 273.2f, 0f, 336f)
                curveToRelative(0f, 79.5f, 64.5f, 144f, 144f, 144f)
                horizontalLineToRelative(368f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                curveToRelative(0f, -61.9f, -44f, -113.6f, -102.4f, -125.4f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

