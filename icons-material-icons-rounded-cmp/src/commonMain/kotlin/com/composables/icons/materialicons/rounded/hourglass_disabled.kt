package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hourglass_disabled: ImageVector
    get() {
        if (_Hourglass_disabled != null) return _Hourglass_disabled!!
        
        _Hourglass_disabled = ImageVector.Builder(
            name = "hourglass_disabled",
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
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                        lineToRelative(8.19f, 8.19f)
                        lineToRelative(-3f, 3.01f)
                        curveTo(6.21f, 15.8f, 6f, 16.31f, 6f, 16.84f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.86f, 0f, 1.58f, -0.54f, 1.87f, -1.3f)
                        lineToRelative(1.91f, 1.91f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(16f, 19f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(9f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-2.5f)
                        lineToRelative(2.84f, -2.84f)
                        lineTo(16f, 18.83f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2.5f)
                        lineToRelative(-2.84f, 2.84f)
                        lineToRelative(1.25f, 1.25f)
                        lineToRelative(3f, -2.99f)
                        curveTo(17.79f, 8.22f, 18f, 7.71f, 18f, 7.18f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(8f)
                        curveTo(7.14f, 2f, 6.42f, 2.54f, 6.13f, 3.3f)
                        lineTo(8f, 5.17f)
                        verticalLineTo(5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hourglass_disabled!!
    }

private var _Hourglass_disabled: ImageVector? = null

