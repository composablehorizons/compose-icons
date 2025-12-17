package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PatchExclamation: ImageVector
    get() {
        if (_PatchExclamation != null) return _PatchExclamation!!
        
        _PatchExclamation = ImageVector.Builder(
            name = "patch-exclamation",
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
                moveTo(8f, 4f)
                curveToRelative(0.535f, 0f, 0.954f, 0.462f, 0.9f, 0.995f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, true, -1.1f, 0f)
                lineTo(7.1f, 4.995f)
                arcTo(0.905f, 0.905f, 0f, false, true, 8f, 4f)
                moveToRelative(0.002f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
        }.build()
        
        return _PatchExclamation!!
    }

private var _PatchExclamation: ImageVector? = null

