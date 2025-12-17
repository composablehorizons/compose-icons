package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nightlife: ImageVector
    get() {
        if (_Nightlife != null) return _Nightlife!!
        
        _Nightlife = ImageVector.Builder(
            name = "nightlife",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2.87f, 5f)
                            horizontalLineToRelative(10.26f)
                            curveToRelative(0.8f, 0f, 1.28f, 0.89f, 0.83f, 1.55f)
                            lineTo(9f, 14f)
                            verticalLineToRelative(4f)
                            horizontalLineToRelative(1f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineTo(6f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(-4f)
                            lineTo(2.04f, 6.55f)
                            curveTo(1.59f, 5.89f, 2.07f, 5f, 2.87f, 5f)
                            close()
                            moveTo(10.1f, 9f)
                            lineToRelative(1.4f, -2f)
                            horizontalLineTo(4.49f)
                            lineToRelative(1.4f, 2f)
                            horizontalLineTo(10.1f)
                            close()
                            moveTo(19f, 5f)
                            horizontalLineToRelative(1.5f)
                            curveTo(21.33f, 5f, 22f, 5.67f, 22f, 6.5f)
                            verticalLineToRelative(0f)
                            curveTo(22f, 7.33f, 21.33f, 8f, 20.5f, 8f)
                            horizontalLineTo(19f)
                            verticalLineToRelative(9f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0f, 1.84f, -1.64f, 3.28f, -3.54f, 2.95f)
                            curveToRelative(-1.21f, -0.21f, -2.2f, -1.2f, -2.41f, -2.41f)
                            curveTo(12.72f, 15.64f, 14.16f, 14f, 16f, 14f)
                            curveToRelative(0.35f, 0f, 0.69f, 0.06f, 1f, 0.17f)
                            verticalLineTo(7f)
                            curveTo(17f, 5.9f, 17.9f, 5f, 19f, 5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Nightlife!!
    }

private var _Nightlife: ImageVector? = null

