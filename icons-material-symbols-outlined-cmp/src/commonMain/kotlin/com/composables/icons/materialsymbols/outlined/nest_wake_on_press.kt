package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_wake_on_press: ImageVector
    get() {
        if (_Nest_wake_on_press != null) return _Nest_wake_on_press!!
        
        _Nest_wake_on_press = ImageVector.Builder(
            name = "nest_wake_on_press",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 520f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(820f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 220f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 520f)
                close()
                moveTo(301f, 840f)
                quadToRelative(-17f, 0f, -31f, -6.5f)
                reflectiveQuadTo(245f, 816f)
                lineTo(40f, 609f)
                lineToRelative(56f, -57f)
                quadToRelative(14f, -14f, 32f, -20f)
                reflectiveQuadToRelative(37f, -2f)
                lineToRelative(75f, 16f)
                verticalLineToRelative(-326f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(26f)
                quadToRelative(5f, 0f, 9f, 1f)
                reflectiveQuadToRelative(9f, 3f)
                lineToRelative(152f, 67f)
                quadToRelative(24f, 11f, 36f, 35f)
                reflectiveQuadToRelative(7f, 50f)
                lineToRelative(-37f, 217f)
                quadToRelative(-5f, 29f, -27.5f, 48f)
                reflectiveQuadTo(563f, 840f)
                horizontalLineTo(301f)
                close()
                moveToRelative(1f, -80f)
                horizontalLineToRelative(261f)
                lineToRelative(37f, -218f)
                lineToRelative(-170f, -75f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -9f, -5.5f, -14.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(-9f, 0f, -14.5f, 5.5f)
                reflectiveQuadTo(320f, 220f)
                verticalLineToRelative(424f)
                lineToRelative(-167f, -35f)
                lineToRelative(149f, 151f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(261f)
                horizontalLineToRelative(-261f)
                close()
            }
        }.build()
        
        return _Nest_wake_on_press!!
    }

private var _Nest_wake_on_press: ImageVector? = null

