package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Exclamation: ImageVector
    get() {
        if (_Exclamation != null) return _Exclamation!!
        
        _Exclamation = ImageVector.Builder(
            name = "exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 432f)
                curveToRelative(0f, 44.112f, -35.888f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.888f, -80f, -80f)
                reflectiveCurveToRelative(35.888f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.888f, 80f, 80f)
                close()
                moveTo(25.26f, 25.199f)
                lineToRelative(13.6f, 272f)
                curveTo(39.499f, 309.972f, 50.041f, 320f, 62.83f, 320f)
                horizontalLineToRelative(66.34f)
                curveToRelative(12.789f, 0f, 23.331f, -10.028f, 23.97f, -22.801f)
                lineToRelative(13.6f, -272f)
                curveTo(167.425f, 11.49f, 156.496f, 0f, 142.77f, 0f)
                horizontalLineTo(49.23f)
                curveTo(35.504f, 0f, 24.575f, 11.49f, 25.26f, 25.199f)
                close()
            }
        }.build()
        
        return _Exclamation!!
    }

private var _Exclamation: ImageVector? = null

