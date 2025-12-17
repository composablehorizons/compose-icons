package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 2.843f, 5.541f)
                arcTo(3.75f, 3.75f, 0f, false, true, 9.25f, 14f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                close()
                moveToRelative(2.5f, 3.5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineTo(5.5f)
                close()
                moveToRelative(0f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 0f, -2.5f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

