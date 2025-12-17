package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.NotEqual: ImageVector
    get() {
        if (_NotEqual != null) return _NotEqual!!
        
        _NotEqual = ImageVector.Builder(
            name = "not-equal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 208f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-23.88f)
                lineToRelative(51.87f, -66.81f)
                curveToRelative(5.37f, -7.02f, 4.04f, -17.06f, -2.97f, -22.43f)
                lineTo(415.61f, 3.3f)
                curveToRelative(-7.02f, -5.38f, -17.06f, -4.04f, -22.44f, 2.97f)
                lineTo(311.09f, 112f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(204.56f)
                lineToRelative(-74.53f, 96f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(55.49f)
                lineToRelative(-51.87f, 66.81f)
                curveToRelative(-5.37f, 7.01f, -4.04f, 17.05f, 2.97f, 22.43f)
                lineTo(64f, 508.7f)
                curveToRelative(7.02f, 5.38f, 17.06f, 4.04f, 22.43f, -2.97f)
                lineTo(168.52f, 400f)
                horizontalLineTo(416f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(243.05f)
                lineToRelative(74.53f, -96f)
                horizontalLineTo(416f)
                close()
            }
        }.build()
        
        return _NotEqual!!
    }

private var _NotEqual: ImageVector? = null

