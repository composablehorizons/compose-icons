package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_list_numbered: ImageVector
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
                moveTo(5f, 13f)
                horizontalLineTo(3.2f)
                lineTo(5f, 10.9f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.8f)
                lineTo(2f, 13.1f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(2f, -8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveTo(5f, 16f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(2f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(4f, 3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Format_list_numbered!!
    }

private var _Format_list_numbered: ImageVector? = null

