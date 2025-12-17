package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Electrical_services: ImageVector
    get() {
        if (_Electrical_services != null) return _Electrical_services!!
        
        _Electrical_services = ImageVector.Builder(
            name = "electrical_services",
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
                    moveTo(20f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(21f, 14.55f, 20.55f, 15f, 20f, 15f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(21f, 18.55f, 20.55f, 19f, 20f, 19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 12f)
                    lineTo(14f, 12f)
                    lineTo(14f, 12f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(0f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(0f)
                    horizontalLineToRelative(3f)
                    lineToRelative(0f, 0f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 5f)
                    lineTo(4f, 5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3.5f)
                    curveTo(9.33f, 6f, 10f, 6.67f, 10f, 7.5f)
                    verticalLineToRelative(0f)
                    curveTo(10f, 8.33f, 9.33f, 9f, 8.5f, 9f)
                    horizontalLineTo(7f)
                    curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(1.5f)
                    curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                    verticalLineToRelative(0f)
                    curveTo(12f, 5.57f, 10.43f, 4f, 8.5f, 4f)
                    horizontalLineTo(5f)
                    curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Electrical_services!!
    }

private var _Electrical_services: ImageVector? = null

