package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.FolderOpen: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.75f, 9.776f)
                curveToRelative(0.112f, -0.017f, 0.227f, -0.026f, 0.344f, -0.026f)
                horizontalLineToRelative(15.812f)
                curveToRelative(0.117f, 0f, 0.232f, 0.009f, 0.344f, 0.026f)
                moveToRelative(-16.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -1.883f, 2.542f)
                lineToRelative(0.857f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.227f, 1.932f)
                horizontalLineTo(19.05f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.227f, -1.932f)
                lineToRelative(0.857f, -6f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -1.883f, -2.542f)
                moveToRelative(-16.5f, 0f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6f, 3.75f)
                horizontalLineToRelative(3.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(2.122f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.06f, 0.44f)
                horizontalLineTo(18f)
                arcTo(2.25f, 2.25f, 0f, false, true, 20.25f, 9f)
                verticalLineToRelative(0.776f)
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null

