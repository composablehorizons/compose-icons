package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Storage: ImageVector
    get() {
        if (_Storage != null) return _Storage!!
        
        _Storage = ImageVector.Builder(
            name = "storage",
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
                moveTo(2f, 20f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4f)
                horizontalLineTo(2f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(2f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                close()
                moveToRelative(4f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-4f, 7f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4f)
                horizontalLineTo(2f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(2f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Storage!!
    }

private var _Storage: ImageVector? = null

