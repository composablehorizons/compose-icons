package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
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
                moveTo(21.75f, 17.25f)
                verticalLineToRelative(-0.228f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -0.12f, -1.03f)
                lineToRelative(-2.268f, -9.64f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.285f, -2.602f)
                horizontalLineTo(7.923f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.285f, 2.602f)
                lineToRelative(-2.268f, 9.64f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -0.12f, 1.03f)
                verticalLineToRelative(0.228f)
                moveToRelative(19.5f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                moveToRelative(19.5f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                moveToRelative(16.5f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

