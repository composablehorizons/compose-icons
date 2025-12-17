package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_list_numbered: ImageVector
    get() {
        if (_Format_list_numbered != null) return _Format_list_numbered!!
        
        _Format_list_numbered = ImageVector.Builder(
            name = "format_list_numbered",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(1f, -9f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-1f, 3f)
                horizontalLineToRelative(1.8f)
                lineTo(2f, 13.1f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3.2f)
                lineTo(5f, 10.9f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(5f, -6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Format_list_numbered!!
    }

private var _Format_list_numbered: ImageVector? = null

