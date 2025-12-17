package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Screen_search_desktop: ImageVector
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
                        moveTo(22f, 3f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(15f)
                        horizontalLineToRelative(19.99f)
                        lineTo(22f, 3f)
                        close()
                        moveTo(15.47f, 15.03f)
                        lineToRelative(-2.09f, -2.09f)
                        curveToRelative(-1.35f, 0.87f, -3.17f, 0.71f, -4.36f, -0.47f)
                        curveToRelative(-1.37f, -1.37f, -1.37f, -3.58f, 0f, -4.95f)
                        reflectiveCurveToRelative(3.58f, -1.37f, 4.95f, 0f)
                        curveToRelative(1.18f, 1.18f, 1.34f, 3f, 0.47f, 4.36f)
                        lineToRelative(2.09f, 2.09f)
                        lineTo(15.47f, 15.03f)
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

