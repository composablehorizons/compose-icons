package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_auto: ImageVector
    get() {
        if (_Hdr_auto != null) return _Hdr_auto!!
        
        _Hdr_auto = ImageVector.Builder(
            name = "hdr_auto",
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
                        moveTo(12.04f, 8.04f)
                        lineTo(11.95f, 8.04f)
                        lineTo(10.35f, 12.59f)
                        lineTo(13.64f, 12.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(15f, 16.41f)
                        lineToRelative(-0.78f, -2.22f)
                        horizontalLineTo(9.78f)
                        lineToRelative(-0.79f, 2.22f)
                        curveTo(8.87f, 16.76f, 8.53f, 17f, 8.16f, 17f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.62f, 0f, -1.05f, -0.62f, -0.83f, -1.2f)
                        lineToRelative(3.34f, -8.88f)
                        curveTo(10.88f, 6.37f, 11.4f, 6f, 12f, 6f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.59f, 0f, 1.12f, 0.37f, 1.33f, 0.92f)
                        lineToRelative(3.34f, 8.88f)
                        curveToRelative(0.22f, 0.58f, -0.21f, 1.2f, -0.83f, 1.2f)
                        horizontalLineToRelative(0f)
                        curveTo(15.46f, 17f, 15.12f, 16.76f, 15f, 16.41f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_auto!!
    }

private var _Hdr_auto: ImageVector? = null

