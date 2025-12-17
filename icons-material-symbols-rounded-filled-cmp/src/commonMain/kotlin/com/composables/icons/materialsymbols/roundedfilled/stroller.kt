package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stroller: ImageVector
    get() {
        if (_Stroller != null) return _Stroller!!
        
        _Stroller = ImageVector.Builder(
            name = "stroller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveToRelative(-400f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 880f)
                close()
                moveToRelative(57f, -200f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                lineToRelative(381f, -447f)
                quadToRelative(20f, -23f, 44.5f, -35f)
                reflectiveQuadToRelative(53.5f, -12f)
                quadToRelative(56f, 0f, 95f, 39f)
                reflectiveQuadToRelative(39f, 95f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 295f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 255f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -23f, -15.5f, -38.5f)
                reflectiveQuadTo(746f, 200f)
                quadToRelative(-11f, 0f, -19.5f, 4f)
                reflectiveQuadTo(711f, 216f)
                lineToRelative(-31f, 35f)
                verticalLineToRelative(349f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineTo(297f)
                close()
                moveToRelative(87f, -296f)
                lineTo(221f, 221f)
                quadToRelative(-13f, -13f, -10.5f, -30f)
                reflectiveQuadToRelative(17.5f, -26f)
                quadToRelative(40f, -22f, 83.5f, -33.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(45f, 0f, 88.5f, 11f)
                reflectiveQuadToRelative(83.5f, 33f)
                lineTo(384f, 384f)
                close()
            }
        }.build()
        
        return _Stroller!!
    }

private var _Stroller: ImageVector? = null

