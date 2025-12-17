package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Square2Stack: ImageVector
    get() {
        if (_Square2Stack != null) return _Square2Stack!!
        
        _Square2Stack = ImageVector.Builder(
            name = "square-2-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 5f)
                horizontalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 6.5f)
                verticalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 12.5f)
                verticalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 11f)
                verticalLineTo(6.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineTo(11f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Square2Stack!!
    }

private var _Square2Stack: ImageVector? = null

