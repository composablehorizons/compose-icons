package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Blender: ImageVector
    get() {
        if (_Blender != null) return _Blender!!
        
        _Blender = ImageVector.Builder(
            name = "blender",
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
                        moveTo(16.13f, 15.13f)
                        lineTo(18f, 3f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(2.23f)
                        lineToRelative(0.64f, 4.13f)
                        curveTo(6.74f, 16.05f, 6f, 17.43f, 6f, 19f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1f)
                        curveTo(18f, 17.43f, 17.26f, 16.05f, 16.13f, 15.13f)
                        close()
                        moveTo(5f, 9f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(1.31f)
                        lineToRelative(0.62f, 4f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(15.67f, 5f)
                        lineToRelative(-1.38f, 9f)
                        horizontalLineTo(9.72f)
                        lineTo(8.33f, 5f)
                        horizontalLineTo(15.67f)
                        close()
                        moveTo(16f, 20f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 18f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 19f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 18f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Blender!!
    }

private var _Blender: ImageVector? = null

