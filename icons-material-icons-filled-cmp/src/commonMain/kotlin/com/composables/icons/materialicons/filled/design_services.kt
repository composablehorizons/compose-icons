package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Design_services: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.24f, 11.51f)
                        lineToRelative(1.57f, -1.57f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-1.57f, 1.57f)
                        lineTo(8.35f, 3.63f)
                        curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                        lineToRelative(-1.9f, 1.9f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(4.13f, 4.13f)
                        lineTo(3f, 17.25f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(3.75f)
                        lineToRelative(4.76f, -4.76f)
                        lineToRelative(4.13f, 4.13f)
                        curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0f)
                        lineToRelative(1.9f, -1.9f)
                        curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                        lineTo(16.24f, 11.51f)
                        close()
                        moveTo(9.18f, 11.07f)
                        lineTo(5.04f, 6.94f)
                        lineToRelative(1.89f, -1.9f)
                        curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                        lineToRelative(1.27f, 1.27f)
                        lineTo(7.02f, 7.5f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(1.19f, -1.19f)
                        lineToRelative(1.45f, 1.45f)
                        lineTo(9.18f, 11.07f)
                        close()
                        moveTo(17.06f, 18.96f)
                        lineToRelative(-4.13f, -4.13f)
                        lineToRelative(1.9f, -1.9f)
                        lineToRelative(1.45f, 1.45f)
                        lineToRelative(-1.19f, 1.19f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(1.19f, -1.19f)
                        lineToRelative(1.27f, 1.27f)
                        lineTo(17.06f, 18.96f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.71f, 7.04f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-2.34f, -2.34f)
                        curveToRelative(-0.47f, -0.47f, -1.12f, -0.29f, -1.41f, 0f)
                        lineToRelative(-1.83f, 1.83f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(20.71f, 7.04f)
                        close()
                    }
                }
                group {
                }
            }
        }.build()
        
        return _Design_services!!
    }

private var _Design_services: ImageVector? = null

