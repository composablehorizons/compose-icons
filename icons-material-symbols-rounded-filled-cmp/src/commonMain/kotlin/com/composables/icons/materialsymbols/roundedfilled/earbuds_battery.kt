package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Earbuds_battery: ImageVector
    get() {
        if (_Earbuds_battery != null) return _Earbuds_battery!!
        
        _Earbuds_battery = ImageVector.Builder(
            name = "earbuds_battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 280f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineToRelative(40f)
                close()
                moveTo(215f, 720f)
                quadToRelative(-57f, 0f, -96f, -39f)
                reflectiveQuadToRelative(-39f, -96f)
                verticalLineToRelative(-265f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(160f, 400f)
                quadToRelative(-5f, 0f, -10f, -1f)
                reflectiveQuadToRelative(-10f, -3f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 32f, 21.5f, 53.5f)
                reflectiveQuadTo(215f, 660f)
                quadToRelative(32f, 0f, 53.5f, -21.5f)
                reflectiveQuadTo(290f, 585f)
                verticalLineToRelative(-210f)
                quadToRelative(0f, -57f, 39f, -96f)
                reflectiveQuadToRelative(96f, -39f)
                quadToRelative(57f, 0f, 96f, 39f)
                reflectiveQuadToRelative(39f, 96f)
                verticalLineToRelative(265f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(5f, 0f, 10f, 1f)
                reflectiveQuadToRelative(10f, 3f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -32f, -21.5f, -53.5f)
                reflectiveQuadTo(425f, 300f)
                quadToRelative(-32f, 0f, -53.5f, 21.5f)
                reflectiveQuadTo(350f, 375f)
                verticalLineToRelative(210f)
                quadToRelative(0f, 57f, -39f, 96f)
                reflectiveQuadToRelative(-96f, 39f)
                close()
            }
        }.build()
        
        return _Earbuds_battery!!
    }

private var _Earbuds_battery: ImageVector? = null

