package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Currency_rupee: ImageVector
    get() {
        if (_Currency_rupee != null) return _Currency_rupee!!
        
        _Currency_rupee = ImageVector.Builder(
            name = "currency_rupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(537f, 828f)
                lineTo(291f, 572f)
                quadToRelative(-5f, -5f, -8f, -12.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-24f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 480f)
                horizontalLineToRelative(100f)
                quadToRelative(53f, 0f, 91.5f, -34.5f)
                reflectiveQuadTo(558f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 280f)
                horizontalLineToRelative(266f)
                quadToRelative(-17f, -35f, -50.5f, -57.5f)
                reflectiveQuadTo(420f, 200f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 200f)
                horizontalLineToRelative(-90f)
                quadToRelative(14f, 17f, 25f, 37f)
                reflectiveQuadToRelative(17f, 43f)
                horizontalLineToRelative(48f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineToRelative(-41f)
                quadToRelative(-8f, 85f, -70f, 142.5f)
                reflectiveQuadTo(420f, 560f)
                horizontalLineToRelative(-29f)
                lineToRelative(204f, 212f)
                quadToRelative(18f, 19f, 7.5f, 43.5f)
                reflectiveQuadTo(566f, 840f)
                quadToRelative(-8f, 0f, -15.5f, -3f)
                reflectiveQuadToRelative(-13.5f, -9f)
                close()
            }
        }.build()
        
        return _Currency_rupee!!
    }

private var _Currency_rupee: ImageVector? = null

