package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hourglass_arrow_up: ImageVector
    get() {
        if (_Hourglass_arrow_up != null) return _Hourglass_arrow_up!!
        
        _Hourglass_arrow_up = ImageVector.Builder(
            name = "hourglass_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 440f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                verticalLineToRelative(-100f)
                horizontalLineTo(240f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(240f, 720f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -42f, 18f, -78f)
                reflectiveQuadToRelative(50f, -62f)
                quadToRelative(-32f, -26f, -50f, -62f)
                reflectiveQuadToRelative(-18f, -78f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(100f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(140f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 240f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, -18f, 78f)
                reflectiveQuadToRelative(-50f, 62f)
                quadToRelative(32f, 26f, 50f, 62f)
                reflectiveQuadToRelative(18f, 78f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(20f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 800f)
                horizontalLineTo(140f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(100f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(140f, 720f)
                horizontalLineToRelative(20f)
                close()
                moveToRelative(180f, -480f)
                close()
                moveToRelative(0f, 480f)
                close()
                moveToRelative(400f, -408f)
                lineToRelative(-24f, 24f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(92f, -92f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(92f, 92f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(899f, 336f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(843f, 336f)
                lineToRelative(-23f, -23f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(780f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(740f, 760f)
                verticalLineToRelative(-448f)
                close()
            }
        }.build()
        
        return _Hourglass_arrow_up!!
    }

private var _Hourglass_arrow_up: ImageVector? = null

