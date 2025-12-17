package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Panorama_wide_angle_select: ImageVector
    get() {
        if (_Panorama_wide_angle_select != null) return _Panorama_wide_angle_select!!
        
        _Panorama_wide_angle_select = ImageVector.Builder(
            name = "panorama_wide_angle_select",
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
                moveTo(12f, 4f)
                curveToRelative(-2.73f, 0f, -5.22f, 0.24f, -7.95f, 0.72f)
                lineToRelative(-0.93f, 0.16f)
                lineToRelative(-0.25f, 0.9f)
                curveTo(2.29f, 7.85f, 2f, 9.93f, 2f, 12f)
                reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f)
                lineToRelative(0.25f, 0.89f)
                lineToRelative(0.93f, 0.16f)
                curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f)
                reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f)
                lineToRelative(0.93f, -0.16f)
                lineToRelative(0.25f, -0.89f)
                curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f)
                reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f)
                lineToRelative(-0.25f, -0.89f)
                lineToRelative(-0.93f, -0.16f)
                curveTo(17.22f, 4.24f, 14.73f, 4f, 12f, 4f)
                close()
            }
        }.build()
        
        return _Panorama_wide_angle_select!!
    }

private var _Panorama_wide_angle_select: ImageVector? = null

