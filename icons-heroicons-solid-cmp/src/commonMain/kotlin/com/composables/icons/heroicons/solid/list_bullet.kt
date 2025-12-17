package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ListBullet: ImageVector
    get() {
        if (_ListBullet != null) return _ListBullet!!
        
        _ListBullet = ImageVector.Builder(
            name = "list-bullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.625f, 6.75f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveToRelative(4.875f, 0f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8.25f, 6f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2.625f, 12f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveTo(7.5f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7.5f, 12f)
                close()
                moveToRelative(-4.875f, 5.25f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveToRelative(4.875f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ListBullet!!
    }

private var _ListBullet: ImageVector? = null

