package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Square2Stack: ImageVector
    get() {
        if (_Square2Stack != null) return _Square2Stack!!
        
        _Square2Stack = ImageVector.Builder(
            name = "square-2-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(7.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                verticalLineToRelative(-6f)
                arcTo(4.5f, 4.5f, 0f, false, true, 10.5f, 6f)
                horizontalLineToRelative(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 7.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-7.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineTo(18f)
                close()
            }
        }.build()
        
        return _Square2Stack!!
    }

private var _Square2Stack: ImageVector? = null

