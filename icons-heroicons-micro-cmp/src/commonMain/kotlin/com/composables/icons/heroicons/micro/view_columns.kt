package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ViewColumns: ImageVector
    get() {
        if (_ViewColumns != null) return _ViewColumns!!
        
        _ViewColumns = ImageVector.Builder(
            name = "view-columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.836f, 3f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.67f)
                verticalLineTo(3f)
                close()
                moveTo(11.336f, 13f)
                horizontalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 3f)
                horizontalLineToRelative(-2.164f)
                verticalLineToRelative(10f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(2.166f)
                verticalLineToRelative(10f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 11.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 3f)
                close()
            }
        }.build()
        
        return _ViewColumns!!
    }

private var _ViewColumns: ImageVector? = null

