package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) return _ArrowPath!!
        
        _ArrowPath = ImageVector.Builder(
            name = "arrow-path",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.836f, 2.477f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.182f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-3.182f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.37f)
                lineToRelative(-0.84f, -0.841f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -7.08f, 0.932f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.3f, -0.75f)
                arcToRelative(6f, 6f, 0f, false, true, 9.44f, -1.242f)
                lineToRelative(0.842f, 0.84f)
                verticalLineTo(3.227f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-0.911f, 7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 13.199f, 11f)
                arcToRelative(6f, 6f, 0f, false, true, -9.44f, 1.241f)
                lineToRelative(-0.84f, -0.84f)
                verticalLineToRelative(1.371f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(9.591f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(5.35f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.98f)
                lineToRelative(0.841f, 0.841f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 7.08f, -0.932f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.025f, -0.273f)
                close()
            }
        }.build()
        
        return _ArrowPath!!
    }

private var _ArrowPath: ImageVector? = null

