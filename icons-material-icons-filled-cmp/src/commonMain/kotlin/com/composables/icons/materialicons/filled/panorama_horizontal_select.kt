package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Panorama_horizontal_select: ImageVector
    get() {
        if (_Panorama_horizontal_select != null) return _Panorama_horizontal_select!!
        
        _Panorama_horizontal_select = ImageVector.Builder(
            name = "panorama_horizontal_select",
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
            }
        }.build()
        
        return _Panorama_horizontal_select!!
    }

private var _Panorama_horizontal_select: ImageVector? = null

