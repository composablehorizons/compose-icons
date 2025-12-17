package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Train: ImageVector
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
                moveToRelative(80f, -220f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(280f, 0f)
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
            }
        }.build()
        
        return _Train!!
    }

private var _Train: ImageVector? = null

