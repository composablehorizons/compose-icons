package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Airplanemode_inactive: ImageVector
    get() {
        if (_Airplanemode_inactive != null) return _Airplanemode_inactive!!
        
        _Airplanemode_inactive = ImageVector.Builder(
            name = "airplanemode_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(340f, 880f)
                verticalLineToRelative(-60f)
                lineToRelative(80f, -60f)
                verticalLineToRelative(-220f)
                lineTo(80f, 640f)
                verticalLineToRelative(-80f)
                lineToRelative(232f, -136f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-252f, -252f)
                verticalLineToRelative(108f)
                lineToRelative(80f, 60f)
                verticalLineToRelative(60f)
                lineToRelative(-140f, -40f)
                close()
                moveToRelative(0f, -760f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(220f)
                lineToRelative(340f, 200f)
                verticalLineToRelative(80f)
                lineToRelative(-178f, -53f)
                lineToRelative(-282f, -281f)
                verticalLineToRelative(-166f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                close()
            }
        }.build()
        
        return _Airplanemode_inactive!!
    }

private var _Airplanemode_inactive: ImageVector? = null

