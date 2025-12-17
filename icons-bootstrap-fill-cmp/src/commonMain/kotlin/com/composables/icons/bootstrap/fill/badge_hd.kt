package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeHd: ImageVector
    get() {
        if (_BadgeHd != null) return _BadgeHd!!
        
        _BadgeHd = ImageVector.Builder(
            name = "badge-hd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.53f, 5.968f)
                horizontalLineToRelative(-0.843f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.843f)
                curveToRelative(1.117f, 0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(5.396f, 3.001f)
                verticalLineTo(11f)
                horizontalLineTo(6.209f)
                verticalLineTo(8.43f)
                horizontalLineTo(3.687f)
                verticalLineTo(11f)
                horizontalLineTo(2.5f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.44f)
                horizontalLineToRelative(2.522f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.187f)
                close()
                moveTo(8.5f, 11f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(2.188f)
                curveToRelative(1.824f, 0f, 2.685f, 1.09f, 2.685f, 2.984f)
                curveTo(13.373f, 9.893f, 12.5f, 11f, 10.69f, 11f)
                close()
            }
        }.build()
        
        return _BadgeHd!!
    }

private var _BadgeHd: ImageVector? = null

