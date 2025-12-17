package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Screen_lock_rotation: ImageVector
    get() {
        if (_Screen_lock_rotation != null) return _Screen_lock_rotation!!
        
        _Screen_lock_rotation = ImageVector.Builder(
            name = "screen_lock_rotation",
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
                moveTo(22.3f, 13.77f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(3.56f, 9.17f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.45f, -2.45f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                lineTo(1.8f, 8.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                close()
                moveTo(7.52f, 21.48f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13f)
                horizontalLineTo(0.05f)
                curveTo(0.56f, 19.16f, 5.71f, 24f, 12f, 24f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.82f)
                lineToRelative(-1.33f, 1.33f)
                close()
                moveTo(15.05f, 10f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(0.8f, -6.5f)
                curveToRelative(0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f)
                reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

