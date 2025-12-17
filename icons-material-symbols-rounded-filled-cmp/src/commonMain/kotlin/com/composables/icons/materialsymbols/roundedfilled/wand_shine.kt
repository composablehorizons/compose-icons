package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wand_shine: ImageVector
    get() {
        if (_Wand_shine != null) return _Wand_shine!!
        
        _Wand_shine = ImageVector.Builder(
            name = "wand_shine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 160f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(63f, 64f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(303f, 280f)
                lineToRelative(-64f, -63f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                close()
                moveToRelative(280f, -116f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 84f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 214f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 174f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 44f)
                close()
                moveToRelative(160f, 556f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(63f, 64f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(743f, 720f)
                lineToRelative(-64f, -63f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 600f)
                close()
                moveToRelative(120f, -440f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(800f, 217f)
                lineToRelative(-64f, 64f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(680f, 280f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(63f, -63f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                close()
                moveToRelative(116f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(876f, 480f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(746f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(786f, 400f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(916f, 440f)
                close()
                moveTo(205f, 868f)
                lineTo(92f, 755f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(363f, -364f)
                quadToRelative(35f, -35f, 85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(35f, 35f, 35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                lineTo(261f, 868f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(279f, -335f)
                lineToRelative(84f, -85f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineToRelative(-85f, 85f)
                lineToRelative(57f, 56f)
                close()
            }
        }.build()
        
        return _Wand_shine!!
    }

private var _Wand_shine: ImageVector? = null

