package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hdr_auto: ImageVector
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
                        moveTo(15.21f, 17f)
                        lineToRelative(-0.98f, -2.81f)
                        horizontalLineTo(9.78f)
                        lineToRelative(-1f, 2.81f)
                        horizontalLineToRelative(-1.9f)
                        lineToRelative(4.13f, -11f)
                        horizontalLineToRelative(1.97f)
                        lineToRelative(4.13f, 11f)
                        horizontalLineTo(15.21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_auto!!
    }

private var _Hdr_auto: ImageVector? = null

