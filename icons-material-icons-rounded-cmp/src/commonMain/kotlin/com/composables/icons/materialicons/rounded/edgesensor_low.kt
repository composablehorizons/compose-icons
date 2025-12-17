package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edgesensor_low: ImageVector
    get() {
        if (_Edgesensor_low != null) return _Edgesensor_low!!
        
        _Edgesensor_low = ImageVector.Builder(
            name = "edgesensor_low",
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
                        moveTo(3f, 7f)
                        lineTo(3f, 7f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(8f)
                        curveTo(2f, 7.45f, 2.45f, 7f, 3f, 7f)
                        close()
                        moveTo(21f, 10f)
                        lineTo(21f, 10f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-5f)
                        curveTo(20f, 10.45f, 20.45f, 10f, 21f, 10f)
                        close()
                        moveTo(16f, 2.01f)
                        lineTo(8f, 2f)
                        curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(18f, 2.9f, 17.1f, 2.01f, 16f, 2.01f)
                        close()
                        moveTo(16f, 17f)
                        horizontalLineTo(8f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edgesensor_low!!
    }

private var _Edgesensor_low: ImageVector? = null

