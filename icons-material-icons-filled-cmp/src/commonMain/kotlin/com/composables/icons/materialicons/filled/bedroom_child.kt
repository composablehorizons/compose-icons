package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bedroom_child: ImageVector
    get() {
        if (_Bedroom_child != null) return _Bedroom_child!!
        
        _Bedroom_child = ImageVector.Builder(
            name = "bedroom_child",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(9f, 8.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(10.5f)
                        horizontalLineTo(9f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.64f, 12f)
                        horizontalLineTo(8.37f)
                        curveToRelative(-0.48f, 0f, -0.87f, 0.39f, -0.87f, 0.87f)
                        horizontalLineToRelative(0.01f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-1.13f)
                        curveTo(16.51f, 12.39f, 16.12f, 12f, 15.64f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(18f, 17f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(-9f)
                        verticalLineTo(17f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-4.13f)
                        curveToRelative(0f, -1f, 0.62f, -1.85f, 1.5f, -2.2f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(1.67f)
                        curveToRelative(0.88f, 0.35f, 1.5f, 1.2f, 1.5f, 2.2f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedroom_child!!
    }

private var _Bedroom_child: ImageVector? = null

