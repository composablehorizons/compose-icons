package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Next_week: ImageVector
    get() {
        if (_Next_week != null) return _Next_week!!
        
        _Next_week = ImageVector.Builder(
            name = "next_week",
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
                            moveTo(20f, 7f)
                            horizontalLineToRelative(-4f)
                            verticalLineTo(5f)
                            curveToRelative(0f, -0.55f, -0.22f, -1.05f, -0.59f, -1.41f)
                            curveTo(15.05f, 3.22f, 14.55f, 3f, 14f, 3f)
                            horizontalLineToRelative(-4f)
                            curveTo(8.9f, 3f, 8f, 3.9f, 8f, 5f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                            verticalLineToRelative(11f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(16f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(9f)
                            curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                            close()
                            moveTo(10f, 5f)
                            horizontalLineToRelative(4f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(-4f)
                            verticalLineTo(5f)
                            close()
                            moveTo(11f, 18.5f)
                            lineToRelative(-1f, -1f)
                            lineToRelative(3f, -3f)
                            lineToRelative(-3f, -3f)
                            lineToRelative(1f, -1f)
                            lineToRelative(4f, 4f)
                            lineTo(11f, 18.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Next_week!!
    }

private var _Next_week: ImageVector? = null

