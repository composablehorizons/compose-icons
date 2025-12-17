package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_week: ImageVector
    get() {
        if (_View_week != null) return _View_week!!
        
        _View_week = ImageVector.Builder(
            name = "view_week",
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
                moveTo(7.33f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(5.33f)
                verticalLineTo(20f)
                close()
                moveTo(22f, 20f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5.33f)
                verticalLineToRelative(16f)
                horizontalLineTo(22f)
                close()
                moveTo(14.67f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(9.33f)
                verticalLineToRelative(16f)
                horizontalLineTo(14.67f)
                close()
            }
        }.build()
        
        return _View_week!!
    }

private var _View_week: ImageVector? = null

