package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Safe: ImageVector
    get() {
        if (_Safe != null) return _Safe!!
        
        _Safe = ImageVector.Builder(
            name = "safe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.778f, 9.414f)
                arcTo(2f, 2f, 0f, true, true, 6.95f, 6.586f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 2.828f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 1.5f)
                verticalLineTo(3f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 16f)
                horizontalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 0f)
                close()
                moveToRelative(3.036f, 4.464f)
                lineToRelative(1.09f, 1.09f)
                arcToRelative(3f, 3f, 0f, false, true, 3.476f, 0f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(0.74f, 1.037f, 0.74f, 2.44f, 0f, 3.476f)
                lineToRelative(1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.708f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(3f, 3f, 0f, false, true, -3.476f, 0f)
                lineToRelative(-1.09f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(1.09f, -1.09f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -3.476f)
                lineToRelative(-1.09f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                moveTo(14f, 6.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _Safe!!
    }

private var _Safe: ImageVector? = null

