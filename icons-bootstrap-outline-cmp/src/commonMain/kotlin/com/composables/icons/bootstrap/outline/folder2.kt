package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Folder2: ImageVector
    get() {
        if (_Folder2 != null) return _Folder2!!
        
        _Folder2 = ImageVector.Builder(
            name = "folder2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 2f)
                horizontalLineToRelative(2.764f)
                curveToRelative(0.958f, 0f, 1.76f, 0.56f, 2.311f, 1.184f)
                curveTo(7.985f, 3.648f, 8.48f, 4f, 9f, 4f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 5.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 12.5f)
                close()
                moveTo(2.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(9f)
                curveToRelative(-0.964f, 0f, -1.71f, -0.629f, -2.174f, -1.154f)
                curveTo(6.374f, 3.334f, 5.82f, 3f, 5.264f, 3f)
                close()
                moveTo(14f, 7f)
                horizontalLineTo(2f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Folder2!!
    }

private var _Folder2: ImageVector? = null

