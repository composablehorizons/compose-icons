package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sports_handball: ImageVector
    get() {
        if (_Sports_handball != null) return _Sports_handball!!
        
        _Sports_handball = ImageVector.Builder(
            name = "sports_handball",
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
                        moveTo(14.27f, 6f)
                        curveTo(13.72f, 6.95f, 14.05f, 8.18f, 15f, 8.73f)
                        curveToRelative(0.95f, 0.55f, 2.18f, 0.22f, 2.73f, -0.73f)
                        curveToRelative(0.55f, -0.95f, 0.22f, -2.18f, -0.73f, -2.73f)
                        curveTo(16.05f, 4.72f, 14.82f, 5.05f, 14.27f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.84f, 10.41f)
                        curveToRelative(0f, 0f, -1.63f, -0.94f, -2.6f, -1.5f)
                        curveToRelative(-2.38f, -1.38f, -3.2f, -4.44f, -1.82f, -6.82f)
                        lineToRelative(-1.73f, -1f)
                        curveTo(8.1f, 3.83f, 8.6f, 7.21f, 10.66f, 9.4f)
                        lineToRelative(-5.15f, 8.92f)
                        lineToRelative(1.73f, 1f)
                        lineToRelative(1.5f, -2.6f)
                        lineToRelative(1.73f, 1f)
                        lineToRelative(-3f, 5.2f)
                        lineToRelative(1.73f, 1f)
                        lineToRelative(6.29f, -10.89f)
                        curveToRelative(1.14f, 1.55f, 1.33f, 3.69f, 0.31f, 5.46f)
                        lineToRelative(1.73f, 1f)
                        curveTo(19.13f, 16.74f, 18.81f, 12.91f, 15.84f, 10.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.75f, 3.8f)
                        curveToRelative(0.72f, 0.41f, 1.63f, 0.17f, 2.05f, -0.55f)
                        curveToRelative(0.41f, -0.72f, 0.17f, -1.63f, -0.55f, -2.05f)
                        curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f)
                        curveTo(11.79f, 2.47f, 12.03f, 3.39f, 12.75f, 3.8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_handball!!
    }

private var _Sports_handball: ImageVector? = null

