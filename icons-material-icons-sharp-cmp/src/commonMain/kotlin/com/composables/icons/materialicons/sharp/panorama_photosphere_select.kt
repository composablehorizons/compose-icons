package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Panorama_photosphere_select: ImageVector
    get() {
        if (_Panorama_photosphere_select != null) return _Panorama_photosphere_select!!
        
        _Panorama_photosphere_select = ImageVector.Builder(
            name = "panorama_photosphere_select",
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
                        moveTo(23f, 8.84f)
                        curveToRelative(-0.54f, -0.43f, -1.23f, -0.81f, -1.99f, -1.15f)
                        curveTo(19.4f, 4.33f, 15.98f, 2f, 12f, 2f)
                        curveTo(8.02f, 2f, 4.6f, 4.33f, 2.99f, 7.68f)
                        curveTo(2.23f, 8.03f, 1.54f, 8.4f, 1f, 8.84f)
                        verticalLineToRelative(6.33f)
                        curveToRelative(0.54f, 0.43f, 1.23f, 0.81f, 1.99f, 1.15f)
                        curveTo(4.6f, 19.67f, 8.02f, 22f, 12f, 22f)
                        curveToRelative(3.98f, 0f, 7.4f, -2.33f, 9.01f, -5.68f)
                        curveToRelative(0.76f, -0.34f, 1.45f, -0.72f, 1.99f, -1.15f)
                        verticalLineTo(8.84f)
                        close()
                        moveTo(12f, 4f)
                        curveToRelative(2.37f, 0f, 4.49f, 1.04f, 5.95f, 2.68f)
                        curveTo(16.17f, 6.25f, 14.15f, 6f, 12f, 6f)
                        curveTo(9.85f, 6f, 7.83f, 6.25f, 6.05f, 6.68f)
                        curveTo(7.51f, 5.04f, 9.63f, 4f, 12f, 4f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-2.37f, 0f, -4.49f, -1.04f, -5.95f, -2.68f)
                        curveTo(7.83f, 17.75f, 9.85f, 18f, 12f, 18f)
                        reflectiveCurveToRelative(4.17f, -0.25f, 5.95f, -0.68f)
                        curveTo(16.49f, 18.96f, 14.37f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Panorama_photosphere_select!!
    }

private var _Panorama_photosphere_select: ImageVector? = null

