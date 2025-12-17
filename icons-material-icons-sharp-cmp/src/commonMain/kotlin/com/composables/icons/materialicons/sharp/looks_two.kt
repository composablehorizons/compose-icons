package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Looks_two: ImageVector
    get() {
        if (_Looks_two != null) return _Looks_two!!
        
        _Looks_two = ImageVector.Builder(
            name = "looks_two",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-6f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Looks_two!!
    }

private var _Looks_two: ImageVector? = null

