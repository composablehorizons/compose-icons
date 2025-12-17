package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Folder: ImageVector
    get() {
        if (_Folder != null) return _Folder!!
        
        _Folder = ImageVector.Builder(
            name = "folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 21f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-4.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                close()
                moveTo(1.5f, 10.146f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(5.379f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.59f, 0.659f)
                lineToRelative(2.122f, 2.121f)
                curveToRelative(0.14f, 0.141f, 0.331f, 0.22f, 0.53f, 0.22f)
                horizontalLineTo(19.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(1.146f)
                arcTo(4.483f, 4.483f, 0f, false, false, 19.5f, 9f)
                horizontalLineToRelative(-15f)
                arcToRelative(4.483f, 4.483f, 0f, false, false, -3f, 1.146f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

