package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ViewColumns: ImageVector
    get() {
        if (_ViewColumns != null) return _ViewColumns!!
        
        _ViewColumns = ImageVector.Builder(
            name = "view-columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.75f)
                horizontalLineTo(9f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6f)
                verticalLineTo(3.75f)
                close()
                moveTo(16.5f, 20.25f)
                horizontalLineToRelative(3.375f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineTo(5.625f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(4.125f, 3.75f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(16.5f)
                horizontalLineTo(4.125f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineTo(5.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                close()
            }
        }.build()
        
        return _ViewColumns!!
    }

private var _ViewColumns: ImageVector? = null

