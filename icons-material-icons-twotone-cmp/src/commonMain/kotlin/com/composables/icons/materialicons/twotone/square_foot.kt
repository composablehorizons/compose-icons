package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Square_foot: ImageVector
    get() {
        if (_Square_foot != null) return _Square_foot!!
        
        _Square_foot = ImageVector.Builder(
            name = "square_foot",
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
                        moveTo(7f, 17f)
                        lineTo(12.76f, 17f)
                        lineTo(7f, 11.24f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.66f, 17.66f)
                            lineToRelative(-1.06f, 1.06f)
                            lineToRelative(-0.71f, -0.71f)
                            lineToRelative(1.06f, -1.06f)
                            lineToRelative(-1.94f, -1.94f)
                            lineToRelative(-1.06f, 1.06f)
                            lineToRelative(-0.71f, -0.71f)
                            lineToRelative(1.06f, -1.06f)
                            lineToRelative(-1.94f, -1.94f)
                            lineToRelative(-1.06f, 1.06f)
                            lineToRelative(-0.71f, -0.71f)
                            lineToRelative(1.06f, -1.06f)
                            lineTo(9.7f, 9.7f)
                            lineToRelative(-1.06f, 1.06f)
                            lineToRelative(-0.71f, -0.71f)
                            lineToRelative(1.06f, -1.06f)
                            lineTo(7.05f, 7.05f)
                            lineTo(5.99f, 8.11f)
                            lineTo(5.28f, 7.4f)
                            lineToRelative(1.06f, -1.06f)
                            lineTo(4f, 4f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            lineTo(17.66f, 17.66f)
                            close()
                            moveTo(7f, 17f)
                            verticalLineToRelative(-5.76f)
                            lineTo(12.76f, 17f)
                            horizontalLineTo(7f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Square_foot!!
    }

private var _Square_foot: ImageVector? = null

