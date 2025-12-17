package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Toys: ImageVector
    get() {
        if (_Toys != null) return _Toys!!
        
        _Toys = ImageVector.Builder(
            name = "toys",
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
                    moveTo(18.72f, 10f)
                    lineToRelative(-2f, -6f)
                    horizontalLineTo(7.28f)
                    lineTo(5.81f, 8.4f)
                    lineTo(4.41f, 7f)
                    lineToRelative(1f, -1f)
                    lineTo(4f, 4.59f)
                    lineTo(0.59f, 8f)
                    lineTo(2f, 9.41f)
                    lineToRelative(1f, -1f)
                    lineTo(4.59f, 10f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(2.18f)
                    curveTo(4.59f, 19.16f, 5.7f, 20f, 7f, 20f)
                    curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                    horizontalLineToRelative(4.37f)
                    curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                    curveToRelative(1.3f, 0f, 2.41f, -0.84f, 2.82f, -2f)
                    horizontalLineTo(22f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(18.72f)
                    close()
                    moveTo(7f, 18f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(7.55f, 18f, 7f, 18f)
                    close()
                    moveTo(11f, 10f)
                    horizontalLineTo(7.41f)
                    lineTo(7.39f, 9.98f)
                    lineTo(8.72f, 6f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineTo(11f)
                    verticalLineTo(10f)
                    close()
                    moveTo(13f, 10f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(2.28f)
                    lineToRelative(1.33f, 4f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(17f, 18f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(17.55f, 18f, 17f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Toys!!
    }

private var _Toys: ImageVector? = null

