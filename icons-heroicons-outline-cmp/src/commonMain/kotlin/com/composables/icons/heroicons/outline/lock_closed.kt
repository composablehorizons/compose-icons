package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) return _LockClosed!!
        
        _LockClosed = ImageVector.Builder(
            name = "lock-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(16.5f, 10.5f)
                verticalLineTo(6.75f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -9f, 0f)
                verticalLineToRelative(3.75f)
                moveToRelative(-0.75f, 11.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                close()
            }
        }.build()
        
        return _LockClosed!!
    }

private var _LockClosed: ImageVector? = null

