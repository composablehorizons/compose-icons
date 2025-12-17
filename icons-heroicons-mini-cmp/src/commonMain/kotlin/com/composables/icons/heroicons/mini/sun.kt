package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 2f)
                close()
                moveTo(10f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 15f)
                close()
                moveTo(10f, 7f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                close()
                moveTo(15.657f, 5.404f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.061f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.06f, -1.06f)
                close()
                moveTo(6.464f, 14.596f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.06f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.06f, -1.06f)
                close()
                moveTo(18f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 10f)
                close()
                moveTo(5f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 10f)
                close()
                moveTo(14.596f, 15.657f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.06f, -1.061f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.06f, 1.06f)
                close()
                moveTo(5.404f, 6.464f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.061f, 1.06f)
                lineToRelative(1.06f, 1.06f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

