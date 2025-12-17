package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6f)
                arcToRelative(4f, 4f, 0f, false, true, -4.899f, 3.899f)
                lineToRelative(-1.955f, 1.955f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.293f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.353f)
                lineToRelative(3.955f, -3.955f)
                arcTo(4f, 4f, 0f, true, true, 14f, 6f)
                close()
                moveToRelative(-4f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

