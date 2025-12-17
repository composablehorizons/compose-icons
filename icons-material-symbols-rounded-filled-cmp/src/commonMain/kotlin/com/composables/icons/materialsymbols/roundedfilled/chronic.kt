package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chronic: ImageVector
    get() {
        if (_Chronic != null) return _Chronic!!
        
        _Chronic = ImageVector.Builder(
            name = "chronic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 424f)
                verticalLineToRelative(-144f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 280f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 8f, 3f, 15f)
                reflectiveQuadToRelative(9f, 13f)
                lineToRelative(80f, 80f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-68f, -68f)
                close()
                moveTo(363f, 792f)
                quadToRelative(-122f, -26f, -202.5f, -124f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(150f, 0f, 255f, 105f)
                reflectiveQuadToRelative(105f, 255f)
                quadToRelative(0f, 43f, -10f, 83.5f)
                reflectiveQuadTo(762f, 600f)
                horizontalLineTo(518f)
                quadToRelative(-66f, 0f, -112f, 47f)
                reflectiveQuadToRelative(-46f, 113f)
                quadToRelative(0f, 8f, 0.5f, 16f)
                reflectiveQuadToRelative(2.5f, 16f)
                close()
                moveToRelative(157f, 48f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 680f)
                horizontalLineTo(520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(520f, 840f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
            }
        }.build()
        
        return _Chronic!!
    }

private var _Chronic: ImageVector? = null

