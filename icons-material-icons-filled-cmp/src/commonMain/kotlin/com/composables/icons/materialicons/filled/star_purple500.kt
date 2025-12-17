package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Star_purple500: ImageVector
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
                    moveTo(12f, 2f)
                    lineToRelative(-2.42f, 8f)
                    horizontalLineTo(2f)
                    lineToRelative(6.17f, 4.41f)
                    lineTo(5.83f, 22f)
                    lineTo(12f, 17.31f)
                    lineTo(18.18f, 22f)
                    lineToRelative(-2.35f, -7.59f)
                    lineTo(22f, 10f)
                    horizontalLineToRelative(-7.58f)
                    lineTo(12f, 2f)
                    lineTo(12f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Star_purple500!!
    }

private var _Star_purple500: ImageVector? = null

