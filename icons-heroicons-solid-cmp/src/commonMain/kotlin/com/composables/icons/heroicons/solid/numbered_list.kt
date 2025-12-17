package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.NumberedList: ImageVector
    get() {
        if (_NumberedList != null) return _NumberedList!!
        
        _NumberedList = ImageVector.Builder(
            name = "numbered-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.491f, 5.992f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.49f, 11.995f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.491f, 17.994f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2.24f, 3.745f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.125f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.375f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.375f)
                verticalLineToRelative(-2.25f)
                horizontalLineTo(2.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2.79f, 10.602f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                arcToRelative(1.875f, 1.875f, 0f, true, true, 2.652f, 2.651f)
                lineToRelative(-0.55f, 0.55f)
                horizontalLineToRelative(0.35f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.16f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, -1.281f)
                lineToRelative(1.83f, -1.83f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.062f, 0f)
                close()
                moveTo(2.24f, 15.745f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.125f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 1.501f, 2.999f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.501f, 3f)
                horizontalLineTo(2.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.501f)
                horizontalLineToRelative(1.125f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.036f, -0.748f)
                horizontalLineTo(3.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.002f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.411f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.036f, -0.748f)
                horizontalLineTo(2.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _NumberedList!!
    }

private var _NumberedList: ImageVector? = null

