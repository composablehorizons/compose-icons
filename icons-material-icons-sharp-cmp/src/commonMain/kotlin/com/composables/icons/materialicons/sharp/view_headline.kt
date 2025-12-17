package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_headline: ImageVector
    get() {
        if (_View_headline != null) return _View_headline!!
        
        _View_headline = ImageVector.Builder(
            name = "view_headline",
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
                moveTo(4f, 15f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _View_headline!!
    }

private var _View_headline: ImageVector? = null

