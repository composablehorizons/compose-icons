package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Design_services: ImageVector
    get() {
        if (_Design_services != null) return _Design_services!!
        
        _Design_services = ImageVector.Builder(
            name = "design_services",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.79f, 17.06f)
                        lineToRelative(-5.55f, -5.55f)
                        lineToRelative(1.57f, -1.57f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-1.57f, 1.57f)
                        lineTo(6.94f, 2.21f)
                        lineTo(2.21f, 6.94f)
                        lineToRelative(5.55f, 5.55f)
                        lineTo(3f, 17.25f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(3.75f)
                        lineToRelative(4.76f, -4.76f)
                        lineToRelative(5.55f, 5.55f)
                        lineToRelative(0f, 0f)
                        verticalLineToRelative(0f)
                        lineTo(21.79f, 17.06f)
                        close()
                        moveTo(9.18f, 11.07f)
                        lineTo(5.04f, 6.94f)
                        lineToRelative(1.9f, -1.9f)
                        lineToRelative(1.27f, 1.27f)
                        lineTo(7.02f, 7.5f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(1.19f, -1.19f)
                        lineToRelative(1.45f, 1.45f)
                        lineTo(9.18f, 11.07f)
                        close()
                        moveTo(12.93f, 14.82f)
                        lineToRelative(1.9f, -1.9f)
                        lineToRelative(1.45f, 1.45f)
                        lineToRelative(-1.19f, 1.19f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(1.19f, -1.19f)
                        lineToRelative(1.27f, 1.27f)
                        lineToRelative(-1.9f, 1.9f)
                        lineTo(12.93f, 14.82f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.132875f, 5.12296f)
                        lineTo(17.671364f, 2.5844717f)
                        lineTo(21.418993f, 6.332102f)
                        lineTo(18.880507f, 8.87059f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Design_services!!
    }

private var _Design_services: ImageVector? = null

