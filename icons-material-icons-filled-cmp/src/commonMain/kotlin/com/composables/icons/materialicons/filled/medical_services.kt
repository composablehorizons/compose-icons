package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Medical_services: ImageVector
    get() {
        if (_Medical_services != null) return _Medical_services!!
        
        _Medical_services = ImageVector.Builder(
            name = "medical_services",
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
                        moveTo(20f, 6f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveTo(8.9f, 2f, 8f, 2.9f, 8f, 4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                        close()
                        moveTo(10f, 4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(4f)
                        close()
                        moveTo(16f, 15f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medical_services!!
    }

private var _Medical_services: ImageVector? = null

