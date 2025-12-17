package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeVo: ImageVector
    get() {
        if (_BadgeVo != null) return _BadgeVo!!
        
        _BadgeVo = ImageVector.Builder(
            name = "badge-vo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.296f, 8.394f)
                verticalLineToRelative(-0.782f)
                curveToRelative(0f, -1.156f, -0.571f, -1.736f, -1.362f, -1.736f)
                curveToRelative(-0.796f, 0f, -1.363f, 0.58f, -1.363f, 1.736f)
                verticalLineToRelative(0.782f)
                curveToRelative(0f, 1.156f, 0.567f, 1.732f, 1.363f, 1.732f)
                curveToRelative(0.79f, 0f, 1.362f, -0.576f, 1.362f, -1.732f)
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
                moveToRelative(11.5f, 5.62f)
                verticalLineToRelative(0.77f)
                curveToRelative(0f, 1.691f, -0.962f, 2.724f, -2.566f, 2.724f)
                reflectiveCurveTo(8.363f, 10.081f, 8.363f, 8.39f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0f, -1.704f, 0.967f, -2.733f, 2.57f, -2.733f)
                curveToRelative(1.605f, 0f, 2.567f, 1.037f, 2.567f, 2.734f)
                close()
                moveTo(5.937f, 11f)
                horizontalLineTo(4.508f)
                lineTo(2.5f, 5.001f)
                horizontalLineToRelative(1.375f)
                lineTo(5.22f, 9.708f)
                horizontalLineToRelative(0.057f)
                lineTo(6.61f, 5.001f)
                horizontalLineToRelative(1.318f)
                close()
            }
        }.build()
        
        return _BadgeVo!!
    }

private var _BadgeVo: ImageVector? = null

