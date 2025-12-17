package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Keyboard_arrow_right: ImageVector
    get() {
        if (_Keyboard_arrow_right != null) return _Keyboard_arrow_right!!
        
        _Keyboard_arrow_right = ImageVector.Builder(
            name = "keyboard_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.29f, 15.88f)
                lineTo(13.17f, 12f)
                lineTo(9.29f, 8.12f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineTo(10.7f, 17.3f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.38f, -0.39f, -0.39f, -1.03f, 0f, -1.42f)
                close()
            }
        }.build()
        
        return _Keyboard_arrow_right!!
    }

private var _Keyboard_arrow_right: ImageVector? = null

