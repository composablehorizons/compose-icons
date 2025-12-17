package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Autoplay: ImageVector
    get() {
        if (_Autoplay != null) return _Autoplay!!
        
        _Autoplay = ImageVector.Builder(
            name = "autoplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 660f)
                verticalLineToRelative(-360f)
                lineToRelative(280f, 180f)
                lineToRelative(-280f, 180f)
                close()
                moveTo(480f, 920f)
                quadToRelative(-108f, 0f, -202.5f, -49.5f)
                reflectiveQuadTo(120f, 732f)
                verticalLineToRelative(108f)
                horizontalLineTo(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-98f)
                quadToRelative(51f, 75f, 129.5f, 117.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(115f, 0f, 208.5f, -66f)
                reflectiveQuadTo(820f, 599f)
                lineToRelative(78f, 18f)
                quadToRelative(-45f, 136f, -160f, 219.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(42f, 440f)
                quadToRelative(7f, -67f, 32f, -128.5f)
                reflectiveQuadTo(143f, 198f)
                lineToRelative(57f, 57f)
                quadToRelative(-32f, 41f, -52f, 87.5f)
                reflectiveQuadTo(123f, 440f)
                horizontalLineTo(42f)
                close()
                moveToRelative(214f, -241f)
                lineToRelative(-57f, -57f)
                quadToRelative(53f, -44f, 114f, -69.5f)
                reflectiveQuadTo(440f, 42f)
                verticalLineToRelative(80f)
                quadToRelative(-51f, 5f, -97f, 25f)
                reflectiveQuadToRelative(-87f, 52f)
                close()
                moveToRelative(449f, 0f)
                quadToRelative(-41f, -32f, -87.5f, -52f)
                reflectiveQuadTo(520f, 122f)
                verticalLineToRelative(-80f)
                quadToRelative(67f, 6f, 128.5f, 31f)
                reflectiveQuadTo(762f, 142f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(133f, 241f)
                quadToRelative(-5f, -51f, -25f, -97.5f)
                reflectiveQuadTo(761f, 255f)
                lineToRelative(57f, -57f)
                quadToRelative(44f, 52f, 69f, 113.5f)
                reflectiveQuadTo(918f, 440f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Autoplay!!
    }

private var _Autoplay: ImageVector? = null

