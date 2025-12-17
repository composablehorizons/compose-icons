package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ClipboardCheck: ImageVector
    get() {
        if (_ClipboardCheck != null) return _ClipboardCheck!!
        
        _ClipboardCheck = ImageVector.Builder(
            name = "clipboard-check",
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
                moveToRelative(-3.704f, 7.123f)
                lineToRelative(-3.293f, 3.292f)
                lineToRelative(-1.293f, -1.292f)
                arcToRelative(1f, 1f, 0f, true, false, -1.414f, 1.414f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, -1.414f)
                moveToRelative(-0.293f, -9.293f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                close()
            }
        }.build()
        
        return _ClipboardCheck!!
    }

private var _ClipboardCheck: ImageVector? = null

