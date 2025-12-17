package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Account_child_invert: ImageVector
    get() {
        if (_Account_child_invert != null) return _Account_child_invert!!
        
        _Account_child_invert = ImageVector.Builder(
            name = "account_child_invert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 80f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(47f, 0f, 93f, 11f)
                reflectiveQuadToRelative(83f, 31f)
                quadToRelative(38f, 19f, 61f, 45f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(232f)
                quadToRelative(0f, 17f, -8f, 33.5f)
                reflectiveQuadTo(710f, 800f)
                quadToRelative(-14f, 14f, -32.5f, 26f)
                reflectiveQuadTo(636f, 848f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -38f, -52.5f, -62f)
                reflectiveQuadTo(480f, 672f)
                quadToRelative(-50f, 0f, -96.5f, 20.5f)
                reflectiveQuadTo(326f, 746f)
                quadToRelative(38f, 15f, 78f, 21f)
                reflectiveQuadToRelative(82f, 7f)
                horizontalLineToRelative(34f)
                verticalLineToRelative(104f)
                quadToRelative(-7f, 2f, -14.5f, 2f)
                horizontalLineTo(490f)
                quadToRelative(-36f, 0f, -82.5f, -8f)
                reflectiveQuadTo(319f, 847f)
                quadToRelative(-42f, -17f, -70.5f, -44.5f)
                reflectiveQuadTo(220f, 736f)
                verticalLineToRelative(-232f)
                quadToRelative(0f, -31f, 23f, -57f)
                reflectiveQuadToRelative(60f, -45f)
                quadToRelative(38f, -20f, 84f, -31f)
                reflectiveQuadToRelative(93f, -11f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Account_child_invert!!
    }

private var _Account_child_invert: ImageVector? = null

