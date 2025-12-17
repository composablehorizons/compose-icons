package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nearby_error: ImageVector
    get() {
        if (_Nearby_error != null) return _Nearby_error!!
        
        _Nearby_error = ImageVector.Builder(
            name = "nearby_error",
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
                        moveTo(11.29f, 8.28f)
                        lineToRelative(-3.01f, 3.01f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(3.01f, 3.01f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(3.01f, -3.01f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-3.01f, -3.01f)
                        curveTo(12.32f, 7.89f, 11.68f, 7.89f, 11.29f, 8.28f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.59f, 2.59f)
                        lineToRelative(-8.01f, 8f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(8.01f, 8f)
                        curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                        lineTo(18f, 16.82f)
                        verticalLineTo(13.2f)
                        lineToRelative(-6f, 6f)
                        lineTo(4.79f, 12f)
                        lineTo(12f, 4.79f)
                        lineToRelative(6f, 6f)
                        verticalLineTo(7.17f)
                        lineToRelative(-4.58f, -4.58f)
                        curveTo(12.64f, 1.8f, 11.37f, 1.8f, 10.59f, 2.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 11f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-6f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(20.45f, 10f, 20f, 10.45f, 20f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 21f)
                        arcTo(1f, 1f, 0f, false, true, 21f, 22f)
                        arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                        arcTo(1f, 1f, 0f, false, true, 22f, 21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nearby_error!!
    }

private var _Nearby_error: ImageVector? = null

