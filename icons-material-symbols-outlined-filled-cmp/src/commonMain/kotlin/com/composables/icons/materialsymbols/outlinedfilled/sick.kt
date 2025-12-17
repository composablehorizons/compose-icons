package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sick: ImageVector
    get() {
        if (_Sick != null) return _Sick!!
        
        _Sick = ImageVector.Builder(
            name = "sick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 464f)
                lineToRelative(84f, -84f)
                lineToRelative(-85f, -85f)
                lineToRelative(-42f, 42f)
                lineToRelative(43f, 42f)
                lineToRelative(-43f, 43f)
                lineToRelative(43f, 42f)
                close()
                moveToRelative(504f, -104f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(0f, -27f, 15f, -57.5f)
                reflectiveQuadTo(840f, 120f)
                quadToRelative(50f, 72f, 65f, 102.5f)
                reflectiveQuadToRelative(15f, 57.5f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 360f)
                close()
                moveTo(625f, 465f)
                lineToRelative(43f, -43f)
                lineToRelative(-43f, -43f)
                lineToRelative(42f, -42f)
                lineToRelative(-42f, -42f)
                lineToRelative(-85f, 85f)
                lineToRelative(85f, 85f)
                close()
                moveToRelative(-145f, 75f)
                quadToRelative(-26f, 0f, -50.5f, 6f)
                reflectiveQuadTo(383f, 563f)
                lineToRelative(-143f, -83f)
                quadToRelative(0f, -16f, -8f, -30f)
                reflectiveQuadToRelative(-22f, -22f)
                quadToRelative(-22f, -12f, -45.5f, -5.5f)
                reflectiveQuadTo(128f, 450f)
                quadToRelative(-12f, 22f, -5.5f, 45.5f)
                reflectiveQuadTo(150f, 532f)
                quadToRelative(14f, 8f, 30f, 8f)
                reflectiveQuadToRelative(30f, -8f)
                lineToRelative(119f, 69f)
                quadToRelative(-17f, 17f, -30.5f, 36.5f)
                reflectiveQuadTo(276f, 680f)
                horizontalLineToRelative(66f)
                quadToRelative(21f, -36f, 57f, -58f)
                reflectiveQuadToRelative(81f, -22f)
                quadToRelative(45f, 0f, 81f, 22f)
                reflectiveQuadToRelative(57f, 58f)
                horizontalLineToRelative(66f)
                quadToRelative(-24f, -62f, -78.5f, -101f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, 340f)
                quadToRelative(-84f, 0f, -157f, -31.5f)
                reflectiveQuadTo(196f, 763f)
                quadToRelative(-54f, -54f, -85f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31f, -156f)
                reflectiveQuadToRelative(85f, -127f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(74f, 0f, 139.5f, 24f)
                reflectiveQuadTo(737f, 172f)
                quadToRelative(-14f, 26f, -25.5f, 52f)
                reflectiveQuadTo(700f, 280f)
                quadToRelative(0f, 59f, 41f, 99.5f)
                reflectiveQuadToRelative(99f, 40.5f)
                quadToRelative(9f, 0f, 18f, -1f)
                reflectiveQuadToRelative(17f, -3f)
                quadToRelative(2f, 16f, 3.5f, 31.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sick!!
    }

private var _Sick: ImageVector? = null

