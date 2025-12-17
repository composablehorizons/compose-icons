package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Copy_all: ImageVector
    get() {
        if (_Copy_all != null) return _Copy_all!!
        
        _Copy_all = ImageVector.Builder(
            name = "copy_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(20f, 2f)
                horizontalLineTo(7f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(13f)
                verticalLineTo(2f)
                close()
                moveTo(18f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineToRelative(9f)
                verticalLineTo(16f)
                close()
                moveTo(3f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 9.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(9.5f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(20f)
                close()
                moveTo(3f, 18.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(5f, 22f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(8.5f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(15.5f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(3f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Copy_all!!
    }

private var _Copy_all: ImageVector? = null

