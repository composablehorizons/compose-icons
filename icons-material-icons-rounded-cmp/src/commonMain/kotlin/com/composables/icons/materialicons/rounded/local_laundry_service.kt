package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_laundry_service: ImageVector
    get() {
        if (_Local_laundry_service != null) return _Local_laundry_service!!
        
        _Local_laundry_service = ImageVector.Builder(
            name = "local_laundry_service",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9.64f, 16.36f)
                    curveToRelative(1.3f, 1.3f, 3.42f, 1.3f, 4.72f, 0f)
                    curveToRelative(1.3f, -1.3f, 1.3f, -3.42f, 0f, -4.72f)
                    lineTo(9.64f, 16.36f)
                    close()
                    moveTo(18f, 2.01f)
                    lineTo(6f, 2f)
                    curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(20f, 2.89f, 19.11f, 2.01f, 18f, 2.01f)
                    close()
                    moveTo(11f, 5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveTo(10.45f, 5f, 11f, 5f)
                    close()
                    moveTo(8f, 5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(8.55f, 7f, 8f, 7f)
                    reflectiveCurveTo(7f, 6.55f, 7f, 6f)
                    reflectiveCurveTo(7.45f, 5f, 8f, 5f)
                    close()
                    moveTo(12f, 19f)
                    curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                    curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    curveTo(17f, 16.76f, 14.76f, 19f, 12f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Local_laundry_service!!
    }

private var _Local_laundry_service: ImageVector? = null

