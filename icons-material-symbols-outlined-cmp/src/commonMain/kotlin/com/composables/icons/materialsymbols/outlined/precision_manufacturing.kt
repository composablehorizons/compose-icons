package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Precision_manufacturing: ImageVector
    get() {
        if (_Precision_manufacturing != null) return _Precision_manufacturing!!
        
        _Precision_manufacturing = ImageVector.Builder(
            name = "precision_manufacturing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(124f)
                lineTo(181f, 386f)
                quadToRelative(-27f, -15f, -44.5f, -44f)
                reflectiveQuadTo(119f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(351f, 240f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(519f, 160f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(68f, -64f)
                quadToRelative(9f, -9f, 21.5f, -11.5f)
                reflectiveQuadTo(665f, 104f)
                lineToRelative(156f, 72f)
                quadToRelative(12f, 6f, 16.5f, 17.5f)
                reflectiveQuadTo(837f, 216f)
                quadToRelative(-6f, 12f, -17.5f, 15.5f)
                reflectiveQuadTo(797f, 230f)
                lineToRelative(-144f, -66f)
                lineToRelative(-94f, 88f)
                verticalLineToRelative(56f)
                lineToRelative(94f, 86f)
                lineToRelative(144f, -66f)
                quadToRelative(11f, -5f, 23f, -1f)
                reflectiveQuadToRelative(17f, 15f)
                quadToRelative(6f, 12f, 1f, 23f)
                reflectiveQuadToRelative(-17f, 17f)
                lineToRelative(-156f, 74f)
                quadToRelative(-12f, 6f, -24.5f, 3.5f)
                reflectiveQuadTo(619f, 448f)
                lineToRelative(-68f, -64f)
                quadToRelative(-6f, 6f, -14.5f, 11f)
                reflectiveQuadToRelative(-17.5f, 5f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(479f, 360f)
                verticalLineToRelative(-40f)
                horizontalLineTo(351f)
                quadToRelative(-3f, 8f, -6.5f, 15f)
                reflectiveQuadToRelative(-9.5f, 15f)
                lineToRelative(200f, 370f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(120f)
                horizontalLineTo(159f)
                close()
                moveToRelative(80f, -520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(279f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(239f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(199f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(239f, 320f)
                close()
                moveToRelative(126f, 400f)
                horizontalLineToRelative(78f)
                lineTo(271f, 400f)
                horizontalLineToRelative(-4f)
                lineToRelative(98f, 320f)
                close()
                moveToRelative(78f, 0f)
                close()
            }
        }.build()
        
        return _Precision_manufacturing!!
    }

private var _Precision_manufacturing: ImageVector? = null

