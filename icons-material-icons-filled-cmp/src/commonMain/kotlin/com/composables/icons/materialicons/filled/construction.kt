package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Construction: ImageVector
    get() {
        if (_Construction != null) return _Construction!!
        
        _Construction = ImageVector.Builder(
            name = "construction",
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
                        moveTo(13.782688f, 15.171863f)
                        lineTo(15.90399f, 13.050562f)
                        lineTo(21.900196f, 19.046768f)
                        lineTo(19.778896f, 21.16807f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.5f, 10f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        curveToRelative(0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f)
                        lineToRelative(-2.7f, 2.7f)
                        lineTo(16.4f, 6.11f)
                        lineToRelative(2.7f, -2.7f)
                        curveTo(18.62f, 3.16f, 18.08f, 3f, 17.5f, 3f)
                        curveTo(15.57f, 3f, 14f, 4.57f, 14f, 6.5f)
                        curveToRelative(0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f)
                        lineToRelative(-1.85f, 1.85f)
                        lineToRelative(-1.78f, -1.78f)
                        lineToRelative(0.71f, -0.71f)
                        lineTo(9.88f, 5.61f)
                        lineTo(12f, 3.49f)
                        curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                        lineTo(4.22f, 7.03f)
                        lineToRelative(1.41f, 1.41f)
                        horizontalLineTo(2.81f)
                        lineTo(2.1f, 9.15f)
                        lineToRelative(3.54f, 3.54f)
                        lineToRelative(0.71f, -0.71f)
                        verticalLineTo(9.15f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(0.71f, -0.71f)
                        lineToRelative(1.78f, 1.78f)
                        lineToRelative(-7.41f, 7.41f)
                        lineToRelative(2.12f, 2.12f)
                        lineTo(16.34f, 9.79f)
                        curveTo(16.7f, 9.92f, 17.09f, 10f, 17.5f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Construction!!
    }

private var _Construction: ImageVector? = null

