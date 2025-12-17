package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PaintRoller: ImageVector
    get() {
        if (_PaintRoller != null) return _PaintRoller!!
        
        _PaintRoller = ImageVector.Builder(
            name = "paint-roller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 128f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(352f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                close()
                moveToRelative(32f, -64f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
                horizontalLineTo(256f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(160f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
            }
        }.build()
        
        return _PaintRoller!!
    }

private var _PaintRoller: ImageVector? = null

