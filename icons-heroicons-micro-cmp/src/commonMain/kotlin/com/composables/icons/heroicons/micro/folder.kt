package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Folder: ImageVector
    get() {
        if (_Folder != null) return _Folder!!
        
        _Folder = ImageVector.Builder(
            name = "folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineToRelative(2.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.122f, 1.12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.62f, 4f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 5.5f)
                verticalLineToRelative(1.401f)
                arcToRelative(2.986f, 2.986f, 0f, false, false, -1.5f, -0.401f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.546f, 0f, -1.059f, 0.146f, -1.5f, 0.401f)
                verticalLineTo(3.5f)
                close()
                moveTo(2f, 9.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 8f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 9.5f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

