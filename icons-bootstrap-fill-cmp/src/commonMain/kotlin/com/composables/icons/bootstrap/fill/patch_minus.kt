package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PatchMinus: ImageVector
    get() {
        if (_PatchMinus != null) return _PatchMinus!!
        
        _PatchMinus = ImageVector.Builder(
            name = "patch-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.067f, 0.87f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, -4.134f, 0f)
                lineToRelative(-0.622f, 0.638f)
                lineToRelative(-0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, -2.924f, 2.924f)
                lineToRelative(0.01f, 0.89f)
                lineToRelative(-0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 0f, 4.134f)
                lineToRelative(0.637f, 0.622f)
                lineToRelative(-0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 2.924f, 2.924f)
                lineToRelative(0.89f, -0.01f)
                lineToRelative(0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 4.134f, 0f)
                lineToRelative(0.622f, -0.637f)
                lineToRelative(0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 2.924f, -2.924f)
                lineToRelative(-0.01f, -0.89f)
                lineToRelative(0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 0f, -4.134f)
                lineToRelative(-0.637f, -0.622f)
                lineToRelative(0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, -2.924f, -2.924f)
                lineToRelative(-0.89f, 0.01f)
                close()
                moveTo(6f, 7.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _PatchMinus!!
    }

private var _PatchMinus: ImageVector? = null

