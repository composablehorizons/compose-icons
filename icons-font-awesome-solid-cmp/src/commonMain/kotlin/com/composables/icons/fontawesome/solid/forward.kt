package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500.5f, 231.4f)
                lineToRelative(-192f, -160f)
                curveTo(287.9f, 54.3f, 256f, 68.6f, 256f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 27.4f, 31.9f, 41.8f, 52.5f, 24.6f)
                lineToRelative(192f, -160f)
                curveToRelative(15.3f, -12.8f, 15.3f, -36.4f, 0f, -49.2f)
                close()
                moveToRelative(-256f, 0f)
                lineToRelative(-192f, -160f)
                curveTo(31.9f, 54.3f, 0f, 68.6f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 27.4f, 31.9f, 41.8f, 52.5f, 24.6f)
                lineToRelative(192f, -160f)
                curveToRelative(15.3f, -12.8f, 15.3f, -36.4f, 0f, -49.2f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

