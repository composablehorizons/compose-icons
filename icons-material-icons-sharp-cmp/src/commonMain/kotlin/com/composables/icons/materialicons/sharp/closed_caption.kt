package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Closed_caption: ImageVector
    get() {
        if (_Closed_caption != null) return _Closed_caption!!
        
        _Closed_caption = ImageVector.Builder(
            name = "closed_caption",
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
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                close()
                moveToRelative(-10f, 7f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Closed_caption!!
    }

private var _Closed_caption: ImageVector? = null

