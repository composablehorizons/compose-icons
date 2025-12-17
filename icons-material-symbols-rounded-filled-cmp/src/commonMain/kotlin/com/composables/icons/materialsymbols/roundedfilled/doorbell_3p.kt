package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Doorbell_3p: ImageVector
    get() {
        if (_Doorbell_3p != null) return _Doorbell_3p!!
        
        _Doorbell_3p = ImageVector.Builder(
            name = "doorbell_3p",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(18f, 0f, 29f, -11f)
                reflectiveQuadToRelative(11f, -29f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 18f, 11f, 29f)
                reflectiveQuadToRelative(29f, 11f)
                close()
                moveToRelative(-140f, -60f)
                horizontalLineToRelative(280f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -45f, -23f, -80.5f)
                reflectiveQuadTo(512f, 220f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -14f, -9f, -23f)
                reflectiveQuadToRelative(-23f, -9f)
                quadToRelative(-14f, 0f, -23f, 9f)
                reflectiveQuadToRelative(-9f, 23f)
                verticalLineToRelative(12f)
                quadToRelative(-42f, 15f, -65f, 49f)
                reflectiveQuadToRelative(-23f, 79f)
                verticalLineToRelative(92f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
            }
        }.build()
        
        return _Doorbell_3p!!
    }

private var _Doorbell_3p: ImageVector? = null

