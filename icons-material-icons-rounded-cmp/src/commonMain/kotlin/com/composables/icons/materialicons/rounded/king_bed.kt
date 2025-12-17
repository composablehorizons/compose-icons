package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.King_bed: ImageVector
    get() {
        if (_King_bed != null) return _King_bed!!
        
        _King_bed = ImageVector.Builder(
            name = "king_bed",
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
                        fill = SolidColor(Color.Transparent)
                    ) {
                        moveTo(6f, 7f)
                        horizontalLineTo(11f)
                        verticalLineTo(10f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Transparent)
                    ) {
                        moveTo(13f, 7f)
                        horizontalLineTo(18f)
                        verticalLineTo(10f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 5f, 4f, 5.9f, 4f, 7f)
                        verticalLineToRelative(3f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(1.33f)
                        lineToRelative(0.51f, 1.53f)
                        curveTo(3.94f, 18.81f, 4.2f, 19f, 4.5f, 19f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.3f, 0f, 0.56f, -0.19f, 0.66f, -0.47f)
                        lineTo(5.67f, 17f)
                        horizontalLineToRelative(12.67f)
                        lineToRelative(0.51f, 1.53f)
                        curveTo(18.94f, 18.81f, 19.2f, 19f, 19.5f, 19f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.3f, 0f, 0.56f, -0.19f, 0.66f, -0.47f)
                        lineTo(20.67f, 17f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(-5f)
                        curveTo(22f, 10.9f, 21.1f, 10f, 20f, 10f)
                        close()
                        moveTo(11f, 10f)
                        horizontalLineTo(6f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(10f)
                        close()
                        moveTo(18f, 10f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _King_bed!!
    }

private var _King_bed: ImageVector? = null

