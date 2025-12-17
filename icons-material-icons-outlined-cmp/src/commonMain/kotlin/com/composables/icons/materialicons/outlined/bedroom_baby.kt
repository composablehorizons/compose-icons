package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bedroom_baby: ImageVector
    get() {
        if (_Bedroom_baby != null) return _Bedroom_baby!!
        
        _Bedroom_baby = ImageVector.Builder(
            name = "bedroom_baby",
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
                    moveTo(17.94f, 14.04f)
                    curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f)
                    lineTo(16f, 13.5f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-5.62f)
                    lineTo(9.65f, 7f)
                    horizontalLineTo(6f)
                    lineToRelative(1f, 0.76f)
                    lineTo(5.5f, 9.5f)
                    lineToRelative(0.95f, 1f)
                    lineTo(8f, 9.51f)
                    verticalLineToRelative(3.99f)
                    lineToRelative(-0.84f, 1.46f)
                    curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f)
                    lineTo(5f, 15.1f)
                    curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7f, 2.9f)
                    reflectiveCurveToRelative(5.13f, -1.03f, 7f, -2.9f)
                    lineTo(17.94f, 14.04f)
                    close()
                    moveTo(8.45f, 15.71f)
                    lineToRelative(0.03f, -0.06f)
                    lineToRelative(0.81f, -1.41f)
                    curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0f)
                    lineToRelative(0.81f, 1.41f)
                    lineToRelative(0.03f, 0.06f)
                    curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f)
                    reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f)
                    close()
                    moveTo(20f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineTo(20f)
                    moveTo(20f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Bedroom_baby!!
    }

private var _Bedroom_baby: ImageVector? = null

