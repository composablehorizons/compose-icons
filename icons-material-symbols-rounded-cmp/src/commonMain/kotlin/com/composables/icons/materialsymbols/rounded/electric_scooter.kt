package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Electric_scooter: ImageVector
    get() {
        if (_Electric_scooter != null) return _Electric_scooter!!
        
        _Electric_scooter = ImageVector.Builder(
            name = "electric_scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 720f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(312f, 560f)
                horizontalLineToRelative(212f)
                quadToRelative(11f, -68f, 56.5f, -119f)
                reflectiveQuadTo(692f, 370f)
                lineToRelative(-56f, -250f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 40f)
                horizontalLineToRelative(116f)
                quadToRelative(28f, 0f, 50f, 17f)
                reflectiveQuadToRelative(28f, 45f)
                lineToRelative(69f, 309f)
                quadToRelative(2f, 11f, -5f, 20f)
                reflectiveQuadToRelative(-18f, 9f)
                quadToRelative(-63f, 0f, -108.5f, 42.5f)
                reflectiveQuadTo(601f, 587f)
                quadToRelative(-2f, 23f, -18f, 38f)
                reflectiveQuadToRelative(-39f, 15f)
                horizontalLineTo(312f)
                quadToRelative(-12f, 35f, -42.5f, 57.5f)
                reflectiveQuadTo(200f, 720f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 640f)
                close()
                moveToRelative(560f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 640f)
                close()
                moveTo(520f, 840f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 11f, -9.5f, 17f)
                reflectiveQuadTo(491f, 906f)
                lineToRelative(-173f, -87f)
                quadToRelative(-7f, -4f, -5.5f, -11.5f)
                reflectiveQuadToRelative(9.5f, -7.5f)
                horizontalLineToRelative(118f)
                verticalLineToRelative(-48f)
                quadToRelative(0f, -11f, 9.5f, -17f)
                reflectiveQuadToRelative(19.5f, -1f)
                lineToRelative(173f, 87f)
                quadToRelative(7f, 4f, 5.5f, 11.5f)
                reflectiveQuadTo(638f, 840f)
                horizontalLineTo(520f)
                close()
                moveTo(200f, 600f)
                close()
                moveToRelative(560f, 0f)
                close()
            }
        }.build()
        
        return _Electric_scooter!!
    }

private var _Electric_scooter: ImageVector? = null

