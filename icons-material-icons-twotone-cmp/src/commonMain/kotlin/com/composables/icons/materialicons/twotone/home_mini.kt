package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Home_mini: ImageVector
    get() {
        if (_Home_mini != null) return _Home_mini!!
        
        _Home_mini = ImageVector.Builder(
            name = "home_mini",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 7f)
                        curveToRelative(-7.91f, 0f, -8f, 4.8f, -8f, 5f)
                        horizontalLineToRelative(16f)
                        curveTo(19.99f, 11.51f, 19.64f, 7f, 12f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.14f, 17f)
                        horizontalLineToRelative(5.72f)
                        curveToRelative(2.1f, 0f, 3.92f, -1.24f, 4.71f, -3f)
                        horizontalLineTo(4.42f)
                        curveTo(5.22f, 15.76f, 7.04f, 17f, 9.14f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 5f)
                        curveTo(4.19f, 5f, 2f, 9.48f, 2f, 12f)
                        curveToRelative(0f, 3.86f, 3.13f, 7f, 6.99f, 7f)
                        horizontalLineToRelative(6.02f)
                        curveToRelative(2.69f, 0f, 6.99f, -2.08f, 6.99f, -7f)
                        curveTo(22f, 12f, 22f, 5f, 12f, 5f)
                        close()
                        moveTo(14.86f, 17f)
                        horizontalLineTo(9.14f)
                        curveToRelative(-2.1f, 0f, -3.92f, -1.24f, -4.71f, -3f)
                        horizontalLineToRelative(15.15f)
                        curveTo(18.78f, 15.76f, 16.96f, 17f, 14.86f, 17f)
                        close()
                        moveTo(4f, 12f)
                        curveToRelative(0f, -0.2f, 0.09f, -5f, 8f, -5f)
                        curveToRelative(7.64f, 0f, 7.99f, 4.51f, 8f, 5f)
                        horizontalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Home_mini!!
    }

private var _Home_mini: ImageVector? = null

