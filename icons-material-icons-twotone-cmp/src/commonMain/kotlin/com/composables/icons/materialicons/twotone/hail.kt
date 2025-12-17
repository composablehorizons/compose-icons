package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hail: ImageVector
    get() {
        if (_Hail != null) return _Hail!!
        
        _Hail = ImageVector.Builder(
            name = "hail",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 6f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(13.1f, 6f, 12f, 6f)
                    close()
                    moveTo(17f, 2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 2.7f, -0.93f, 4.41f, -2.3f, 5.5f)
                    curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(9f)
                    verticalLineTo(10.1f)
                    curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f)
                    curveTo(7.87f, 10.81f, 7f, 11.43f, 7f, 14f)
                    horizontalLineTo(5f)
                    curveToRelative(0f, -2.06f, 0.35f, -3.78f, 2.11f, -5.29f)
                    curveTo(8.21f, 7.81f, 10f, 7f, 12f, 7f)
                    reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f)
                    curveTo(15.96f, 5.55f, 17f, 4.76f, 17f, 2f)
                    close()
                    moveTo(4f, 16f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(4f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Hail!!
    }

private var _Hail: ImageVector? = null

