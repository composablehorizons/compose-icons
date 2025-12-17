package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Earbuds_battery: ImageVector
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
                moveTo(640f, 720f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-425f, 0f)
                quadToRelative(-57f, 0f, -96f, -39f)
                reflectiveQuadToRelative(-39f, -96f)
                verticalLineToRelative(-345f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(140f)
                verticalLineToRelative(185f)
                quadToRelative(0f, 32f, 21.5f, 53.5f)
                reflectiveQuadTo(215f, 660f)
                quadToRelative(32f, 0f, 53.5f, -21.5f)
                reflectiveQuadTo(290f, 585f)
                verticalLineToRelative(-210f)
                quadToRelative(0f, -57f, 39f, -96f)
                reflectiveQuadToRelative(96f, -39f)
                quadToRelative(57f, 0f, 96f, 39f)
                reflectiveQuadToRelative(39f, 96f)
                verticalLineToRelative(345f)
                horizontalLineTo(400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-185f)
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

