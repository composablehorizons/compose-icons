package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Developer_board: ImageVector
    get() {
        if (_Developer_board != null) return _Developer_board!!
        
        _Developer_board = ImageVector.Builder(
            name = "developer_board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(8f, -12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(-4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineTo(6f)
                close()
                moveToRelative(6f, 0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(10f, -2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-4f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Developer_board!!
    }

private var _Developer_board: ImageVector? = null

