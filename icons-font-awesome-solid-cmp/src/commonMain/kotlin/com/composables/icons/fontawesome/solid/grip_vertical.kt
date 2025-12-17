package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GripVertical: ImageVector
    get() {
        if (_GripVertical != null) return _GripVertical!!
        
        _GripVertical = ImageVector.Builder(
            name = "grip-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 32f, 0f, 46.33f, 0f, 64f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(288f, 32f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _GripVertical!!
    }

private var _GripVertical: ImageVector? = null

