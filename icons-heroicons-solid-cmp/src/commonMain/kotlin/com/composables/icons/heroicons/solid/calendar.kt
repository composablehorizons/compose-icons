package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Calendar: ImageVector
    get() {
        if (_Calendar != null) return _Calendar!!
        
        _Calendar = ImageVector.Builder(
            name = "calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.75f, 2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7.5f, 3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9f)
                verticalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(11.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(7.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(13.5f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineTo(5.25f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.build()
        
        return _Calendar!!
    }

private var _Calendar: ImageVector? = null

