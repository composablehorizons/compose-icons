package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mask: ImageVector
    get() {
        if (_Mask != null) return _Mask!!
        
        _Mask = ImageVector.Builder(
            name = "mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320.67f, 64f)
                curveToRelative(-442.6f, 0f, -357.57f, 384f, -158.46f, 384f)
                curveToRelative(39.9f, 0f, 77.47f, -20.69f, 101.42f, -55.86f)
                lineToRelative(25.73f, -37.79f)
                curveToRelative(15.66f, -22.99f, 46.97f, -22.99f, 62.63f, 0f)
                lineToRelative(25.73f, 37.79f)
                curveTo(401.66f, 427.31f, 439.23f, 448f, 479.13f, 448f)
                curveToRelative(189.86f, 0f, 290.63f, -384f, -158.46f, -384f)
                close()
                moveTo(184f, 308.36f)
                curveToRelative(-41.06f, 0f, -67.76f, -25.66f, -80.08f, -41.05f)
                curveToRelative(-5.23f, -6.53f, -5.23f, -16.09f, 0f, -22.63f)
                curveToRelative(12.32f, -15.4f, 39.01f, -41.05f, 80.08f, -41.05f)
                reflectiveCurveToRelative(67.76f, 25.66f, 80.08f, 41.05f)
                curveToRelative(5.23f, 6.53f, 5.23f, 16.09f, 0f, 22.63f)
                curveToRelative(-12.32f, 15.4f, -39.02f, 41.05f, -80.08f, 41.05f)
                close()
                moveToRelative(272f, 0f)
                curveToRelative(-41.06f, 0f, -67.76f, -25.66f, -80.08f, -41.05f)
                curveToRelative(-5.23f, -6.53f, -5.23f, -16.09f, 0f, -22.63f)
                curveToRelative(12.32f, -15.4f, 39.01f, -41.05f, 80.08f, -41.05f)
                reflectiveCurveToRelative(67.76f, 25.66f, 80.08f, 41.05f)
                curveToRelative(5.23f, 6.53f, 5.23f, 16.09f, 0f, 22.63f)
                curveToRelative(-12.32f, 15.4f, -39.02f, 41.05f, -80.08f, 41.05f)
                close()
            }
        }.build()
        
        return _Mask!!
    }

private var _Mask: ImageVector? = null

