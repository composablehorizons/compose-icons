package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Highlight: ImageVector
    get() {
        if (_Highlight != null) return _Highlight!!
        
        _Highlight = ImageVector.Builder(
            name = "highlight",
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
                            moveTo(6f, 14f)
                            lineToRelative(3f, 3f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(6f)
                            verticalLineToRelative(-5f)
                            lineToRelative(3f, -3f)
                            verticalLineTo(9f)
                            horizontalLineTo(6f)
                            verticalLineTo(14f)
                            close()
                            moveTo(11f, 2f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(2f)
                            close()
                            moveTo(3.5f, 5.88f)
                            lineToRelative(1.41f, -1.41f)
                            lineToRelative(2.12f, 2.12f)
                            lineTo(5.62f, 8f)
                            lineTo(3.5f, 5.88f)
                            close()
                            moveTo(16.96f, 6.59f)
                            lineToRelative(2.12f, -2.12f)
                            lineToRelative(1.41f, 1.41f)
                            lineTo(18.38f, 8f)
                            lineTo(16.96f, 6.59f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Highlight!!
    }

private var _Highlight: ImageVector? = null

