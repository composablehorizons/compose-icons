package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Electrical_services: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 14f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveTo(20.55f, 15f, 21f, 14.55f, 21f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 17f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(21f, 17.45f, 20.55f, 17f, 20f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 14f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(-3f)
                        curveTo(12.9f, 12f, 12f, 12.9f, 12f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 13f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(1.5f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(10.43f, 4f, 8.5f, 4f)
                        horizontalLineTo(5f)
                        curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3.5f)
                        curveTo(9.33f, 6f, 10f, 6.67f, 10f, 7.5f)
                        reflectiveCurveTo(9.33f, 9f, 8.5f, 9f)
                        horizontalLineTo(7f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 15f, 5f, 14.1f, 5f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electrical_services!!
    }

private var _Electrical_services: ImageVector? = null

