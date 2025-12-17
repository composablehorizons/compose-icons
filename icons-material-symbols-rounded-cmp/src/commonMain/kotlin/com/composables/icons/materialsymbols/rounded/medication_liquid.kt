package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Medication_liquid: ImageVector
    get() {
        if (_Medication_liquid != null) return _Medication_liquid!!
        
        _Medication_liquid = ImageVector.Builder(
            name = "medication_liquid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 200f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 120f)
                close()
                moveToRelative(140f, 480f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(360f, 700f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(420f, 640f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(520f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(460f, 480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(360f, 380f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(300f, 440f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 600f)
                horizontalLineToRelative(40f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(600f, -210f)
                quadToRelative(-35f, -17f, -57.5f, -56.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -68f, 34.5f, -114f)
                reflectiveQuadToRelative(85.5f, -46f)
                quadToRelative(51f, 0f, 85.5f, 46f)
                reflectiveQuadTo(920f, 400f)
                quadToRelative(0f, 54f, -22.5f, 93.5f)
                reflectiveQuadTo(840f, 550f)
                verticalLineToRelative(250f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 800f)
                verticalLineToRelative(-250f)
                close()
                moveToRelative(40f, -70f)
                quadToRelative(12f, 0f, 26f, -21.5f)
                reflectiveQuadToRelative(14f, -58.5f)
                quadToRelative(0f, -37f, -14f, -58.5f)
                reflectiveQuadTo(800f, 320f)
                quadToRelative(-12f, 0f, -26f, 21.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(0f, 37f, 14f, 58.5f)
                reflectiveQuadToRelative(26f, 21.5f)
                close()
                moveToRelative(-440f, 60f)
                close()
                moveToRelative(440f, -140f)
                close()
            }
        }.build()
        
        return _Medication_liquid!!
    }

private var _Medication_liquid: ImageVector? = null

