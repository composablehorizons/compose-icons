package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_laundry_service: ImageVector
    get() {
        if (_Local_laundry_service != null) return _Local_laundry_service!!
        
        _Local_laundry_service = ImageVector.Builder(
            name = "local_laundry_service",
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
                moveTo(18f, 2.01f)
                lineTo(6f, 2f)
                curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.11f, -0.89f, -1.99f, -2f, -1.99f)
                close()
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                lineTo(5.99f, 4f)
                horizontalLineTo(18f)
                verticalLineToRelative(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                arcTo(1f, 1f, 0f, false, true, 8f, 7f)
                arcTo(1f, 1f, 0f, false, true, 7f, 6f)
                arcTo(1f, 1f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                arcTo(1f, 1f, 0f, false, true, 11f, 7f)
                arcTo(1f, 1f, 0f, false, true, 10f, 6f)
                arcTo(1f, 1f, 0f, false, true, 12f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 19f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveToRelative(2.36f, -7.36f)
                curveToRelative(1.3f, 1.3f, 1.3f, 3.42f, 0f, 4.72f)
                curveToRelative(-1.3f, 1.3f, -3.42f, 1.3f, -4.72f, 0f)
                lineToRelative(4.72f, -4.72f)
                close()
            }
        }.build()
        
        return _Local_laundry_service!!
    }

private var _Local_laundry_service: ImageVector? = null

