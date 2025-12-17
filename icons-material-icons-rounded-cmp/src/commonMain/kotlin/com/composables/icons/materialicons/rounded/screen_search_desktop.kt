package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screen_search_desktop: ImageVector
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
                        moveTo(22f, 19f)
                        horizontalLineTo(2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(20f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(23f, 19.45f, 22.55f, 19f, 22f, 19f)
                        close()
                    }
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
                        moveTo(8.59f, 8.05f)
                        curveTo(9.87f, 6.18f, 12.45f, 6f, 13.97f, 7.53f)
                        curveToRelative(1.18f, 1.18f, 1.34f, 3f, 0.47f, 4.36f)
                        lineTo(16f, 13.44f)
                        curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                        curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                        lineToRelative(-1.55f, -1.55f)
                        curveToRelative(-1.57f, 1f, -3.76f, 0.64f, -4.87f, -1.11f)
                        curveTo(7.79f, 10.7f, 7.83f, 9.17f, 8.59f, 8.05f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 10f)
                        arcTo(2f, 2f, 0f, false, true, 11.5f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 9.5f, 10f)
                        arcTo(2f, 2f, 0f, false, true, 13.5f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screen_search_desktop!!
    }

private var _Screen_search_desktop: ImageVector? = null

