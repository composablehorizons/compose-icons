package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cell_wifi: ImageVector
    get() {
        if (_Cell_wifi != null) return _Cell_wifi!!
        
        _Cell_wifi = ImageVector.Builder(
            name = "cell_wifi",
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
                        moveTo(20.29f, 7.68f)
                        lineTo(7.7f, 20.29f)
                        curveTo(7.07f, 20.92f, 7.52f, 22f, 8.41f, 22f)
                        horizontalLineTo(21f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(8.39f)
                        curveTo(22f, 7.5f, 20.92f, 7.05f, 20.29f, 7.68f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-7.22f)
                        lineToRelative(2f, -2f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.61f, 10.68f)
                        curveToRelative(-0.28f, 0.17f, -0.32f, 0.56f, -0.09f, 0.79f)
                        lineToRelative(0.82f, 0.82f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0.82f, -0.82f)
                        curveToRelative(0.23f, -0.23f, 0.18f, -0.62f, -0.09f, -0.79f)
                        curveTo(11.61f, 10.14f, 10.49f, 10.14f, 9.61f, 10.68f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.42f, 9.3f)
                        curveToRelative(1.57f, -1.12f, 3.7f, -1.12f, 5.27f, 0f)
                        curveToRelative(0.36f, 0.26f, 0.85f, 0.22f, 1.16f, -0.1f)
                        curveToRelative(0.39f, -0.39f, 0.35f, -1.06f, -0.1f, -1.38f)
                        curveToRelative(-2.2f, -1.57f, -5.19f, -1.57f, -7.4f, 0f)
                        curveTo(6.9f, 8.14f, 6.85f, 8.81f, 7.25f, 9.2f)
                        curveTo(7.57f, 9.52f, 8.06f, 9.56f, 8.42f, 9.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.26f, 6.69f)
                        curveToRelative(0.34f, 0.28f, 0.83f, 0.28f, 1.14f, -0.03f)
                        lineToRelative(0.12f, -0.12f)
                        curveToRelative(0.35f, -0.35f, 0.31f, -0.92f, -0.08f, -1.24f)
                        curveToRelative(-3.67f, -3.05f, -9.02f, -3.07f, -12.7f, -0.06f)
                        curveTo(4.31f, 5.59f, 4.27f, 6.23f, 4.66f, 6.61f)
                        curveTo(4.98f, 6.94f, 5.5f, 6.98f, 5.85f, 6.69f)
                        curveTo(8.86f, 4.21f, 13.25f, 4.21f, 16.26f, 6.69f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cell_wifi!!
    }

private var _Cell_wifi: ImageVector? = null

