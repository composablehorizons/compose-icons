package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Panorama_horizontal: ImageVector
    get() {
        if (_Panorama_horizontal != null) return _Panorama_horizontal!!
        
        _Panorama_horizontal = ImageVector.Builder(
            name = "panorama_horizontal",
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
                moveTo(4f, 6.55f)
                curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8f, 1.16f)
                curveToRelative(2.72f, 0f, 5.41f, -0.39f, 8f, -1.16f)
                verticalLineToRelative(10.91f)
                curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8f, -1.16f)
                curveToRelative(-2.72f, 0f, -5.41f, 0.39f, -8f, 1.16f)
                verticalLineTo(6.55f)
                moveTo(2f, 3.77f)
                verticalLineToRelative(16.47f)
                reflectiveCurveToRelative(0.77f, -0.26f, 0.88f, -0.3f)
                curveTo(5.82f, 18.85f, 8.91f, 18.3f, 12f, 18.3f)
                curveToRelative(3.09f, 0f, 6.18f, 0.55f, 9.12f, 1.64f)
                curveToRelative(0.11f, 0.04f, 0.88f, 0.3f, 0.88f, 0.3f)
                verticalLineTo(3.77f)
                reflectiveCurveToRelative(-0.77f, 0.26f, -0.88f, 0.3f)
                curveTo(18.18f, 5.15f, 15.09f, 5.71f, 12f, 5.71f)
                reflectiveCurveToRelative(-6.18f, -0.56f, -9.12f, -1.64f)
                curveToRelative(-0.11f, -0.05f, -0.88f, -0.3f, -0.88f, -0.3f)
                close()
            }
        }.build()
        
        return _Panorama_horizontal!!
    }

private var _Panorama_horizontal: ImageVector? = null

