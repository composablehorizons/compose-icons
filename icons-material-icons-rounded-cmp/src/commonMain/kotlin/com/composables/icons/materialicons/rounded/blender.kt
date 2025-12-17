package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Blender: ImageVector
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
                        lineToRelative(1.69f, -10.98f)
                        curveTo(17.92f, 3.55f, 17.45f, 3f, 16.83f, 3f)
                        horizontalLineTo(14f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(0f)
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
                        moveTo(12f, 19f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(12.55f, 19f, 12f, 19f)
                        close()
                        moveTo(14.29f, 14f)
                        horizontalLineTo(9.72f)
                        lineTo(8.33f, 5f)
                        horizontalLineToRelative(7.34f)
                        lineTo(14.29f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Blender!!
    }

private var _Blender: ImageVector? = null

