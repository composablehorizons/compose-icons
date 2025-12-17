package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Panorama_vertical: ImageVector
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
                moveTo(19.94f, 21.12f)
                curveToRelative(-1.1f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f)
                reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f)
                curveToRelative(0.04f, -0.11f, 0.06f, -0.22f, 0.06f, -0.31f)
                curveToRelative(0f, -0.34f, -0.23f, -0.57f, -0.63f, -0.57f)
                horizontalLineTo(4.63f)
                curveToRelative(-0.4f, 0f, -0.63f, 0.23f, -0.63f, 0.57f)
                curveToRelative(0f, 0.1f, 0.02f, 0.2f, 0.06f, 0.31f)
                curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12f)
                reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f)
                curveToRelative(-0.05f, 0.11f, -0.07f, 0.22f, -0.07f, 0.31f)
                curveToRelative(0f, 0.33f, 0.23f, 0.57f, 0.63f, 0.57f)
                horizontalLineToRelative(14.75f)
                curveToRelative(0.39f, 0f, 0.63f, -0.24f, 0.63f, -0.57f)
                curveToRelative(-0.01f, -0.1f, -0.03f, -0.2f, -0.07f, -0.31f)
                close()
                moveTo(6.54f, 20f)
                curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8f)
                reflectiveCurveToRelative(-0.39f, -5.4f, -1.16f, -8f)
                horizontalLineToRelative(10.91f)
                curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8f)
                reflectiveCurveToRelative(0.39f, 5.4f, 1.16f, 8f)
                horizontalLineTo(6.54f)
                close()
            }
        }.build()
        
        return _Panorama_vertical!!
    }

private var _Panorama_vertical: ImageVector? = null

