package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Radio: ImageVector
    get() {
        if (_Radio != null) return _Radio!!
        
        _Radio = ImageVector.Builder(
            name = "radio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.437f, 1.45f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.386f, 0.987f)
                lineTo(7.478f, 4f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(0.736f)
                lineToRelative(6.713f, -2.937f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.988f, 0.386f)
                close()
                moveTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveTo(6.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveToRelative(-0.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveToRelative(2.323f, -1.225f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.75f, -1.3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 1.3f)
                close()
                moveTo(7.3f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.299f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.3f, -0.75f)
                close()
                moveToRelative(-0.549f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveToRelative(-3.348f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.3f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.3f, 0.75f)
                close()
                moveToRelative(0.275f, -1.975f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.75f, -1.3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 1.3f)
                close()
                moveTo(12f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _Radio!!
    }

private var _Radio: ImageVector? = null

