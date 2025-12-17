package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flag_circle: ImageVector
    get() {
        if (_Flag_circle != null) return _Flag_circle!!
        
        _Flag_circle = ImageVector.Builder(
            name = "flag_circle",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(17f, 15f)
                        horizontalLineToRelative(-3.38f)
                        curveToRelative(-0.38f, 0f, -0.73f, -0.21f, -0.89f, -0.55f)
                        lineTo(12f, 13f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(4.25f)
                        curveTo(9.5f, 17.66f, 9.16f, 18f, 8.75f, 18f)
                        horizontalLineToRelative(0f)
                        curveTo(8.34f, 18f, 8f, 17.66f, 8f, 17.25f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4.38f)
                        curveToRelative(0.38f, 0f, 0.73f, 0.21f, 0.89f, 0.55f)
                        lineTo(15f, 9f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        curveTo(18f, 14.55f, 17.55f, 15f, 17f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flag_circle!!
    }

private var _Flag_circle: ImageVector? = null

