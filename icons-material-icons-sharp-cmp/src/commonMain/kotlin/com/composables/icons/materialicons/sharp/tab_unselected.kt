package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tab_unselected: ImageVector
    get() {
        if (_Tab_unselected != null) return _Tab_unselected!!
        
        _Tab_unselected = ImageVector.Builder(
            name = "tab_unselected",
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
                moveTo(1f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(8f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-8f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(23f, 3f)
                horizontalLineTo(13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(1f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(20f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-8f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Tab_unselected!!
    }

private var _Tab_unselected: ImageVector? = null

