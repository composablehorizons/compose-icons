package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Box: ImageVector
    get() {
        if (_Box != null) return _Box!!
        
        _Box = ImageVector.Builder(
            name = "box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(509.5f, 184.6f)
                lineTo(458.9f, 32.8f)
                curveTo(452.4f, 13.2f, 434.1f, 0f, 413.4f, 0f)
                horizontalLineTo(272f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(238.7f)
                curveToRelative(-0.4f, -2.5f, -0.4f, -5f, -1.2f, -7.4f)
                close()
                moveTo(240f, 0f)
                horizontalLineTo(98.6f)
                curveToRelative(-20.7f, 0f, -39f, 13.2f, -45.5f, 32.8f)
                lineTo(2.5f, 184.6f)
                curveToRelative(-0.8f, 2.4f, -0.8f, 4.9f, -1.2f, 7.4f)
                horizontalLineTo(240f)
                verticalLineTo(0f)
                close()
                moveTo(0f, 224f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(224f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Box!!
    }

private var _Box: ImageVector? = null

