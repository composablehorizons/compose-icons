package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Print_disabled: ImageVector
    get() {
        if (_Print_disabled != null) return _Print_disabled!!
        
        _Print_disabled = ImageVector.Builder(
            name = "print_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineToRelative(-71f, -71f)
                verticalLineToRelative(6f)
                horizontalLineTo(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(6f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(320f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-6f)
                lineTo(486f, 600f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(474f, -80f)
                lineTo(434f, 320f)
                horizontalLineToRelative(326f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-86f)
                close()
                moveTo(640f, 280f)
                horizontalLineTo(394f)
                lineTo(234f, 120f)
                horizontalLineToRelative(486f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 220f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 460f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 460f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 500f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

