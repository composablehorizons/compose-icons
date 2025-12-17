package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_wake_on_press: ImageVector
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
                moveTo(760f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(360f)
                horizontalLineTo(760f)
                close()
                moveTo(268f, 840f)
                lineTo(40f, 609f)
                lineToRelative(85f, -87f)
                lineToRelative(115f, 24f)
                verticalLineToRelative(-326f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(34f)
                lineToRelative(215f, 95f)
                lineToRelative(-59f, 345f)
                horizontalLineTo(268f)
                close()
                moveToRelative(34f, -80f)
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

