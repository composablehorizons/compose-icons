package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Star_purple500: ImageVector
    get() {
        if (_Star_purple500 != null) return _Star_purple500!!
        
        _Star_purple500 = ImageVector.Builder(
            name = "star_purple500",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                group {
                    path(
                        fill = SolidColor(Color.Transparent)
                    ) {
                        moveTo(0f, 0f)
                        horizontalLineToRelative(24f)
                        verticalLineToRelative(24f)
                        horizontalLineTo(0f)
                        verticalLineTo(0f)
                        close()
                    }
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 8.89f)
                    lineTo(12.94f, 12f)
                    horizontalLineToRelative(2.82f)
                    lineToRelative(-2.27f, 1.62f)
                    lineToRelative(0.93f, 3.01f)
                    lineTo(12f, 14.79f)
                    lineToRelative(-2.42f, 1.84f)
                    lineToRelative(0.93f, -3.01f)
                    lineTo(8.24f, 12f)
                    horizontalLineToRelative(2.82f)
                    lineTo(12f, 8.89f)
                    moveTo(9.58f, 10f)
                    horizontalLineTo(5.12f)
                    curveToRelative(-0.97f, 0f, -1.37f, 1.25f, -0.58f, 1.81f)
                    lineToRelative(3.64f, 2.6f)
                    lineToRelative(-1.43f, 4.61f)
                    curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f)
                    lineTo(12f, 17.31f)
                    lineToRelative(3.69f, 2.81f)
                    curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f)
                    lineToRelative(-1.43f, -4.61f)
                    lineToRelative(3.64f, -2.6f)
                    curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f)
                    horizontalLineToRelative(-4.46f)
                    lineToRelative(-1.47f, -4.84f)
                    curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0f)
                    lineTo(9.58f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Star_purple500!!
    }

private var _Star_purple500: ImageVector? = null

