package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Train: ImageVector
    get() {
        if (_Train != null) return _Train!!
        
        _Train = ImageVector.Builder(
            name = "train",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 620f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -53f, 27.5f, -84.5f)
                reflectiveQuadToRelative(72.5f, -48f)
                quadToRelative(45f, -16.5f, 102.5f, -22f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(66f, 0f, 124.5f, 5.5f)
                reflectiveQuadToRelative(102f, 22f)
                quadToRelative(43.5f, 16.5f, 68.5f, 48f)
                reflectiveQuadToRelative(25f, 84.5f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(660f, 760f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-80f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(400f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-20f)
                lineToRelative(60f, -60f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(160f, 620f)
                close()
                moveToRelative(320f, -460f)
                quadToRelative(-106f, 0f, -155f, 12.5f)
                reflectiveQuadTo(258f, 200f)
                horizontalLineToRelative(448f)
                quadToRelative(-15f, -17f, -64.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(420f, 80f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-140f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveTo(340f, 640f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(-320f, 40f)
                horizontalLineToRelative(360f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(180f, -480f)
                horizontalLineToRelative(226f)
                horizontalLineToRelative(-448f)
                horizontalLineToRelative(222f)
                close()
            }
        }.build()
        
        return _Train!!
    }

private var _Train: ImageVector? = null

