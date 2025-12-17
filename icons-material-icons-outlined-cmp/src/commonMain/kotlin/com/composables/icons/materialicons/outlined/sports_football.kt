package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sports_football: ImageVector
    get() {
        if (_Sports_football != null) return _Sports_football!!
        
        _Sports_football = ImageVector.Builder(
            name = "sports_football",
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
                        moveTo(20.31f, 3.69f)
                        curveTo(19.99f, 3.36f, 18.37f, 3f, 16.26f, 3f)
                        curveToRelative(-3.03f, 0f, -7.09f, 0.75f, -9.8f, 3.46f)
                        curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f)
                        curveTo(4.01f, 20.64f, 5.63f, 21f, 7.74f, 21f)
                        curveToRelative(3.03f, 0f, 7.09f, -0.75f, 9.8f, -3.46f)
                        curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f)
                        close()
                        moveTo(7.74f, 19f)
                        curveToRelative(-1.14f, 0f, -2.02f, -0.12f, -2.53f, -0.23f)
                        curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f)
                        lineToRelative(4.01f, 4.01f)
                        curveTo(8.53f, 18.99f, 8.08f, 19f, 7.74f, 19f)
                        close()
                        moveTo(16.13f, 16.13f)
                        curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f)
                        lineToRelative(-6.04f, -6.04f)
                        curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f)
                        curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f)
                        lineToRelative(6.05f, 6.05f)
                        curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f)
                        close()
                        moveTo(18.96f, 9.09f)
                        lineToRelative(-4.03f, -4.03f)
                        curveTo(15.45f, 5.01f, 15.91f, 5f, 16.26f, 5f)
                        curveToRelative(1.14f, 0f, 2.02f, 0.12f, 2.53f, 0.23f)
                        curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.499655f, 14.100187f)
                        lineTo(14.099886f, 8.499956f)
                        lineTo(15.499943f, 9.900013f)
                        lineTo(9.899712f, 15.500244f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_football!!
    }

private var _Sports_football: ImageVector? = null

