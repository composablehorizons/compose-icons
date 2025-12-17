package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Unarchive: ImageVector
    get() {
        if (_Unarchive != null) return _Unarchive!!
        
        _Unarchive = ImageVector.Builder(
            name = "unarchive",
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
                            moveTo(20.55f, 5.22f)
                            lineToRelative(-1.39f, -1.68f)
                            curveTo(18.88f, 3.21f, 18.47f, 3f, 18f, 3f)
                            horizontalLineTo(6f)
                            curveTo(5.53f, 3f, 5.12f, 3.21f, 4.85f, 3.55f)
                            lineTo(3.46f, 5.22f)
                            curveTo(3.17f, 5.57f, 3f, 6.01f, 3f, 6.5f)
                            verticalLineTo(19f)
                            curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(6.5f)
                            curveTo(21f, 6.01f, 20.83f, 5.57f, 20.55f, 5.22f)
                            close()
                            moveTo(12f, 9.5f)
                            lineToRelative(5.5f, 5.5f)
                            horizontalLineTo(14f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(-4f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(6.5f)
                            lineTo(12f, 9.5f)
                            close()
                            moveTo(5.12f, 5f)
                            lineToRelative(0.82f, -1f)
                            horizontalLineToRelative(12f)
                            lineToRelative(0.93f, 1f)
                            horizontalLineTo(5.12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Unarchive!!
    }

private var _Unarchive: ImageVector? = null

