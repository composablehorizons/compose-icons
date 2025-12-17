package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StickyNote: ImageVector
    get() {
        if (_StickyNote != null) return _StickyNote!!
        
        _StickyNote = ImageVector.Builder(
            name = "sticky-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 320f)
                horizontalLineToRelative(136f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveTo(10.7f, 32f, 0f, 42.7f, 0f, 56f)
                verticalLineToRelative(400f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(264f)
                verticalLineTo(344f)
                curveToRelative(0f, -13.2f, 10.8f, -24f, 24f, -24f)
                close()
                moveToRelative(129f, 55f)
                lineToRelative(-98f, 98f)
                curveToRelative(-4.5f, 4.5f, -10.6f, 7f, -17f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineTo(352f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(6.1f)
                curveToRelative(0f, 6.3f, -2.5f, 12.4f, -7f, 16.9f)
                close()
            }
        }.build()
        
        return _StickyNote!!
    }

private var _StickyNote: ImageVector? = null

