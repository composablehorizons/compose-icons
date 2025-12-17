package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Filter_alt_off: ImageVector
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
                moveTo(791f, 904f)
                lineTo(560f, 673f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 760f)
                verticalLineToRelative(-247f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(535f, 422f)
                close()
            }
        }.build()
        
        return _Filter_alt_off!!
    }

private var _Filter_alt_off: ImageVector? = null

