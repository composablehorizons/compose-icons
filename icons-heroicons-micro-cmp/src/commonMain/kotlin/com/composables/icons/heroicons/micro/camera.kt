package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 6.5f)
                verticalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 13f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 5f)
                horizontalLineToRelative(-0.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.06f, -0.44f)
                lineToRelative(-1.122f, -1.12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.38f, 3f)
                horizontalLineTo(6.62f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.06f, 0.44f)
                lineTo(4.439f, 4.56f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.38f, 5f)
                horizontalLineTo(2.5f)
                close()
                moveTo(11f, 8.5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

