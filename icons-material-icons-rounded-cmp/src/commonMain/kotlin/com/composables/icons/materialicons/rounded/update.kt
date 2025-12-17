package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Update: ImageVector
    get() {
        if (_Update != null) return _Update!!
        
        _Update = ImageVector.Builder(
            name = "update",
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
                        moveTo(11f, 8.75f)
                        verticalLineToRelative(3.68f)
                        curveToRelative(0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f)
                        lineToRelative(3.12f, 1.85f)
                        curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f)
                        curveToRelative(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f)
                        lineToRelative(-2.87f, -1.71f)
                        verticalLineToRelative(-3.4f)
                        curveTo(12.5f, 8.34f, 12.16f, 8f, 11.75f, 8f)
                        reflectiveCurveTo(11f, 8.34f, 11f, 8.75f)
                        close()
                        moveTo(21f, 9.5f)
                        verticalLineTo(4.21f)
                        curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                        lineToRelative(-1.78f, 1.78f)
                        curveToRelative(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f)
                        curveToRelative(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f)
                        curveTo(2.46f, 16.4f, 6.69f, 21f, 12f, 21f)
                        curveToRelative(4.59f, 0f, 8.38f, -3.44f, 8.93f, -7.88f)
                        curveToRelative(0.07f, -0.6f, -0.4f, -1.12f, -1f, -1.12f)
                        curveToRelative(-0.5f, 0f, -0.92f, 0.37f, -0.98f, 0.86f)
                        curveToRelative(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f)
                        curveToRelative(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f)
                        curveTo(4.94f, 8.2f, 8.11f, 5f, 12f, 5f)
                        curveToRelative(1.93f, 0f, 3.68f, 0.79f, 4.95f, 2.05f)
                        lineToRelative(-2.09f, 2.09f)
                        curveTo(14.54f, 9.46f, 14.76f, 10f, 15.21f, 10f)
                        horizontalLineToRelative(5.29f)
                        curveTo(20.78f, 10f, 21f, 9.78f, 21f, 9.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Update!!
    }

private var _Update: ImageVector? = null

