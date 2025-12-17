package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Panorama_vertical: ImageVector
    get() {
        if (_Panorama_vertical != null) return _Panorama_vertical!!
        
        _Panorama_vertical = ImageVector.Builder(
            name = "panorama_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.46f, 4f)
                curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8f)
                curveToRelative(0f, 2.72f, 0.39f, 5.41f, 1.16f, 8f)
                horizontalLineTo(6.55f)
                curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8f)
                curveToRelative(0f, -2.72f, -0.39f, -5.41f, -1.16f, -8f)
                horizontalLineToRelative(10.91f)
                moveToRelative(2.78f, -2f)
                horizontalLineTo(3.77f)
                reflectiveCurveToRelative(0.26f, 0.77f, 0.3f, 0.88f)
                curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12f)
                reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f)
                curveToRelative(-0.04f, 0.11f, -0.3f, 0.88f, -0.3f, 0.88f)
                horizontalLineToRelative(16.47f)
                reflectiveCurveToRelative(-0.26f, -0.77f, -0.3f, -0.88f)
                curveToRelative(-1.09f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f)
                reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f)
                curveToRelative(0.04f, -0.11f, 0.3f, -0.88f, 0.3f, -0.88f)
                close()
            }
        }.build()
        
        return _Panorama_vertical!!
    }

private var _Panorama_vertical: ImageVector? = null

