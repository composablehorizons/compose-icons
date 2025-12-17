package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeHd: ImageVector
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
                moveTo(7.396f, 11f)
                verticalLineTo(5.001f)
                horizontalLineTo(6.209f)
                verticalLineToRelative(2.44f)
                horizontalLineTo(3.687f)
                verticalLineTo(5f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.187f)
                verticalLineTo(8.43f)
                horizontalLineToRelative(2.522f)
                verticalLineTo(11f)
                close()
                moveTo(8.5f, 5.001f)
                verticalLineTo(11f)
                horizontalLineToRelative(2.188f)
                curveToRelative(1.811f, 0f, 2.685f, -1.107f, 2.685f, -3.015f)
                curveToRelative(0f, -1.894f, -0.86f, -2.984f, -2.684f, -2.984f)
                close()
                moveToRelative(1.187f, 0.967f)
                horizontalLineToRelative(0.843f)
                curveToRelative(1.112f, 0f, 1.622f, 0.686f, 1.622f, 2.04f)
                curveToRelative(0f, 1.353f, -0.505f, 2.02f, -1.622f, 2.02f)
                horizontalLineToRelative(-0.843f)
                close()
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
        
        return _BadgeHd!!
    }

private var _BadgeHd: ImageVector? = null

