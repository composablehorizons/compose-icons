package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
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
                moveTo(11.5f, 9f)
                horizontalLineTo(13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9f)
                close()
                moveTo(10f, 9f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
                moveToRelative(9f, 1.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(6f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null

