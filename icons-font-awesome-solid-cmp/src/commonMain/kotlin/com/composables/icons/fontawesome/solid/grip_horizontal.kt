package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GripHorizontal: ImageVector
    get() {
        if (_GripHorizontal != null) return _GripHorizontal!!
        
        _GripHorizontal = ImageVector.Builder(
            name = "grip-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 288f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(96f, 96f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(160f, 0f)
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
        
        return _GripHorizontal!!
    }

private var _GripHorizontal: ImageVector? = null

