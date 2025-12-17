package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.246f, 3.744f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.125f)
                arcToRelative(4.875f, 4.875f, 0f, false, true, 3.346f, 8.422f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -2.97f, 9.58f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(3.744f)
                close()
                moveToRelative(7.125f, 6.75f)
                arcToRelative(2.625f, 2.625f, 0f, false, false, 0f, -5.25f)
                horizontalLineTo(8.246f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(4.125f)
                close()
                moveToRelative(-4.125f, 2.251f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

