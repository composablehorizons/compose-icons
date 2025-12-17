package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(7.5f, 12f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -9f, 0f)
                close()
                moveTo(18.894f, 6.166f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-1.591f, 1.59f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.061f)
                lineToRelative(1.591f, -1.59f)
                close()
                moveTo(21.75f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                close()
                moveTo(17.834f, 18.894f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.59f, -1.591f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.061f, 1.06f)
                lineToRelative(1.59f, 1.591f)
                close()
                moveTo(12f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 18f)
                close()
                moveTo(7.758f, 17.303f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, -1.06f)
                lineToRelative(-1.591f, 1.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.061f)
                lineToRelative(1.591f, -1.59f)
                close()
                moveTo(6f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 12f)
                close()
                moveTo(6.697f, 7.757f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.59f, -1.591f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, 1.06f)
                lineToRelative(1.59f, 1.591f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

