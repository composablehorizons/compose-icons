package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Gamepad: ImageVector
    get() {
        if (_Gamepad != null) return _Gamepad!!
        
        _Gamepad = ImageVector.Builder(
            name = "gamepad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480.07f, 96f)
                horizontalLineTo(160f)
                arcToRelative(160f, 160f, 0f, true, false, 114.24f, 272f)
                horizontalLineToRelative(91.52f)
                arcTo(160f, 160f, 0f, true, false, 480.07f, 96f)
                close()
                moveTo(248f, 268f)
                arcToRelative(12f, 12f, 0f, false, true, -12f, 12f)
                horizontalLineToRelative(-52f)
                verticalLineToRelative(52f)
                arcToRelative(12f, 12f, 0f, false, true, -12f, 12f)
                horizontalLineToRelative(-24f)
                arcToRelative(12f, 12f, 0f, false, true, -12f, -12f)
                verticalLineToRelative(-52f)
                horizontalLineTo(84f)
                arcToRelative(12f, 12f, 0f, false, true, -12f, -12f)
                verticalLineToRelative(-24f)
                arcToRelative(12f, 12f, 0f, false, true, 12f, -12f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(-52f)
                arcToRelative(12f, 12f, 0f, false, true, 12f, -12f)
                horizontalLineToRelative(24f)
                arcToRelative(12f, 12f, 0f, false, true, 12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(52f)
                arcToRelative(12f, 12f, 0f, false, true, 12f, 12f)
                close()
                moveToRelative(216f, 76f)
                arcToRelative(40f, 40f, 0f, true, true, 40f, -40f)
                arcToRelative(40f, 40f, 0f, false, true, -40f, 40f)
                close()
                moveToRelative(64f, -96f)
                arcToRelative(40f, 40f, 0f, true, true, 40f, -40f)
                arcToRelative(40f, 40f, 0f, false, true, -40f, 40f)
                close()
            }
        }.build()
        
        return _Gamepad!!
    }

private var _Gamepad: ImageVector? = null

