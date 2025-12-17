package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ban: ImageVector
    get() {
        if (_Ban != null) return _Ban!!
        
        _Ban = ImageVector.Builder(
            name = "ban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.034f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.034f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.034f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(130.108f, 117.892f)
                curveToRelative(65.448f, 65.448f, 70f, 165.481f, 20.677f, 235.637f)
                lineTo(150.47f, 105.216f)
                curveToRelative(70.204f, -49.356f, 170.226f, -44.735f, 235.638f, 20.676f)
                close()
                moveTo(125.892f, 386.108f)
                curveToRelative(-65.448f, -65.448f, -70f, -165.481f, -20.677f, -235.637f)
                lineTo(361.53f, 406.784f)
                curveToRelative(-70.203f, 49.356f, -170.226f, 44.736f, -235.638f, -20.676f)
                close()
            }
        }.build()
        
        return _Ban!!
    }

private var _Ban: ImageVector? = null

