package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClipboardSmile: ImageVector
    get() {
        if (_ClipboardSmile != null) return _ClipboardSmile!!
        
        _ClipboardSmile = ImageVector.Builder(
            name = "clipboard-smile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.997f, 4.17f)
                arcToRelative(3f, 3f, 0f, false, true, 2.003f, 2.83f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, 2.003f, -2.83f)
                arcToRelative(4f, 4f, 0f, false, false, 3.997f, 3.83f)
                horizontalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, false, false, 3.98f, -3.597f)
                close()
                moveToRelative(-3.176f, 11.259f)
                arcToRelative(1f, 1f, 0f, false, false, -1.392f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.858f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.142f, 1.642f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 5.142f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 0.25f, -1.392f)
                moveToRelative(-4.811f, -3.429f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-0.01f, -10f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                close()
            }
        }.build()
        
        return _ClipboardSmile!!
    }

private var _ClipboardSmile: ImageVector? = null

