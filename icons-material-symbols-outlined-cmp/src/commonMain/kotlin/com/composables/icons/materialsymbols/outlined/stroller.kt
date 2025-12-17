package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stroller: ImageVector
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
                moveToRelative(144f, -280f)
                horizontalLineToRelative(216f)
                verticalLineToRelative(-253f)
                lineTo(384f, 600f)
                close()
                moveToRelative(-87f, 80f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                lineToRelative(381f, -447f)
                quadToRelative(20f, -23f, 44.5f, -35f)
                reflectiveQuadToRelative(53.5f, -12f)
                quadToRelative(56f, 0f, 95f, 39f)
                reflectiveQuadToRelative(39f, 95f)
                verticalLineToRelative(26f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-26f)
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
                lineTo(189f, 189f)
                quadToRelative(48f, -34f, 101f, -51.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(45f, 0f, 88.5f, 11f)
                reflectiveQuadToRelative(83.5f, 33f)
                lineTo(384f, 384f)
                close()
                moveToRelative(108f, 89f)
                close()
                moveTo(379f, 266f)
                lineToRelative(55f, -64f)
                quadToRelative(-8f, -1f, -17f, -1.5f)
                reflectiveQuadToRelative(-17f, -0.5f)
                quadToRelative(-20f, 0f, -38.5f, 3f)
                reflectiveQuadToRelative(-37.5f, 8f)
                lineToRelative(55f, 55f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Stroller!!
    }

private var _Stroller: ImageVector? = null

