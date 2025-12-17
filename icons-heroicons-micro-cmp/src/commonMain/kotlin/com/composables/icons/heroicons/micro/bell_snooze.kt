package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BellSnooze: ImageVector
    get() {
        if (_BellSnooze != null) return _BellSnooze!!
        
        _BellSnooze = ImageVector.Builder(
            name = "bell-snooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(2.379f)
                curveToRelative(0f, 0.398f, 0.158f, 0.779f, 0.44f, 1.06f)
                lineToRelative(1.267f, 1.268f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineTo(3.56f, 8.44f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 7.38f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
                moveToRelative(0f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 12f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 13.5f)
                close()
                moveTo(6.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.043f)
                lineTo(6.14f, 7.814f)
                arcTo(0.75f, 0.75f, 0f, false, false, 6.75f, 9f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineTo(8.207f)
                lineTo(9.86f, 5.186f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9.25f, 4f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _BellSnooze!!
    }

private var _BellSnooze: ImageVector? = null

