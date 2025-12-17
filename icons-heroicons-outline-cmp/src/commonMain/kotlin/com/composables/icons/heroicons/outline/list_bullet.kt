package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ListBullet: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(8.25f, 6.75f)
                horizontalLineToRelative(12f)
                moveTo(8.25f, 12f)
                horizontalLineToRelative(12f)
                moveToRelative(-12f, 5.25f)
                horizontalLineToRelative(12f)
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(3.75f)
                verticalLineTo(6.75f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveTo(3.75f, 12f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(3.75f)
                verticalLineTo(12f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(-0.375f, 5.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(3.75f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _ListBullet!!
    }

private var _ListBullet: ImageVector? = null

