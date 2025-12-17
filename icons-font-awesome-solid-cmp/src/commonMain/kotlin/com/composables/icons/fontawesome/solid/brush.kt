package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Brush: ImageVector
    get() {
        if (_Brush != null) return _Brush!!
        
        _Brush = ImageVector.Builder(
            name = "brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 0f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(384f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(0f, 320f)
                curveToRelative(0f, 35.35f, 28.66f, 64f, 64f, 64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.35f, 28.66f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                curveToRelative(35.34f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-32f)
                horizontalLineTo(0f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(192f, 104f)
                curveToRelative(13.25f, 0f, 24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                close()
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

