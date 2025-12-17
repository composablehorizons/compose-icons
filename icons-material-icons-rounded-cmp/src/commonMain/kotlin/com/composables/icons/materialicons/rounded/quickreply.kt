package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Quickreply: ImageVector
    get() {
        if (_Quickreply != null) return _Quickreply!!
        
        _Quickreply = ImageVector.Builder(
            name = "quickreply",
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
                            moveTo(22f, 4f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 2f, 2.01f, 2.9f, 2.01f, 4f)
                            lineTo(2f, 22f)
                            lineToRelative(4f, -4f)
                            horizontalLineToRelative(9f)
                            verticalLineToRelative(-7f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(6f)
                            verticalLineTo(4f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.69f, 16f)
                            horizontalLineTo(20.3f)
                            lineToRelative(1.4f, -3.3f)
                            curveToRelative(0.14f, -0.33f, -0.1f, -0.7f, -0.46f, -0.7f)
                            horizontalLineTo(17.5f)
                            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                            verticalLineToRelative(5f)
                            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                            horizontalLineTo(19f)
                            verticalLineToRelative(3.94f)
                            curveToRelative(0f, 0.26f, 0.36f, 0.35f, 0.47f, 0.11f)
                            lineToRelative(2.66f, -5.33f)
                            curveTo(22.3f, 16.39f, 22.06f, 16f, 21.69f, 16f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Quickreply!!
    }

private var _Quickreply: ImageVector? = null

