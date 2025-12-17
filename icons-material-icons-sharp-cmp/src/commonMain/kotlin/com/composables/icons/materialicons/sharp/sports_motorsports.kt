package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sports_motorsports: ImageVector
    get() {
        if (_Sports_motorsports != null) return _Sports_motorsports!!
        
        _Sports_motorsports = ImageVector.Builder(
            name = "sports_motorsports",
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
                        moveTo(12f, 11.39f)
                        curveToRelative(0f, -0.65f, -0.39f, -1.23f, -0.98f, -1.48f)
                        lineTo(5.44f, 7.55f)
                        curveToRelative(-1.48f, 1.68f, -2.32f, 3.7f, -2.8f, 5.45f)
                        horizontalLineToRelative(7.75f)
                        curveTo(11.28f, 13f, 12f, 12.28f, 12f, 11.39f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.96f, 11.22f)
                        curveToRelative(-0.41f, -4.41f, -4.56f, -7.49f, -8.98f, -7.2f)
                        curveToRelative(-2.51f, 0.16f, -4.44f, 0.94f, -5.93f, 2.04f)
                        lineToRelative(4.74f, 2.01f)
                        curveToRelative(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f)
                        curveToRelative(0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f)
                        horizontalLineTo(2.21f)
                        curveTo(2f, 16.31f, 2f, 17.2f, 2f, 17.2f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(12f)
                        curveTo(18.67f, 20f, 22.41f, 15.99f, 21.96f, 11.22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_motorsports!!
    }

private var _Sports_motorsports: ImageVector? = null

