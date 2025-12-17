package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cameraswitch: ImageVector
    get() {
        if (_Cameraswitch != null) return _Cameraswitch!!
        
        _Cameraswitch = ImageVector.Builder(
            name = "cameraswitch",
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
                        moveTo(16f, 7f)
                        horizontalLineToRelative(-1f)
                        lineToRelative(-1f, -1f)
                        horizontalLineToRelative(-4f)
                        lineTo(9f, 7f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 7f, 6f, 7.9f, 6f, 9f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9f)
                        curveTo(18f, 7.9f, 17.1f, 7f, 16f, 7f)
                        close()
                        moveTo(16f, 15f)
                        horizontalLineTo(8f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(1.83f)
                        lineToRelative(1f, -1f)
                        horizontalLineToRelative(2.34f)
                        lineToRelative(1f, 1f)
                        horizontalLineTo(16f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.57f, 0.52f)
                        lineTo(13.05f, 5f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(-1.54f, -1.54f)
                        curveTo(17.7f, 2.46f, 21.53f, 6.24f, 22f, 11f)
                        horizontalLineToRelative(2f)
                        curveTo(23.36f, 3.3f, 15.79f, -1.67f, 8.57f, 0.52f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.54f, 20.41f)
                        lineToRelative(1.54f, 1.54f)
                        curveTo(6.3f, 21.54f, 2.47f, 17.76f, 2f, 13f)
                        horizontalLineTo(0f)
                        curveToRelative(0.64f, 7.7f, 8.21f, 12.67f, 15.43f, 10.48f)
                        lineTo(10.95f, 19f)
                        lineTo(9.54f, 20.41f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cameraswitch!!
    }

private var _Cameraswitch: ImageVector? = null

