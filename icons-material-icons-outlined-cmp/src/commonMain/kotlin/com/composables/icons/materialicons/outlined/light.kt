package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Light: ImageVector
    get() {
        if (_Light != null) return _Light!!
        
        _Light = ImageVector.Builder(
            name = "light",
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
                        moveTo(13f, 6.06f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3.06f)
                        curveToRelative(-4.5f, 0.5f, -8f, 4.31f, -8f, 8.93f)
                        curveTo(3f, 16.1f, 3.9f, 17f, 5.01f, 17f)
                        horizontalLineTo(8f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        horizontalLineToRelative(2.99f)
                        curveTo(20.1f, 17f, 21f, 16.1f, 21f, 14.99f)
                        curveTo(21f, 10.37f, 17.5f, 6.56f, 13f, 6.06f)
                        close()
                        moveTo(12f, 19f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        horizontalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveTo(14f, 18.1f, 13.1f, 19f, 12f, 19f)
                        close()
                        moveTo(12f, 15f)
                        horizontalLineTo(5f)
                        curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                        reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                        horizontalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Light!!
    }

private var _Light: ImageVector? = null

