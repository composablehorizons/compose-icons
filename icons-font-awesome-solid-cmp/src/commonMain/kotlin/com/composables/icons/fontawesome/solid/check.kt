package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(173.898f, 439.404f)
                lineToRelative(-166.4f, -166.4f)
                curveToRelative(-9.997f, -9.997f, -9.997f, -26.206f, 0f, -36.204f)
                lineToRelative(36.203f, -36.204f)
                curveToRelative(9.997f, -9.998f, 26.207f, -9.998f, 36.204f, 0f)
                lineTo(192f, 312.69f)
                lineTo(432.095f, 72.596f)
                curveToRelative(9.997f, -9.997f, 26.207f, -9.997f, 36.204f, 0f)
                lineToRelative(36.203f, 36.204f)
                curveToRelative(9.997f, 9.997f, 9.997f, 26.206f, 0f, 36.204f)
                lineToRelative(-294.4f, 294.401f)
                curveToRelative(-9.998f, 9.997f, -26.207f, 9.997f, -36.204f, -0.001f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

