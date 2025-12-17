package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Safe: ImageVector
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
                moveTo(1f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 0f)
                horizontalLineToRelative(12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 14.5f)
                verticalLineTo(13f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(8.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                close()
                moveTo(2.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(4.828f, 4.464f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
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
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveTo(6.95f, 6.586f)
                arcToRelative(2f, 2f, 0f, true, false, 2.828f, 2.828f)
                arcTo(2f, 2f, 0f, false, false, 6.95f, 6.586f)
            }
        }.build()
        
        return _Safe!!
    }

private var _Safe: ImageVector? = null

