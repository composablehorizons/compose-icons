package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VectorSquare: ImageVector
    get() {
        if (_VectorSquare != null) return _VectorSquare!!
        
        _VectorSquare = ImageVector.Builder(
            name = "vector-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 128f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                horizontalLineTo(160f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                verticalLineToRelative(192f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                horizontalLineToRelative(192f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(96f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                verticalLineTo(160f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                close()
                moveToRelative(-96f, -64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineTo(64f)
                close()
                moveTo(64f, 64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineTo(64f)
                verticalLineTo(64f)
                close()
                moveToRelative(32f, 384f)
                horizontalLineTo(64f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(352f, 0f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(-32f, -96f)
                horizontalLineToRelative(-32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                horizontalLineTo(160f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(96f)
                verticalLineTo(160f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(96f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(192f)
                close()
            }
        }.build()
        
        return _VectorSquare!!
    }

private var _VectorSquare: ImageVector? = null

