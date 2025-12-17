package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Panorama_horizontal: ImageVector
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
                moveTo(4f, 6.54f)
                verticalLineToRelative(10.91f)
                curveToRelative(2.6f, -0.77f, 5.28f, -1.16f, 8f, -1.16f)
                reflectiveCurveToRelative(5.4f, 0.39f, 8f, 1.16f)
                verticalLineTo(6.54f)
                curveToRelative(-2.6f, 0.78f, -5.28f, 1.17f, -8f, 1.16f)
                curveToRelative(-2.72f, 0f, -5.4f, -0.39f, -8f, -1.16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.43f, 4f)
                curveToRelative(-0.1f, 0f, -0.2f, 0.02f, -0.31f, 0.06f)
                curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12f, 5.7f)
                reflectiveCurveToRelative(-6.18f, -0.55f, -9.12f, -1.64f)
                curveTo(2.77f, 4.02f, 2.66f, 4f, 2.57f, 4f)
                curveToRelative(-0.34f, 0f, -0.57f, 0.23f, -0.57f, 0.63f)
                verticalLineToRelative(14.75f)
                curveToRelative(0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f)
                curveToRelative(0.1f, 0f, 0.2f, -0.02f, 0.31f, -0.06f)
                curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f)
                reflectiveCurveToRelative(6.18f, 0.55f, 9.12f, 1.64f)
                curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f)
                curveToRelative(0.33f, 0f, 0.57f, -0.23f, 0.57f, -0.63f)
                verticalLineTo(4.63f)
                curveToRelative(0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f)
                close()
                moveTo(20f, 17.45f)
                curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8f, -1.16f)
                reflectiveCurveToRelative(-5.4f, 0.39f, -8f, 1.16f)
                verticalLineTo(6.54f)
                curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8f, 1.16f)
                curveToRelative(2.72f, 0.01f, 5.4f, -0.38f, 8f, -1.16f)
                verticalLineToRelative(10.91f)
                close()
            }
        }.build()
        
        return _Panorama_horizontal!!
    }

private var _Panorama_horizontal: ImageVector? = null

