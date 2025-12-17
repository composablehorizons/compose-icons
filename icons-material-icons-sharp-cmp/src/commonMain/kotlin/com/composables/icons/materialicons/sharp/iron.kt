package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Iron: ImageVector
    get() {
        if (_Iron != null) return _Iron!!
        
        _Iron = ImageVector.Builder(
            name = "iron",
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
                moveTo(18f, 6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                close()
            }
        }.build()
        
        return _Iron!!
    }

private var _Iron: ImageVector? = null

