package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) return _FolderOpen!!
        
        _FolderOpen = ImageVector.Builder(
            name = "folder-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.906f, 9f)
                curveToRelative(0.382f, 0f, 0.749f, 0.057f, 1.094f, 0.162f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-3.879f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, -0.22f)
                lineTo(11.47f, 3.66f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.879f, 3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(3.162f)
                arcTo(3.756f, 3.756f, 0f, false, true, 4.094f, 9f)
                horizontalLineToRelative(15.812f)
                close()
                moveTo(4.094f, 10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.227f, 2.568f)
                lineToRelative(0.857f, 6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.951f, 21f)
                horizontalLineTo(19.05f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.227f, -1.932f)
                lineToRelative(0.857f, -6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.227f, -2.568f)
                horizontalLineTo(4.094f)
                close()
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null

