package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Screen_search_desktop: ImageVector
    get() {
        if (_Screen_search_desktop != null) return _Screen_search_desktop!!
        
        _Screen_search_desktop = ImageVector.Builder(
            name = "screen_search_desktop",
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
                        moveTo(4f, 18f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                        lineTo(22f, 5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                        verticalLineToRelative(11f)
                        curveTo(2f, 17.1f, 2.9f, 18f, 4f, 18f)
                        close()
                        moveTo(4f, 5f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(11f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 19f)
                        horizontalLineTo(23f)
                        verticalLineTo(21f)
                        horizontalLineTo(1f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.97f, 7.53f)
                        curveToRelative(-1.37f, -1.37f, -3.58f, -1.37f, -4.95f, 0f)
                        reflectiveCurveToRelative(-1.37f, 3.58f, 0f, 4.95f)
                        curveToRelative(1.18f, 1.18f, 3f, 1.34f, 4.36f, 0.47f)
                        lineToRelative(2.09f, 2.09f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(-2.09f, -2.09f)
                        curveTo(15.31f, 10.53f, 15.16f, 8.71f, 13.97f, 7.53f)
                        close()
                        moveTo(12.91f, 11.41f)
                        curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                        curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                        reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0f)
                        curveTo(13.69f, 9.37f, 13.69f, 10.63f, 12.91f, 11.41f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screen_search_desktop!!
    }

private var _Screen_search_desktop: ImageVector? = null

