package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.157f, 2.176f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.147f, 0f)
                lineToRelative(-4.084f, 1.69f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 5.25f)
                verticalLineToRelative(10.877f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 2.074f, 1.386f)
                lineToRelative(3.51f, -1.452f)
                lineToRelative(4.26f, 1.762f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.146f, 0f)
                lineToRelative(4.083f, -1.69f)
                arcTo(1.5f, 1.5f, 0f, false, false, 18f, 14.75f)
                verticalLineTo(3.872f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.073f, -1.386f)
                lineToRelative(-3.51f, 1.452f)
                lineToRelative(-4.26f, -1.762f)
                close()
                moveTo(7.58f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7.58f, 5f)
                close()
                moveToRelative(5.59f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

