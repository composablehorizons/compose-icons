package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Swipe_left: ImageVector
    get() {
        if (_Swipe_left != null) return _Swipe_left!!
        
        _Swipe_left = ImageVector.Builder(
            name = "swipe_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(81f)
                quadToRelative(72f, -59f, 159f, -90f)
                reflectiveQuadToRelative(181f, -31f)
                quadToRelative(146f, 0f, 258f, 67f)
                reflectiveQuadToRelative(142f, 173f)
                horizontalLineToRelative(-63f)
                quadToRelative(-38f, -84f, -128.5f, -132f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(-88f, 0f, -169f, 31f)
                reflectiveQuadToRelative(-147f, 89f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(60f)
                horizontalLineTo(80f)
                close()
                moveTo(423f, 880f)
                lineTo(184f, 640f)
                lineToRelative(63f, -65f)
                lineToRelative(113f, 32f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(473f)
                lineToRelative(-97f, -27f)
                lineToRelative(114f, 114f)
                horizontalLineToRelative(263f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(423f)
                close()
                moveToRelative(57f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-19f, 80f)
                close()
            }
        }.build()
        
        return _Swipe_left!!
    }

private var _Swipe_left: ImageVector? = null

