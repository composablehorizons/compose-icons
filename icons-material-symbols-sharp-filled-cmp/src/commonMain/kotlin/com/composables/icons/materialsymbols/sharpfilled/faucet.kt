package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Faucet: ImageVector
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
                moveTo(80f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-276f)
                quadToRelative(0f, -69f, 48f, -116.5f)
                reflectiveQuadTo(605f, 80f)
                quadToRelative(46f, 0f, 85f, 24f)
                reflectiveQuadToRelative(60f, 66f)
                lineToRelative(46f, 92f)
                lineToRelative(-72f, 36f)
                lineToRelative(-46f, -92f)
                quadToRelative(-11f, -21f, -31f, -33.5f)
                reflectiveQuadTo(604f, 160f)
                quadToRelative(-35f, 0f, -59.5f, 24.5f)
                reflectiveQuadTo(520f, 244f)
                verticalLineToRelative(276f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Faucet!!
    }

private var _Faucet: ImageVector? = null

