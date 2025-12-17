package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Smb_share: ImageVector
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
                moveTo(40f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(280f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(520f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Smb_share!!
    }

private var _Smb_share: ImageVector? = null

