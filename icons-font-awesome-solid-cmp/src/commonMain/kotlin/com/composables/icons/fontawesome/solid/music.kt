package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Music: ImageVector
    get() {
        if (_Music != null) return _Music!!
        
        _Music = ImageVector.Builder(
            name = "music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(470.38f, 1.51f)
                lineTo(150.41f, 96f)
                arcTo(32f, 32f, 0f, false, false, 128f, 126.51f)
                verticalLineToRelative(261.41f)
                arcTo(139f, 139f, 0f, false, false, 96f, 384f)
                curveToRelative(-53f, 0f, -96f, 28.66f, -96f, 64f)
                reflectiveCurveToRelative(43f, 64f, 96f, 64f)
                reflectiveCurveToRelative(96f, -28.66f, 96f, -64f)
                verticalLineTo(214.32f)
                lineToRelative(256f, -75f)
                verticalLineToRelative(184.61f)
                arcToRelative(138.4f, 138.4f, 0f, false, false, -32f, -3.93f)
                curveToRelative(-53f, 0f, -96f, 28.66f, -96f, 64f)
                reflectiveCurveToRelative(43f, 64f, 96f, 64f)
                reflectiveCurveToRelative(96f, -28.65f, 96f, -64f)
                verticalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, false, -41.62f, -30.49f)
                close()
            }
        }.build()
        
        return _Music!!
    }

private var _Music: ImageVector? = null

