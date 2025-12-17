package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Browse_gallery: ImageVector
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
                        moveTo(11.09f, 15.5f)
                        lineTo(8.59f, 13f)
                        curveTo(8.21f, 12.62f, 8f, 12.12f, 8f, 11.59f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3.59f)
                        lineToRelative(2.5f, 2.5f)
                        curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveTo(12.11f, 15.89f, 11.48f, 15.89f, 11.09f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.99f, 5.08f)
                        lineTo(17.99f, 5.08f)
                        curveToRelative(0f, 0.37f, 0.21f, 0.69f, 0.53f, 0.88f)
                        curveTo(20.6f, 7.17f, 22f, 9.42f, 22f, 12f)
                        curveToRelative(0f, 2.58f, -1.4f, 4.83f, -3.48f, 6.04f)
                        curveToRelative(-0.32f, 0.19f, -0.53f, 0.51f, -0.53f, 0.88f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.77f, 0.84f, 1.25f, 1.51f, 0.86f)
                        curveTo(22.18f, 18.22f, 24f, 15.32f, 24f, 12f)
                        curveToRelative(0f, -3.32f, -1.82f, -6.22f, -4.5f, -7.78f)
                        curveTo(18.83f, 3.83f, 17.99f, 4.31f, 17.99f, 5.08f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Browse_gallery!!
    }

private var _Browse_gallery: ImageVector? = null

