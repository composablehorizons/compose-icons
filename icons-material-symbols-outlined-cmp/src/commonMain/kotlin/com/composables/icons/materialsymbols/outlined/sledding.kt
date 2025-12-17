package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sledding: ImageVector
    get() {
        if (_Sledding != null) return _Sledding!!
        
        _Sledding = ImageVector.Builder(
            name = "sledding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(765f, 920f)
                quadToRelative(-19f, 0f, -31.5f, -2f)
                reflectiveQuadTo(710f, 912f)
                lineTo(40f, 694f)
                lineToRelative(18f, -57f)
                lineToRelative(158f, 51f)
                lineToRelative(18f, -57f)
                lineToRelative(-157f, -51f)
                lineToRelative(19f, -57f)
                lineToRelative(64f, 21f)
                verticalLineToRelative(-164f)
                lineToRelative(219f, -94f)
                quadToRelative(8f, -4f, 15.5f, -5f)
                reflectiveQuadToRelative(16.5f, -1f)
                quadToRelative(34f, 0f, 55f, 29.5f)
                reflectiveQuadToRelative(10f, 64.5f)
                lineToRelative(-42f, 130f)
                lineToRelative(86f, -14f)
                quadToRelative(27f, -5f, 50.5f, 8f)
                reflectiveQuadToRelative(35.5f, 38f)
                lineToRelative(83f, 180f)
                lineToRelative(77f, 25f)
                lineToRelative(-18f, 57f)
                lineToRelative(-133f, -43f)
                lineToRelative(-19f, 57f)
                lineToRelative(133f, 43f)
                quadToRelative(8f, 2f, 16.5f, 3.5f)
                reflectiveQuadTo(765f, 860f)
                quadToRelative(36f, 0f, 65.5f, -29.5f)
                reflectiveQuadTo(860f, 765f)
                quadToRelative(0f, -34f, -16.5f, -60f)
                reflectiveQuadTo(790f, 665f)
                lineToRelative(19f, -57f)
                quadToRelative(52f, 17f, 81.5f, 59f)
                reflectiveQuadToRelative(29.5f, 98f)
                quadToRelative(0f, 62f, -46.5f, 108.5f)
                reflectiveQuadTo(765f, 920f)
                close()
                moveTo(539f, 794f)
                lineToRelative(19f, -58f)
                lineToRelative(-267f, -86f)
                lineToRelative(-18f, 57f)
                lineToRelative(266f, 87f)
                close()
                moveToRelative(46f, -112f)
                lineToRelative(-47f, -102f)
                lineToRelative(-159f, 35f)
                lineToRelative(206f, 67f)
                close()
                moveToRelative(-305f, -99f)
                quadToRelative(-6f, -13f, -7.5f, -27.5f)
                reflectiveQuadTo(276f, 527f)
                lineToRelative(41f, -127f)
                lineToRelative(-77f, 33f)
                verticalLineToRelative(137f)
                lineToRelative(40f, 13f)
                close()
                moveToRelative(200f, -323f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 260f)
                close()
            }
        }.build()
        
        return _Sledding!!
    }

private var _Sledding: ImageVector? = null

