package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) return _Helicopter!!
        
        _Helicopter = ImageVector.Builder(
            name = "helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(190f, 351f)
                quadToRelative(-32f, 33f, -51f, 76f)
                reflectiveQuadToRelative(-19f, 93f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                quadToRelative(-50f, 0f, -94f, 19f)
                reflectiveQuadToRelative(-76f, 52f)
                close()
                moveToRelative(-70f, 329f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineTo(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, -128f)
                lineToRelative(240f, -24f)
                verticalLineToRelative(-48f)
                horizontalLineTo(600f)
                verticalLineToRelative(72f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(-40f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                lineToRelative(29f, -58f)
                quadToRelative(5f, -11f, 15f, -16.5f)
                reflectiveQuadToRelative(21f, -5.5f)
                horizontalLineToRelative(15f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 360f)
                verticalLineToRelative(168f)
                quadToRelative(0f, 31f, -20.5f, 53.5f)
                reflectiveQuadTo(848f, 607f)
                lineToRelative(-248f, 25f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineTo(120f)
                close()
                moveToRelative(40f, -600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 392f)
                verticalLineToRelative(-72f)
                verticalLineToRelative(72f)
                close()
                moveToRelative(-80f, 128f)
                close()
                moveToRelative(80f, -128f)
                verticalLineToRelative(-72f)
                verticalLineToRelative(72f)
                close()
            }
        }.build()
        
        return _Helicopter!!
    }

private var _Helicopter: ImageVector? = null

