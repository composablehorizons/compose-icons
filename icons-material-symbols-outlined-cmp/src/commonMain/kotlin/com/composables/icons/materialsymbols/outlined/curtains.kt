package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Curtains: ImageVector
    get() {
        if (_Curtains != null) return _Curtains!!
        
        _Curtains = ImageVector.Builder(
            name = "curtains",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(158f)
                quadToRelative(-8f, -70f, -46f, -141.5f)
                reflectiveQuadTo(240f, 526f)
                verticalLineToRelative(234f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(234f)
                quadToRelative(74f, -21f, 112f, -92.5f)
                reflectiveQuadTo(398f, 200f)
                horizontalLineTo(240f)
                close()
                moveToRelative(89f, 280f)
                quadToRelative(68f, 45f, 105f, 123f)
                reflectiveQuadToRelative(44f, 157f)
                horizontalLineToRelative(4f)
                quadToRelative(7f, -79f, 44f, -157f)
                reflectiveQuadToRelative(105f, -123f)
                quadToRelative(-68f, -45f, -105f, -123f)
                reflectiveQuadToRelative(-44f, -157f)
                horizontalLineToRelative(-4f)
                quadToRelative(-7f, 79f, -44f, 157f)
                reflectiveQuadTo(329f, 480f)
                close()
                moveToRelative(391f, -280f)
                horizontalLineTo(562f)
                quadToRelative(8f, 70f, 46f, 141.5f)
                reflectiveQuadTo(720f, 434f)
                verticalLineToRelative(-234f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(-234f)
                quadToRelative(-74f, 21f, -111.5f, 92.5f)
                reflectiveQuadTo(563f, 760f)
                horizontalLineToRelative(157f)
                close()
                moveTo(240f, 200f)
                verticalLineToRelative(234f)
                verticalLineToRelative(-234f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(234f)
                verticalLineToRelative(-234f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(-234f)
                verticalLineToRelative(234f)
                close()
                moveToRelative(-480f, 0f)
                verticalLineToRelative(-234f)
                verticalLineToRelative(234f)
                close()
            }
        }.build()
        
        return _Curtains!!
    }

private var _Curtains: ImageVector? = null

