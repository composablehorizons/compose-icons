package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Globe: ImageVector
    get() {
        if (_Globe != null) return _Globe!!
        
        _Globe = ImageVector.Builder(
            name = "globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336.5f, 160f)
                curveTo(322f, 70.7f, 287.8f, 8f, 248f, 8f)
                reflectiveCurveToRelative(-74f, 62.7f, -88.5f, 152f)
                horizontalLineToRelative(177f)
                close()
                moveTo(152f, 256f)
                curveToRelative(0f, 22.2f, 1.2f, 43.5f, 3.3f, 64f)
                horizontalLineToRelative(185.3f)
                curveToRelative(2.1f, -20.5f, 3.3f, -41.8f, 3.3f, -64f)
                reflectiveCurveToRelative(-1.2f, -43.5f, -3.3f, -64f)
                horizontalLineTo(155.3f)
                curveToRelative(-2.1f, 20.5f, -3.3f, 41.8f, -3.3f, 64f)
                close()
                moveToRelative(324.7f, -96f)
                curveToRelative(-28.6f, -67.9f, -86.5f, -120.4f, -158f, -141.6f)
                curveToRelative(24.4f, 33.8f, 41.2f, 84.7f, 50f, 141.6f)
                horizontalLineToRelative(108f)
                close()
                moveTo(177.2f, 18.4f)
                curveTo(105.8f, 39.6f, 47.8f, 92.1f, 19.3f, 160f)
                horizontalLineToRelative(108f)
                curveToRelative(8.7f, -56.9f, 25.5f, -107.8f, 49.9f, -141.6f)
                close()
                moveTo(487.4f, 192f)
                horizontalLineTo(372.7f)
                curveToRelative(2.1f, 21f, 3.3f, 42.5f, 3.3f, 64f)
                reflectiveCurveToRelative(-1.2f, 43f, -3.3f, 64f)
                horizontalLineToRelative(114.6f)
                curveToRelative(5.5f, -20.5f, 8.6f, -41.8f, 8.6f, -64f)
                reflectiveCurveToRelative(-3.1f, -43.5f, -8.5f, -64f)
                close()
                moveTo(120f, 256f)
                curveToRelative(0f, -21.5f, 1.2f, -43f, 3.3f, -64f)
                horizontalLineTo(8.6f)
                curveTo(3.2f, 212.5f, 0f, 233.8f, 0f, 256f)
                reflectiveCurveToRelative(3.2f, 43.5f, 8.6f, 64f)
                horizontalLineToRelative(114.6f)
                curveToRelative(-2f, -21f, -3.2f, -42.5f, -3.2f, -64f)
                close()
                moveToRelative(39.5f, 96f)
                curveToRelative(14.5f, 89.3f, 48.7f, 152f, 88.5f, 152f)
                reflectiveCurveToRelative(74f, -62.7f, 88.5f, -152f)
                horizontalLineToRelative(-177f)
                close()
                moveToRelative(159.3f, 141.6f)
                curveToRelative(71.4f, -21.2f, 129.4f, -73.7f, 158f, -141.6f)
                horizontalLineToRelative(-108f)
                curveToRelative(-8.8f, 56.9f, -25.6f, 107.8f, -50f, 141.6f)
                close()
                moveTo(19.3f, 352f)
                curveToRelative(28.6f, 67.9f, 86.5f, 120.4f, 158f, 141.6f)
                curveToRelative(-24.4f, -33.8f, -41.2f, -84.7f, -50f, -141.6f)
                horizontalLineToRelative(-108f)
                close()
            }
        }.build()
        
        return _Globe!!
    }

private var _Globe: ImageVector? = null

