package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ListBullet: ImageVector
    get() {
        if (_ListBullet != null) return _ListBullet!!
        
        _ListBullet = ImageVector.Builder(
            name = "list-bullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 4.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6.75f, 4f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 4.75f)
                close()
                moveTo(6f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 10f)
                close()
                moveToRelative(0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(1.99f, 4.75f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(1.99f, 15.25f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(1.99f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _ListBullet!!
    }

private var _ListBullet: ImageVector? = null

