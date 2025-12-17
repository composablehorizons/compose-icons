package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bathtub: ImageVector
    get() {
        if (_Bathtub != null) return _Bathtub!!
        
        _Bathtub = ImageVector.Builder(
            name = "bathtub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -38f, 26f, -64f)
                reflectiveQuadToRelative(64f, -26f)
                quadToRelative(20f, 0f, 37f, 8f)
                reflectiveQuadToRelative(31f, 22f)
                lineToRelative(56f, 62f)
                quadToRelative(8f, 8f, 15.5f, 15f)
                reflectiveQuadToRelative(16.5f, 13f)
                horizontalLineToRelative(274f)
                verticalLineToRelative(-326f)
                quadToRelative(0f, -14f, -10f, -24f)
                reflectiveQuadToRelative(-24f, -10f)
                quadToRelative(-6f, 0f, -11.5f, 2.5f)
                reflectiveQuadTo(664f, 170f)
                lineToRelative(-50f, 50f)
                quadToRelative(5f, 17f, 2f, 33.5f)
                reflectiveQuadTo(604f, 284f)
                lineTo(494f, 172f)
                quadToRelative(14f, -9f, 30f, -11.5f)
                reflectiveQuadToRelative(32f, 3.5f)
                lineToRelative(50f, -50f)
                quadToRelative(16f, -16f, 36.5f, -25f)
                reflectiveQuadToRelative(43.5f, -9f)
                quadToRelative(48f, 0f, 81f, 33f)
                reflectiveQuadToRelative(33f, 81f)
                verticalLineToRelative(326f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-40f, -120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Bathtub!!
    }

private var _Bathtub: ImageVector? = null

