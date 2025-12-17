package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.ListAlt: ImageVector
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
                moveTo(464f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-6f, 400f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(86f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(404f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(340f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveToRelative(-42f, -92f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                close()
                moveToRelative(0f, -96f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                close()
                moveToRelative(0f, -96f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(204f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                close()
                moveToRelative(-252f, 12f)
                curveToRelative(0f, 19.882f, -16.118f, 36f, -36f, 36f)
                reflectiveCurveToRelative(-36f, -16.118f, -36f, -36f)
                reflectiveCurveToRelative(16.118f, -36f, 36f, -36f)
                reflectiveCurveToRelative(36f, 16.118f, 36f, 36f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(0f, 19.882f, -16.118f, 36f, -36f, 36f)
                reflectiveCurveToRelative(-36f, -16.118f, -36f, -36f)
                reflectiveCurveToRelative(16.118f, -36f, 36f, -36f)
                reflectiveCurveToRelative(36f, 16.118f, 36f, 36f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(0f, 19.882f, -16.118f, 36f, -36f, 36f)
                reflectiveCurveToRelative(-36f, -16.118f, -36f, -36f)
                reflectiveCurveToRelative(16.118f, -36f, 36f, -36f)
                reflectiveCurveToRelative(36f, 16.118f, 36f, 36f)
                close()
            }
        }.build()
        
        return _ListAlt!!
    }

private var _ListAlt: ImageVector? = null

