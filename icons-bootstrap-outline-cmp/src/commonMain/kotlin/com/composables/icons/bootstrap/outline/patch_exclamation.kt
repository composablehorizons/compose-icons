package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PatchExclamation: ImageVector
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
                moveTo(7.001f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, true, true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.553f, 0.553f, 0f, false, true, -1.1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.273f, 2.513f)
                lineToRelative(-0.921f, -0.944f)
                lineToRelative(0.715f, -0.698f)
                lineToRelative(0.622f, 0.637f)
                lineToRelative(0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, 2.924f, 2.924f)
                lineToRelative(-0.01f, 0.89f)
                lineToRelative(0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, 0f, 4.134f)
                lineToRelative(-0.637f, 0.622f)
                lineToRelative(0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, -2.924f, 2.924f)
                lineToRelative(-0.89f, -0.01f)
                lineToRelative(-0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, -4.134f, 0f)
                lineToRelative(-0.622f, -0.637f)
                lineToRelative(-0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, -2.924f, -2.924f)
                lineToRelative(0.01f, -0.89f)
                lineToRelative(-0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, 0f, -4.134f)
                lineToRelative(0.637f, -0.622f)
                lineToRelative(-0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, 2.924f, -2.924f)
                lineToRelative(0.89f, 0.01f)
                lineToRelative(0.622f, -0.636f)
                arcToRelative(2.89f, 2.89f, 0f, false, true, 4.134f, 0f)
                lineToRelative(-0.715f, 0.698f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, -2.704f, 0f)
                lineToRelative(-0.92f, 0.944f)
                lineToRelative(-1.32f, -0.016f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, -1.911f, 1.912f)
                lineToRelative(0.016f, 1.318f)
                lineToRelative(-0.944f, 0.921f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, 0f, 2.704f)
                lineToRelative(0.944f, 0.92f)
                lineToRelative(-0.016f, 1.32f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, 1.912f, 1.911f)
                lineToRelative(1.318f, -0.016f)
                lineToRelative(0.921f, 0.944f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, 2.704f, 0f)
                lineToRelative(0.92f, -0.944f)
                lineToRelative(1.32f, 0.016f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, 1.911f, -1.912f)
                lineToRelative(-0.016f, -1.318f)
                lineToRelative(0.944f, -0.921f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, 0f, -2.704f)
                lineToRelative(-0.944f, -0.92f)
                lineToRelative(0.016f, -1.32f)
                arcToRelative(1.89f, 1.89f, 0f, false, false, -1.912f, -1.911f)
                close()
            }
        }.build()
        
        return _PatchExclamation!!
    }

private var _PatchExclamation: ImageVector? = null

