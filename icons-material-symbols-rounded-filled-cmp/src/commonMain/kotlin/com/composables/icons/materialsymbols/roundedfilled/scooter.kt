package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Scooter: ImageVector
    get() {
        if (_Scooter != null) return _Scooter!!
        
        _Scooter = ImageVector.Builder(
            name = "scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 720f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-560f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 720f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 70f, 22.5f)
                reflectiveQuadToRelative(43f, 57.5f)
                horizontalLineToRelative(211f)
                quadToRelative(11f, -68f, 56.5f, -119f)
                reflectiveQuadTo(692f, 450f)
                lineToRelative(-56f, -250f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 120f)
                horizontalLineToRelative(116f)
                quadToRelative(28f, 0f, 50f, 17f)
                reflectiveQuadToRelative(28f, 45f)
                lineToRelative(66f, 293f)
                quadToRelative(4f, 17f, -7f, 30.5f)
                reflectiveQuadTo(744f, 521f)
                quadToRelative(-63f, 5f, -102.5f, 51.5f)
                reflectiveQuadTo(600f, 682f)
                quadToRelative(0f, 16f, -11f, 27f)
                reflectiveQuadToRelative(-27f, 11f)
                horizontalLineTo(313f)
                quadToRelative(-12f, 35f, -43f, 57.5f)
                reflectiveQuadTo(200f, 800f)
                close()
            }
        }.build()
        
        return _Scooter!!
    }

private var _Scooter: ImageVector? = null

