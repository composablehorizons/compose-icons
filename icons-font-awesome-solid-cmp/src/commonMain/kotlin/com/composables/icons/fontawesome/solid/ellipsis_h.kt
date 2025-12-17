package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EllipsisH: ImageVector
    get() {
        if (_EllipsisH != null) return _EllipsisH!!
        
        _EllipsisH = ImageVector.Builder(
            name = "ellipsis-h",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(328f, 256f)
                curveToRelative(0f, 39.8f, -32.2f, 72f, -72f, 72f)
                reflectiveCurveToRelative(-72f, -32.2f, -72f, -72f)
                reflectiveCurveToRelative(32.2f, -72f, 72f, -72f)
                reflectiveCurveToRelative(72f, 32.2f, 72f, 72f)
                close()
                moveToRelative(104f, -72f)
                curveToRelative(-39.8f, 0f, -72f, 32.2f, -72f, 72f)
                reflectiveCurveToRelative(32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                reflectiveCurveToRelative(-32.2f, -72f, -72f, -72f)
                close()
                moveToRelative(-352f, 0f)
                curveToRelative(-39.8f, 0f, -72f, 32.2f, -72f, 72f)
                reflectiveCurveToRelative(32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                reflectiveCurveToRelative(-32.2f, -72f, -72f, -72f)
                close()
            }
        }.build()
        
        return _EllipsisH!!
    }

private var _EllipsisH: ImageVector? = null

