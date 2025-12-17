package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.RectangleGroup: ImageVector
    get() {
        if (_RectangleGroup != null) return _RectangleGroup!!
        
        _RectangleGroup = ImageVector.Builder(
            name = "rectangle-group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 4.5f)
                verticalLineToRelative(4f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 10f)
                horizontalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10f, 8.5f)
                verticalLineToRelative(-4f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.5f, 3f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(11f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12f, 6.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 17.5f, 5f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-10f, 7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 13.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 17f)
                horizontalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 12f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _RectangleGroup!!
    }

private var _RectangleGroup: ImageVector? = null

