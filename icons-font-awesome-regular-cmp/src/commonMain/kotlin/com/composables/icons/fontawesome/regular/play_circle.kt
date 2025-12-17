package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) return _PlayCircle!!
        
        _PlayCircle = ImageVector.Builder(
            name = "play-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(371.7f, 238f)
                lineToRelative(-176f, -107f)
                curveToRelative(-15.8f, -8.8f, -35.7f, 2.5f, -35.7f, 21f)
                verticalLineToRelative(208f)
                curveToRelative(0f, 18.4f, 19.8f, 29.8f, 35.7f, 21f)
                lineToRelative(176f, -101f)
                curveToRelative(16.4f, -9.1f, 16.4f, -32.8f, 0f, -42f)
                close()
                moveTo(504f, 256f)
                curveTo(504f, 119f, 393f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                close()
                moveToRelative(-448f, 0f)
                curveToRelative(0f, -110.5f, 89.5f, -200f, 200f, -200f)
                reflectiveCurveToRelative(200f, 89.5f, 200f, 200f)
                reflectiveCurveToRelative(-89.5f, 200f, -200f, 200f)
                reflectiveCurveTo(56f, 366.5f, 56f, 256f)
                close()
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

