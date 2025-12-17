package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Grid_on: ImageVector
    get() {
        if (_Grid_on != null) return _Grid_on!!
        
        _Grid_on = ImageVector.Builder(
            name = "grid_on",
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
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(20f)
                verticalLineTo(2f)
                close()
                moveTo(8f, 20f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(6f, 12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(6f, 12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Grid_on!!
    }

private var _Grid_on: ImageVector? = null

