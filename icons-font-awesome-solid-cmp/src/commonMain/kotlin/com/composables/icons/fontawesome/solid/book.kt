package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Book: ImageVector
    get() {
        if (_Book != null) return _Book!!
        
        _Book = ImageVector.Builder(
            name = "book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 360f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(96f)
                curveTo(43f, 0f, 0f, 43f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                horizontalLineToRelative(328f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -7.5f, -3.5f, -14.3f, -8.9f, -18.7f)
                curveToRelative(-4.2f, -15.4f, -4.2f, -59.3f, 0f, -74.7f)
                curveToRelative(5.4f, -4.3f, 8.9f, -11.1f, 8.9f, -18.6f)
                close()
                moveTo(128f, 134f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(212f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                horizontalLineTo(134f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineToRelative(-20f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(212f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                horizontalLineTo(134f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineToRelative(-20f)
                close()
                moveToRelative(253.4f, 250f)
                horizontalLineTo(96f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                curveToRelative(0f, -17.6f, 14.4f, -32f, 32f, -32f)
                horizontalLineToRelative(285.4f)
                curveToRelative(-1.9f, 17.1f, -1.9f, 46.9f, 0f, 64f)
                close()
            }
        }.build()
        
        return _Book!!
    }

private var _Book: ImageVector? = null

