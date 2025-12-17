package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Closed_caption_disabled: ImageVector
    get() {
        if (_Closed_caption_disabled != null) return _Closed_caption_disabled!!
        
        _Closed_caption_disabled = ImageVector.Builder(
            name = "closed_caption_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(361f, 360f)
                lineToRelative(60f, 60f)
                horizontalLineTo(300f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -9f, 6f, -15f)
                reflectiveQuadToRelative(15f, -6f)
                horizontalLineToRelative(18f)
                quadToRelative(9f, 0f, 15f, 6f)
                reflectiveQuadToRelative(6f, 15f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                horizontalLineToRelative(81f)
                close()
                moveToRelative(479f, -120f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 20f, -13f, 30.5f)
                reflectiveQuadTo(799f, 681f)
                quadToRelative(-15f, 0f, -27f, -10.5f)
                reflectiveQuadTo(760f, 640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(359f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(319f, 200f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(401f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                close()
                moveTo(720f, 560f)
                quadToRelative(0f, 9f, -3.5f, 17.5f)
                reflectiveQuadTo(706f, 591f)
                lineToRelative(-51f, -51f)
                horizontalLineToRelative(5f)
                quadToRelative(0f, -9f, 6f, -15f)
                reflectiveQuadToRelative(15f, -6f)
                horizontalLineToRelative(18f)
                quadToRelative(9f, 0f, 15f, 6f)
                reflectiveQuadToRelative(6f, 15f)
                verticalLineToRelative(20f)
                close()
                moveToRelative(-40f, -200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 9f, -6f, 15f)
                reflectiveQuadToRelative(-15f, 6f)
                horizontalLineToRelative(-18f)
                quadToRelative(-9f, 0f, -15f, -6f)
                reflectiveQuadToRelative(-6f, -15f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(45f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-5f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(-122f, 82f)
                close()
                moveToRelative(-154f, 74f)
                close()
                moveTo(200f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -25f, 13.5f, -44.5f)
                reflectiveQuadTo(168f, 167f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(407f)
                lineTo(55f, 169f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 112f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 735f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 904f)
                lineTo(687f, 800f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

