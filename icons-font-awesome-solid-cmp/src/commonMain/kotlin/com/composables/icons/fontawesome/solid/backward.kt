package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Backward: ImageVector
    get() {
        if (_Backward != null) return _Backward!!
        
        _Backward = ImageVector.Builder(
            name = "backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 280.6f)
                lineToRelative(192f, 160f)
                curveToRelative(20.6f, 17.2f, 52.5f, 2.8f, 52.5f, -24.6f)
                verticalLineTo(96f)
                curveToRelative(0f, -27.4f, -31.9f, -41.8f, -52.5f, -24.6f)
                lineToRelative(-192f, 160f)
                curveToRelative(-15.3f, 12.8f, -15.3f, 36.4f, 0f, 49.2f)
                close()
                moveToRelative(256f, 0f)
                lineToRelative(192f, 160f)
                curveToRelative(20.6f, 17.2f, 52.5f, 2.8f, 52.5f, -24.6f)
                verticalLineTo(96f)
                curveToRelative(0f, -27.4f, -31.9f, -41.8f, -52.5f, -24.6f)
                lineToRelative(-192f, 160f)
                curveToRelative(-15.3f, 12.8f, -15.3f, 36.4f, 0f, 49.2f)
                close()
            }
        }.build()
        
        return _Backward!!
    }

private var _Backward: ImageVector? = null

