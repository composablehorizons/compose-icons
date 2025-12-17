package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Privacy_screen: ImageVector
    get() {
        if (_Privacy_screen != null) return _Privacy_screen!!
        
        _Privacy_screen = ImageVector.Builder(
            name = "privacy_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 480f)
                lineToRelative(144f, -144f)
                horizontalLineTo(160f)
                verticalLineToRelative(144f)
                close()
                moveToRelative(0f, 280f)
                lineToRelative(423f, -424f)
                horizontalLineTo(416f)
                lineTo(160f, 593f)
                verticalLineToRelative(167f)
                close()
                moveToRelative(56f, 56f)
                horizontalLineToRelative(584f)
                verticalLineTo(336f)
                horizontalLineTo(696f)
                lineTo(216f, 816f)
                close()
                moveToRelative(-56f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 896f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Privacy_screen!!
    }

private var _Privacy_screen: ImageVector? = null

