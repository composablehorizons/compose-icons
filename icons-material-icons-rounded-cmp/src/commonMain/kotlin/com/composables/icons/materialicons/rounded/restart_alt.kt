package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Restart_alt: ImageVector
    get() {
        if (_Restart_alt != null) return _Restart_alt!!
        
        _Restart_alt = ImageVector.Builder(
            name = "restart_alt",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(12f, 5f)
                        verticalLineTo(3.21f)
                        curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                        lineTo(8.35f, 5.65f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(2.79f, 2.79f)
                        curveTo(11.46f, 9.46f, 12f, 9.24f, 12f, 8.79f)
                        verticalLineTo(7f)
                        curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                        curveToRelative(0f, 2.72f, -1.83f, 5.02f, -4.31f, 5.75f)
                        curveTo(13.27f, 18.87f, 13f, 19.27f, 13f, 19.7f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.65f, 0.62f, 1.16f, 1.25f, 0.97f)
                        curveTo(17.57f, 19.7f, 20f, 16.64f, 20f, 13f)
                        curveTo(20f, 8.58f, 16.42f, 5f, 12f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 13f)
                        curveToRelative(0f, -1.34f, 0.44f, -2.58f, 1.19f, -3.59f)
                        curveToRelative(0.3f, -0.4f, 0.26f, -0.95f, -0.09f, -1.31f)
                        lineToRelative(0f, 0f)
                        curveTo(6.68f, 7.68f, 5.96f, 7.72f, 5.6f, 8.2f)
                        curveTo(4.6f, 9.54f, 4f, 11.2f, 4f, 13f)
                        curveToRelative(0f, 3.64f, 2.43f, 6.7f, 5.75f, 7.67f)
                        curveTo(10.38f, 20.86f, 11f, 20.35f, 11f, 19.7f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.43f, -0.27f, -0.83f, -0.69f, -0.95f)
                        curveTo(7.83f, 18.02f, 6f, 15.72f, 6f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Restart_alt!!
    }

private var _Restart_alt: ImageVector? = null

