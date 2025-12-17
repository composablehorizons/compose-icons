package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Privacy_screen: ImageVector
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
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Privacy_screen!!
    }

private var _Privacy_screen: ImageVector? = null

