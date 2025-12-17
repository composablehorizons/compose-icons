package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Piano: ImageVector
    get() {
        if (_Piano != null) return _Piano!!
        
        _Piano = ImageVector.Builder(
            name = "piano",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveTo(13f, 14.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(19f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(14.5f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Piano!!
    }

private var _Piano: ImageVector? = null

