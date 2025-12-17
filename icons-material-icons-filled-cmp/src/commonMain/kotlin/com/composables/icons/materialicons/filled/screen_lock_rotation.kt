package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Screen_lock_rotation: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23.25f, 12.77f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(4.51f, 8.17f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11.23f, 0.75f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                lineTo(2.75f, 7.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                close()
                moveTo(8.47f, 20.48f)
                curveTo(5.2f, 18.94f, 2.86f, 15.76f, 2.5f, 12f)
                horizontalLineTo(1f)
                curveToRelative(0.51f, 6.16f, 5.66f, 11f, 11.95f, 11f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.82f)
                lineToRelative(-1.33f, 1.33f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                verticalLineToRelative(-0.5f)
                curveTo(21f, 1.12f, 19.88f, 0f, 18.5f, 0f)
                reflectiveCurveTo(16f, 1.12f, 16f, 2.5f)
                verticalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(0.8f, -6.5f)
                curveToRelative(0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f)
                reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

