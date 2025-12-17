package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Smb_share: ImageVector
    get() {
        if (_Smb_share != null) return _Smb_share!!
        
        _Smb_share = ImageVector.Builder(
            name = "smb_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(485f, 520f)
                horizontalLineToRelative(163f)
                quadToRelative(26f, 0f, 44f, -18f)
                reflectiveQuadToRelative(18f, -44f)
                quadToRelative(0f, -26f, -18f, -44.5f)
                reflectiveQuadTo(648f, 395f)
                horizontalLineToRelative(-2f)
                quadToRelative(-5f, -32f, -29f, -53.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(-26f, 0f, -47f, 13.5f)
                reflectiveQuadTo(481f, 370f)
                quadToRelative(-30f, 2f, -50.5f, 23.5f)
                reflectiveQuadTo(410f, 445f)
                quadToRelative(0f, 30f, 21.5f, 52.5f)
                reflectiveQuadTo(485f, 520f)
                close()
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(167f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Smb_share!!
    }

private var _Smb_share: ImageVector? = null

