package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Browse_gallery: ImageVector
    get() {
        if (_Browse_gallery != null) return _Browse_gallery!!
        
        _Browse_gallery = ImageVector.Builder(
            name = "browse_gallery",
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
                        moveTo(9f, 3f)
                        curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                        reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                        reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                        reflectiveCurveTo(13.97f, 3f, 9f, 3f)
                        close()
                        moveTo(11.79f, 16.21f)
                        lineTo(8f, 12.41f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4.59f)
                        lineToRelative(3.21f, 3.21f)
                        lineTo(11.79f, 16.21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.99f, 3.52f)
                        verticalLineToRelative(2.16f)
                        curveTo(20.36f, 6.8f, 22f, 9.21f, 22f, 12f)
                        curveToRelative(0f, 2.79f, -1.64f, 5.2f, -4.01f, 6.32f)
                        verticalLineToRelative(2.16f)
                        curveTo(21.48f, 19.24f, 24f, 15.91f, 24f, 12f)
                        curveTo(24f, 8.09f, 21.48f, 4.76f, 17.99f, 3.52f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Browse_gallery!!
    }

private var _Browse_gallery: ImageVector? = null

