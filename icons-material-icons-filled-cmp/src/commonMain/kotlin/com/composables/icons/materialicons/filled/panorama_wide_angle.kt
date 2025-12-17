package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Panorama_wide_angle: ImageVector
    get() {
        if (_Panorama_wide_angle != null) return _Panorama_wide_angle!!
        
        _Panorama_wide_angle = ImageVector.Builder(
            name = "panorama_wide_angle",
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
                moveTo(12f, 6f)
                curveToRelative(2.45f, 0f, 4.71f, 0.2f, 7.29f, 0.64f)
                curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f)
                curveToRelative(0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f)
                curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f)
                reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f)
                curveTo(4.24f, 15.58f, 4f, 13.78f, 4f, 12f)
                curveToRelative(0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f)
                curveTo(7.29f, 6.2f, 9.55f, 6f, 12f, 6f)
                moveToRelative(0f, -2f)
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
        
        return _Panorama_wide_angle!!
    }

private var _Panorama_wide_angle: ImageVector? = null

