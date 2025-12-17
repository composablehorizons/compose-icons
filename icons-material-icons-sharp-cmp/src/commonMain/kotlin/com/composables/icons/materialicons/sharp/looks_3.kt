package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Looks_3: ImageVector
    get() {
        if (_Looks_3 != null) return _Looks_3!!
        
        _Looks_3 = ImageVector.Builder(
            name = "looks_3",
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
                horizontalLineTo(3.01f)
                verticalLineToRelative(18f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                close()
                moveToRelative(-5.99f, 14f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Looks_3!!
    }

private var _Looks_3: ImageVector? = null

