package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PatchPlus: ImageVector
    get() {
        if (_PatchPlus != null) return _PatchPlus!!
        
        _PatchPlus = ImageVector.Builder(
            name = "patch-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(8.5f)
                verticalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
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
        
        return _PatchPlus!!
    }

private var _PatchPlus: ImageVector? = null

