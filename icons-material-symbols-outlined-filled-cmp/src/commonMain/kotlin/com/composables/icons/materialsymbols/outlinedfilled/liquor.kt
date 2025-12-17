package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Liquor: ImageVector
    get() {
        if (_Liquor != null) return _Liquor!!
        
        _Liquor = ImageVector.Builder(
            name = "liquor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-128f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(280f, 672f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(520f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-382f)
                quadToRelative(0f, -26f, 15f, -46.5f)
                reflectiveQuadToRelative(39f, -29.5f)
                lineToRelative(38f, -14f)
                quadToRelative(14f, -5f, 21f, -14.5f)
                reflectiveQuadToRelative(7f, -23.5f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 14f, 7f, 23.5f)
                reflectiveQuadToRelative(21f, 14.5f)
                lineToRelative(38f, 14f)
                quadToRelative(24f, 9f, 39f, 29.5f)
                reflectiveQuadToRelative(15f, 46.5f)
                verticalLineToRelative(382f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(520f)
                close()
                moveToRelative(120f, -680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveTo(520f, 480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-62f)
                lineToRelative(-38f, -14f)
                quadToRelative(-38f, -14f, -60f, -44f)
                reflectiveQuadToRelative(-22f, -68f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 38f, -22f, 68f)
                reflectiveQuadToRelative(-60f, 44f)
                lineToRelative(-38f, 14f)
                verticalLineToRelative(62f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Liquor!!
    }

private var _Liquor: ImageVector? = null

