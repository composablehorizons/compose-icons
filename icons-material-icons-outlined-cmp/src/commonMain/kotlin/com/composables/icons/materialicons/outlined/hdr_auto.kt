package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hdr_auto: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                    reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                    curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                    close()
                    moveTo(11.01f, 6f)
                    lineTo(6.88f, 17f)
                    horizontalLineToRelative(1.9f)
                    lineToRelative(1f, -2.81f)
                    horizontalLineToRelative(4.44f)
                    lineTo(15.21f, 17f)
                    horizontalLineToRelative(1.9f)
                    lineTo(12.98f, 6f)
                    horizontalLineTo(11.01f)
                    close()
                    moveTo(10.35f, 12.59f)
                    lineToRelative(1.6f, -4.55f)
                    horizontalLineToRelative(0.09f)
                    lineToRelative(1.6f, 4.55f)
                    horizontalLineTo(10.35f)
                    close()
                }
            }
        }.build()
        
        return _Hdr_auto!!
    }

private var _Hdr_auto: ImageVector? = null

