package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ViewColumns: ImageVector
    get() {
        if (_ViewColumns != null) return _ViewColumns!!
        
        _ViewColumns = ImageVector.Builder(
            name = "view-columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 17f)
                horizontalLineToRelative(2.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 19f, 14.75f)
                verticalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 16.75f, 3f)
                horizontalLineTo(14f)
                verticalLineToRelative(14f)
                close()
                moveTo(12.5f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
                close()
                moveTo(3.25f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(14f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 14.75f)
                verticalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 3f)
                close()
            }
        }.build()
        
        return _ViewColumns!!
    }

private var _ViewColumns: ImageVector? = null

