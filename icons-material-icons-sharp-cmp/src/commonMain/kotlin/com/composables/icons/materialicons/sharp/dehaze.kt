package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dehaze: ImageVector
    get() {
        if (_Dehaze != null) return _Dehaze!!
        
        _Dehaze = ImageVector.Builder(
            name = "dehaze",
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
                moveTo(2f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, -5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, -5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Dehaze!!
    }

private var _Dehaze: ImageVector? = null

