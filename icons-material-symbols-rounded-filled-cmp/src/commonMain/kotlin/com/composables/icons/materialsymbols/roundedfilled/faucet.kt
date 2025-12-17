package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Faucet: ImageVector
    get() {
        if (_Faucet != null) return _Faucet!!
        
        _Faucet = ImageVector.Builder(
            name = "faucet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 400f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-276f)
                quadToRelative(0f, -69f, 48f, -116.5f)
                reflectiveQuadTo(605f, 80f)
                quadToRelative(46f, 0f, 85f, 24f)
                reflectiveQuadToRelative(60f, 66f)
                lineToRelative(28f, 56f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(706f, 262f)
                lineToRelative(-28f, -56f)
                quadToRelative(-11f, -21f, -31f, -33.5f)
                reflectiveQuadTo(604f, 160f)
                quadToRelative(-35f, 0f, -59.5f, 24.5f)
                reflectiveQuadTo(520f, 244f)
                verticalLineToRelative(276f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 400f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 520f)
                close()
                moveToRelative(120f, 320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Faucet!!
    }

private var _Faucet: ImageVector? = null

