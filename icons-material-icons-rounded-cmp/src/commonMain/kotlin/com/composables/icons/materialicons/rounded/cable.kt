package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cable: ImageVector
    get() {
        if (_Cable != null) return _Cable!!
        
        _Cable = ImageVector.Builder(
            name = "cable",
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
                        moveTo(20f, 5f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        lineToRelative(0f, 6.91f)
                        curveToRelative(0f, 1.04f, -0.76f, 1.98f, -1.79f, 2.08f)
                        curveTo(14.01f, 19.11f, 13f, 18.17f, 13f, 17f)
                        lineToRelative(0f, -9.86f)
                        curveToRelative(0f, -2.13f, -1.61f, -3.99f, -3.74f, -4.13f)
                        curveTo(6.93f, 2.86f, 5f, 4.7f, 5f, 7f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(7f)
                        lineToRelative(0f, -6.91f)
                        curveToRelative(0f, -1.04f, 0.76f, -1.98f, 1.79f, -2.08f)
                        curveTo(9.99f, 4.89f, 11f, 5.83f, 11f, 7f)
                        lineToRelative(0f, 9.86f)
                        curveToRelative(0f, 2.13f, 1.61f, 3.99f, 3.74f, 4.13f)
                        curveTo(17.07f, 21.14f, 19f, 19.3f, 19f, 17f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(6f)
                        curveTo(21f, 5.45f, 20.55f, 5f, 20f, 5f)
                        lineTo(20f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cable!!
    }

private var _Cable: ImageVector? = null

