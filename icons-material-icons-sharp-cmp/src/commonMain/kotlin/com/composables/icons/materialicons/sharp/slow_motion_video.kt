package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Slow_motion_video: ImageVector
    get() {
        if (_Slow_motion_video != null) return _Slow_motion_video!!
        
        _Slow_motion_video = ImageVector.Builder(
            name = "slow_motion_video",
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
                moveTo(13.05f, 9.79f)
                lineTo(10f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16f, 12f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveToRelative(0f, 0f)
                lineTo(10f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16f, 12f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveToRelative(0f, 0f)
                lineTo(10f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16f, 12f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveTo(11f, 4.07f)
                verticalLineTo(2.05f)
                curveToRelative(-2.01f, 0.2f, -3.84f, 1f, -5.32f, 2.21f)
                lineTo(7.1f, 5.69f)
                curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f)
                close()
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.68f)
                curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f)
                close()
                moveTo(4.07f, 13f)
                horizontalLineTo(2.05f)
                curveToRelative(0.2f, 2.01f, 1f, 3.84f, 2.21f, 5.32f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f)
                close()
                moveToRelative(1.61f, 6.74f)
                curveTo(7.16f, 20.95f, 9f, 21.75f, 11f, 21.95f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f)
                lineToRelative(-1.42f, 1.43f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.16f, -3.92f, 9.42f, -8.95f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(16.97f, 19.41f, 20f, 16.05f, 20f, 12f)
                reflectiveCurveToRelative(-3.03f, -7.41f, -6.95f, -7.93f)
                verticalLineTo(2.05f)
                curveTo(18.08f, 2.58f, 22f, 6.84f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Slow_motion_video!!
    }

private var _Slow_motion_video: ImageVector? = null

