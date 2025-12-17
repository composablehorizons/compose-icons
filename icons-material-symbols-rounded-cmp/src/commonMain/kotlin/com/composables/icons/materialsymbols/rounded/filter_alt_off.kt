package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Filter_alt_off: ImageVector
    get() {
        if (_Filter_alt_off != null) return _Filter_alt_off!!
        
        _Filter_alt_off = ImageVector.Builder(
            name = "filter_alt_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592f, 479f)
                lineToRelative(-57f, -57f)
                lineToRelative(143f, -182f)
                horizontalLineTo(353f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(487f)
                quadToRelative(25f, 0f, 36f, 22f)
                reflectiveQuadToRelative(-4f, 42f)
                lineTo(592f, 479f)
                close()
                moveToRelative(-32f, 194f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 760f)
                verticalLineToRelative(-247f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 876f)
                lineTo(560f, 673f)
                close()
                moveToRelative(-25f, -251f)
                close()
            }
        }.build()
        
        return _Filter_alt_off!!
    }

private var _Filter_alt_off: ImageVector? = null

