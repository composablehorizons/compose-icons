package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(480f, 440f)
                lineTo(160f, 240f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveTo(640f, 740f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(308f)
                quadToRelative(-28f, -14f, -58f, -21f)
                reflectiveQuadToRelative(-62f, -7f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(0f, 20f, 3f, 40f)
                reflectiveQuadToRelative(9f, 40f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null

