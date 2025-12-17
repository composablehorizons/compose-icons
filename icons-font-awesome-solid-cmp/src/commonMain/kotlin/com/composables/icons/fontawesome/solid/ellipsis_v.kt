package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EllipsisV: ImageVector
    get() {
        if (_EllipsisV != null) return _EllipsisV!!
        
        _EllipsisV = ImageVector.Builder(
            name = "ellipsis-v",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 184f)
                curveToRelative(39.8f, 0f, 72f, 32.2f, 72f, 72f)
                reflectiveCurveToRelative(-32.2f, 72f, -72f, 72f)
                reflectiveCurveToRelative(-72f, -32.2f, -72f, -72f)
                reflectiveCurveToRelative(32.2f, -72f, 72f, -72f)
                close()
                moveTo(24f, 80f)
                curveToRelative(0f, 39.8f, 32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                reflectiveCurveTo(135.8f, 8f, 96f, 8f)
                reflectiveCurveTo(24f, 40.2f, 24f, 80f)
                close()
                moveToRelative(0f, 352f)
                curveToRelative(0f, 39.8f, 32.2f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.2f, 72f, -72f)
                reflectiveCurveToRelative(-32.2f, -72f, -72f, -72f)
                reflectiveCurveToRelative(-72f, 32.2f, -72f, 72f)
                close()
            }
        }.build()
        
        return _EllipsisV!!
    }

private var _EllipsisV: ImageVector? = null

