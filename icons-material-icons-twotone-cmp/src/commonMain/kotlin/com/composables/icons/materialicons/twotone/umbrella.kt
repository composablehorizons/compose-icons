package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) return _Umbrella!!
        
        _Umbrella = ImageVector.Builder(
            name = "umbrella",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13.28f, 8.5f)
                    lineToRelative(0.76f, 0.58f)
                    lineToRelative(0.92f, -0.23f)
                    lineTo(13f, 14.8f)
                    verticalLineTo(8.29f)
                    lineTo(13.28f, 8.5f)
                    close()
                    moveTo(9.03f, 8.86f)
                    lineTo(11f, 14.8f)
                    verticalLineTo(8.29f)
                    lineTo(10.72f, 8.5f)
                    lineTo(9.96f, 9.09f)
                    lineTo(9.03f, 8.86f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.5f, 6.92f)
                    lineTo(13f, 5.77f)
                    verticalLineTo(3.88f)
                    verticalLineTo(3.4f)
                    curveToRelative(0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.21f, 0.5f, 0.48f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3.4f)
                    curveTo(16f, 2.07f, 14.88f, 1f, 13.5f, 1f)
                    curveTo(12.12f, 1f, 11f, 2.07f, 11f, 3.4f)
                    verticalLineToRelative(0.48f)
                    verticalLineToRelative(1.89f)
                    lineTo(9.5f, 6.92f)
                    lineTo(6f, 6.07f)
                    lineToRelative(5.05f, 15.25f)
                    curveTo(11.2f, 21.77f, 11.6f, 22f, 12f, 22f)
                    reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f)
                    lineTo(18f, 6.07f)
                    lineTo(14.5f, 6.92f)
                    close()
                    moveTo(13.28f, 8.5f)
                    lineToRelative(0.76f, 0.58f)
                    lineToRelative(0.92f, -0.23f)
                    lineTo(13f, 14.8f)
                    verticalLineTo(8.29f)
                    lineTo(13.28f, 8.5f)
                    close()
                    moveTo(9.96f, 9.09f)
                    lineToRelative(0.76f, -0.58f)
                    lineTo(11f, 8.29f)
                    verticalLineToRelative(6.51f)
                    lineTo(9.03f, 8.86f)
                    lineTo(9.96f, 9.09f)
                    close()
                }
            }
        }.build()
        
        return _Umbrella!!
    }

private var _Umbrella: ImageVector? = null

