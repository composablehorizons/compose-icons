package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Id_card: ImageVector
    get() {
        if (_Id_card != null) return _Id_card!!
        
        _Id_card = ImageVector.Builder(
            name = "id_card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 520f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 320f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 400f)
                horizontalLineToRelative(120f)
                close()
                moveTo(360f, 520f)
                quadToRelative(-36f, 0f, -65f, 6.5f)
                reflectiveQuadTo(244f, 547f)
                quadToRelative(-21f, 13f, -32f, 29.5f)
                reflectiveQuadTo(201f, 612f)
                quadToRelative(0f, 12f, 9f, 20f)
                reflectiveQuadToRelative(22f, 8f)
                horizontalLineToRelative(256f)
                quadToRelative(13f, 0f, 22f, -8.5f)
                reflectiveQuadToRelative(9f, -21.5f)
                quadToRelative(0f, -17f, -11f, -33f)
                reflectiveQuadToRelative(-32f, -30f)
                quadToRelative(-22f, -14f, -51f, -20.5f)
                reflectiveQuadToRelative(-65f, -6.5f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 480f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Id_card!!
    }

private var _Id_card: ImageVector? = null

