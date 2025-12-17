package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Patient_list: ImageVector
    get() {
        if (_Patient_list != null) return _Patient_list!!
        
        _Patient_list = ImageVector.Builder(
            name = "patient_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(440f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 760f)
                verticalLineToRelative(-36f)
                quadToRelative(0f, -21f, 10f, -40f)
                reflectiveQuadToRelative(28f, -30f)
                quadToRelative(45f, -27f, 95.5f, -40.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(56f, 0f, 106.5f, 13.5f)
                reflectiveQuadTo(842f, 654f)
                quadToRelative(18f, 11f, 28f, 30f)
                reflectiveQuadToRelative(10f, 40f)
                verticalLineToRelative(36f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(440f)
                close()
                moveToRelative(46f, -80f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                close()
                moveToRelative(154f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 480f)
                close()
                moveToRelative(0f, -40f)
                close()
                moveToRelative(0f, 280f)
                close()
                moveTo(400f, 560f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 240f)
                close()
                moveTo(444f, 400f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(320f)
                quadToRelative(-14f, 17f, -22.5f, 37f)
                reflectiveQuadTo(444f, 400f)
                close()
            }
        }.build()
        
        return _Patient_list!!
    }

private var _Patient_list: ImageVector? = null

