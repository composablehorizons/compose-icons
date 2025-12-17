package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Screen_lock_portrait: ImageVector
    get() {
        if (_Screen_lock_portrait != null) return _Screen_lock_portrait!!
        
        _Screen_lock_portrait = ImageVector.Builder(
            name = "screen_lock_portrait",
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
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -1f, -0.69f, -1.92f, -1.68f, -2.08f)
                curveTo(11.07f, 7.83f, 10f, 8.79f, 10f, 10f)
                verticalLineToRelative(1f)
                horizontalLineTo(9f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(1.8f, -6f)
                curveToRelative(0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
                moveToRelative(-2f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Screen_lock_portrait!!
    }

private var _Screen_lock_portrait: ImageVector? = null

