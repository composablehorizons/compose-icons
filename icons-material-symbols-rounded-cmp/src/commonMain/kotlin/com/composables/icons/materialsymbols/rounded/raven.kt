package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Raven: ImageVector
    get() {
        if (_Raven != null) return _Raven!!
        
        _Raven = ImageVector.Builder(
            name = "raven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                lineToRelative(-51f, 123f)
                quadToRelative(-6f, 15f, -21.5f, 21.5f)
                reflectiveQuadTo(297f, 865f)
                quadToRelative(-15f, -6f, -21.5f, -21.5f)
                reflectiveQuadTo(275f, 813f)
                lineToRelative(43f, -104f)
                quadToRelative(-106f, -28f, -172f, -114f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(22f, 0f, 42f, 7.5f)
                reflectiveQuadToRelative(40f, 15.5f)
                lineToRelative(191f, 78f)
                quadToRelative(13f, 5f, 12.5f, 18.5f)
                reflectiveQuadTo(512f, 218f)
                lineToRelative(-112f, 42f)
                verticalLineToRelative(60f)
                lineToRelative(426f, 271f)
                quadToRelative(7f, 5f, 11f, 11.5f)
                reflectiveQuadToRelative(6f, 14.5f)
                lineToRelative(28f, 140f)
                quadToRelative(3f, 17f, -7.5f, 30f)
                reflectiveQuadTo(836f, 800f)
                horizontalLineToRelative(-14f)
                quadToRelative(-11f, 0f, -19f, -5.5f)
                reflectiveQuadTo(790f, 780f)
                lineToRelative(-30f, -60f)
                horizontalLineTo(560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 280f)
                close()
                moveToRelative(160f, 320f)
                close()
                moveToRelative(0f, 40f)
                horizontalLineToRelative(353f)
                lineToRelative(-63f, -40f)
                horizontalLineTo(400f)
                quadToRelative(-36f, 0f, -67.5f, -14.5f)
                reflectiveQuadTo(279f, 545f)
                quadToRelative(-13f, -14f, -25f, -38.5f)
                reflectiveQuadTo(242f, 462f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(282f, 422f)
                quadToRelative(15f, 0f, 26f, 10f)
                reflectiveQuadToRelative(14f, 24f)
                quadToRelative(5f, 28f, 27f, 46f)
                reflectiveQuadToRelative(51f, 18f)
                horizontalLineToRelative(165f)
                lineTo(320f, 364f)
                verticalLineToRelative(-124f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Raven!!
    }

private var _Raven: ImageVector? = null

