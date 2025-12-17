package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeVo: ImageVector
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
                moveTo(4.508f, 11f)
                horizontalLineToRelative(1.429f)
                lineToRelative(1.99f, -5.999f)
                horizontalLineTo(6.61f)
                lineTo(5.277f, 9.708f)
                horizontalLineTo(5.22f)
                lineTo(3.875f, 5.001f)
                horizontalLineTo(2.5f)
                close()
                moveTo(13.5f, 8.39f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0f, -1.696f, -0.962f, -2.733f, -2.566f, -2.733f)
                reflectiveCurveTo(8.363f, 5.916f, 8.363f, 7.621f)
                verticalLineToRelative(0.769f)
                curveToRelative(0f, 1.691f, 0.967f, 2.724f, 2.57f, 2.724f)
                curveToRelative(1.605f, 0f, 2.567f, -1.033f, 2.567f, -2.724f)
                moveToRelative(-1.204f, -0.778f)
                verticalLineToRelative(0.782f)
                curveToRelative(0f, 1.156f, -0.571f, 1.732f, -1.362f, 1.732f)
                curveToRelative(-0.796f, 0f, -1.363f, -0.576f, -1.363f, -1.732f)
                verticalLineToRelative(-0.782f)
                curveToRelative(0f, -1.156f, 0.567f, -1.736f, 1.363f, -1.736f)
                curveToRelative(0.79f, 0f, 1.362f, 0.58f, 1.362f, 1.736f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _BadgeVo!!
    }

private var _BadgeVo: ImageVector? = null

