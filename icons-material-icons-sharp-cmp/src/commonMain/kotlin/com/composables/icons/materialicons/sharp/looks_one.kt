package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Looks_one: ImageVector
    get() {
        if (_Looks_one != null) return _Looks_one!!
        
        _Looks_one = ImageVector.Builder(
            name = "looks_one",
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
                moveToRelative(-7f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Looks_one!!
    }

private var _Looks_one: ImageVector? = null

