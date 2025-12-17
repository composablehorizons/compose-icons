package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Gamepad: ImageVector
    get() {
        if (_Gamepad != null) return _Gamepad!!
        
        _Gamepad = ImageVector.Builder(
            name = "gamepad",
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
                moveTo(15f, 7.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(5.5f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                close()
                moveTo(7.5f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5.5f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(9f, 16.5f)
                verticalLineTo(22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.5f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(16.5f, 9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineToRelative(-5.5f)
                close()
            }
        }.build()
        
        return _Gamepad!!
    }

private var _Gamepad: ImageVector? = null

