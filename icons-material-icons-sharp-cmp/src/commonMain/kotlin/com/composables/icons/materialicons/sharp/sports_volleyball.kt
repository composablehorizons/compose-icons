package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sports_volleyball: ImageVector
    get() {
        if (_Sports_volleyball != null) return _Sports_volleyball!!
        
        _Sports_volleyball = ImageVector.Builder(
            name = "sports_volleyball",
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
                        moveTo(6f, 4.01f)
                        curveTo(3.58f, 5.84f, 2f, 8.73f, 2f, 12f)
                        curveToRelative(0f, 1.46f, 0.32f, 2.85f, 0.89f, 4.11f)
                        lineTo(6f, 14.31f)
                        verticalLineTo(4.01f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 11.42f)
                        verticalLineTo(2.05f)
                        curveTo(9.94f, 2.16f, 8.93f, 2.43f, 8f, 2.84f)
                        verticalLineToRelative(10.32f)
                        lineTo(11f, 11.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 13.15f)
                        lineToRelative(-8.11f, 4.68f)
                        curveToRelative(0.61f, 0.84f, 1.34f, 1.59f, 2.18f, 2.2f)
                        lineTo(15f, 14.89f)
                        lineTo(12f, 13.15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 7.96f)
                        verticalLineToRelative(3.46f)
                        lineToRelative(8.11f, 4.68f)
                        curveToRelative(0.42f, -0.93f, 0.7f, -1.93f, 0.82f, -2.98f)
                        lineTo(13f, 7.96f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.07f, 21.2f)
                        curveTo(9.28f, 21.71f, 10.6f, 22f, 12f, 22f)
                        curveToRelative(3.34f, 0f, 6.29f, -1.65f, 8.11f, -4.16f)
                        lineTo(17f, 16.04f)
                        lineTo(8.07f, 21.2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.92f, 10.81f)
                        curveToRelative(-0.55f, -4.63f, -4.26f, -8.3f, -8.92f, -8.76f)
                        verticalLineToRelative(3.6f)
                        lineTo(21.92f, 10.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_volleyball!!
    }

private var _Sports_volleyball: ImageVector? = null

