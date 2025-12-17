package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ListAlt: ImageVector
    get() {
        if (_ListAlt != null) return _ListAlt!!
        
        _ListAlt = ImageVector.Builder(
            name = "list-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                close()
                moveTo(128f, 120f)
                curveToRelative(-22.091f, 0f, -40f, 17.909f, -40f, 40f)
                reflectiveCurveToRelative(17.909f, 40f, 40f, 40f)
                reflectiveCurveToRelative(40f, -17.909f, 40f, -40f)
                reflectiveCurveToRelative(-17.909f, -40f, -40f, -40f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(-22.091f, 0f, -40f, 17.909f, -40f, 40f)
                reflectiveCurveToRelative(17.909f, 40f, 40f, 40f)
                reflectiveCurveToRelative(40f, -17.909f, 40f, -40f)
                reflectiveCurveToRelative(-17.909f, -40f, -40f, -40f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(-22.091f, 0f, -40f, 17.909f, -40f, 40f)
                reflectiveCurveToRelative(17.909f, 40f, 40f, 40f)
                reflectiveCurveToRelative(40f, -17.909f, 40f, -40f)
                reflectiveCurveToRelative(-17.909f, -40f, -40f, -40f)
                close()
                moveToRelative(288f, -136f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                close()
                moveToRelative(0f, 96f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                close()
                moveToRelative(0f, 96f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                close()
            }
        }.build()
        
        return _ListAlt!!
    }

private var _ListAlt: ImageVector? = null

