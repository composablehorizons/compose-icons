package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Screen_search_desktop: ImageVector
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9.6f, 16.8f)
                            horizontalLineTo(14.4f)
                            verticalLineTo(18.6f)
                            horizontalLineTo(9.6f)
                            verticalLineTo(16.8f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 18f)
                            curveTo(21.1f, 18f, 21.99f, 17.1f, 21.99f, 16f)
                            lineTo(22f, 6f)
                            curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                            lineTo(4f, 4f)
                            curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                            lineTo(2f, 16f)
                            curveTo(2f, 17.1f, 2.89f, 18f, 4f, 18f)
                            lineTo(0f, 18f)
                            lineTo(0f, 20f)
                            lineTo(24f, 20f)
                            lineTo(24f, 18f)
                            lineTo(20f, 18f)
                            close()
                            moveTo(4f, 16f)
                            lineTo(4f, 6f)
                            lineTo(20f, 6f)
                            lineTo(20f, 16f)
                            lineTo(20f, 16.01f)
                            lineTo(4f, 16f)
                            close()
                            moveTo(9.0967f, 9.9531f)
                            curveTo(9.0967f, 8.9261f, 9.9327f, 8.0891f, 10.9607f, 8.0891f)
                            curveTo(11.9877f, 8.0891f, 12.8247f, 8.9261f, 12.8247f, 9.9531f)
                            curveTo(12.8247f, 10.9801f, 11.9877f, 11.8171f, 10.9607f, 11.8171f)
                            curveTo(9.9327f, 11.8171f, 9.0967f, 10.9801f, 9.0967f, 9.9531f)
                            close()
                            moveTo(16.1287f, 14.1891f)
                            lineTo(13.6467f, 11.7071f)
                            curveTo(13.9777f, 11.2021f, 14.1737f, 10.6001f, 14.1737f, 9.9531f)
                            curveTo(14.1737f, 8.1811f, 12.7327f, 6.7401f, 10.9607f, 6.7401f)
                            curveTo(9.1887f, 6.7401f, 7.7467f, 8.1811f, 7.7467f, 9.9531f)
                            curveTo(7.7467f, 11.7251f, 9.1887f, 13.1671f, 10.9607f, 13.1671f)
                            curveTo(11.5967f, 13.1671f, 12.1857f, 12.9751f, 12.6847f, 12.6561f)
                            lineTo(15.1737f, 15.1441f)
                            lineTo(16.1287f, 14.1891f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(0f, 0f)
                        horizontalLineTo(24f)
                        verticalLineTo(24f)
                        horizontalLineTo(0f)
                        verticalLineTo(0f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screen_search_desktop!!
    }

private var _Screen_search_desktop: ImageVector? = null

