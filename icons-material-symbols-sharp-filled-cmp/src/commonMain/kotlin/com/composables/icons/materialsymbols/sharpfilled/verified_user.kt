package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Verified_user: ImageVector
    get() {
        if (_Verified_user != null) return _Verified_user!!
        
        _Verified_user = ImageVector.Builder(
            name = "verified_user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 622f)
                lineToRelative(226f, -226f)
                lineToRelative(-57f, -57f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                lineToRelative(141f, 141f)
                close()
                moveToRelative(42f, 258f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Verified_user!!
    }

private var _Verified_user: ImageVector? = null

