package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Public: ImageVector
    get() {
        if (_Public != null) return _Public!!
        
        _Public = ImageVector.Builder(
            name = "public",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.99f, 4.59f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.89f, 0f, 1.64f, 0.59f, 1.9f, 1.4f)
                curveTo(19.19f, 15.98f, 20f, 14.08f, 20f, 12f)
                curveToRelative(0f, -3.35f, -2.08f, -6.23f, -5.01f, -7.41f)
                close()
                moveTo(8.99f, 16f)
                verticalLineToRelative(-1f)
                lineToRelative(-4.78f, -4.78f)
                curveTo(4.08f, 10.79f, 4f, 11.39f, 4f, 12f)
                curveToRelative(0f, 4.07f, 3.06f, 7.43f, 6.99f, 7.93f)
                verticalLineTo(18f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
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
                moveToRelative(-1.01f, 17.93f)
                curveTo(7.06f, 19.43f, 4f, 16.07f, 4f, 12f)
                curveToRelative(0f, -0.61f, 0.08f, -1.21f, 0.21f, -1.78f)
                lineTo(8.99f, 15f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(1.93f)
                close()
                moveToRelative(6.9f, -2.53f)
                curveToRelative(-0.26f, -0.81f, -1f, -1.4f, -1.9f, -1.4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-0.41f)
                curveTo(17.92f, 5.77f, 20f, 8.65f, 20f, 12f)
                curveToRelative(0f, 2.08f, -0.81f, 3.98f, -2.11f, 5.4f)
                close()
            }
        }.build()
        
        return _Public!!
    }

private var _Public: ImageVector? = null

