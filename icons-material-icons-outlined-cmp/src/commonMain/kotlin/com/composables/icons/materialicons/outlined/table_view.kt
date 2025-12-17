package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Table_view: ImageVector
    get() {
        if (_Table_view != null) return _Table_view!!
        
        _Table_view = ImageVector.Builder(
            name = "table_view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 7f)
                    horizontalLineTo(9f)
                    curveTo(7.9f, 7f, 7f, 7.9f, 7f, 9f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(9f)
                    curveTo(21f, 7.9f, 20.1f, 7f, 19f, 7f)
                    close()
                    moveTo(19f, 9f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9f)
                    verticalLineTo(9f)
                    horizontalLineTo(19f)
                    close()
                    moveTo(13f, 15f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(15f, 17f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(11f, 15f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(17f, 13f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(9f, 17f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9f)
                    verticalLineTo(17f)
                    close()
                    moveTo(17f, 19f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(6f, 17f)
                    horizontalLineTo(5f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Table_view!!
    }

private var _Table_view: ImageVector? = null

