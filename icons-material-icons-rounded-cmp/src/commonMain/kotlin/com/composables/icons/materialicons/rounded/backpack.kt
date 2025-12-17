package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Backpack: ImageVector
    get() {
        if (_Backpack != null) return _Backpack!!
        
        _Backpack = ImageVector.Builder(
            name = "backpack",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 8f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            horizontalLineTo(6f)
                            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                            verticalLineTo(8f)
                            curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                            verticalLineTo(3.5f)
                            curveTo(7f, 2.67f, 7.67f, 2f, 8.5f, 2f)
                            horizontalLineToRelative(0f)
                            curveTo(9.33f, 2f, 10f, 2.67f, 10f, 3.5f)
                            verticalLineTo(4f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(3.5f)
                            curveTo(14f, 2.67f, 14.67f, 2f, 15.5f, 2f)
                            horizontalLineToRelative(0f)
                            curveTo(16.33f, 2f, 17f, 2.67f, 17f, 3.5f)
                            verticalLineToRelative(0.64f)
                            curveTo(18.72f, 4.59f, 20f, 6.14f, 20f, 8f)
                            close()
                            moveTo(6f, 13f)
                            lineTo(6f, 13f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(9f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-2f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(7f)
                            curveTo(6.45f, 12f, 6f, 12.45f, 6f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

