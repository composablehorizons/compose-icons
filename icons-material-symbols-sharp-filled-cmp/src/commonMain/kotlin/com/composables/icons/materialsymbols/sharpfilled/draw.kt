package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Draw: ImageVector
    get() {
        if (_Draw != null) return _Draw!!
        
        _Draw = ImageVector.Builder(
            name = "draw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-170f)
                lineToRelative(584f, -582f)
                lineToRelative(168f, 168f)
                lineToRelative(-582f, 584f)
                horizontalLineTo(160f)
                close()
                moveToRelative(586f, -529f)
                lineToRelative(54f, -54f)
                lineToRelative(-57f, -57f)
                lineToRelative(-54f, 54f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(14f, 389f)
                quadToRelative(0f, -36f, -19f, -62f)
                reflectiveQuadToRelative(-51f, -45f)
                lineToRelative(-59f, 59f)
                quadToRelative(23f, 10f, 36f, 22f)
                reflectiveQuadToRelative(13f, 26f)
                quadToRelative(0f, 23f, -41.5f, 41.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(80f)
                quadToRelative(104f, 0f, 172f, -37f)
                reflectiveQuadToRelative(68f, -103f)
                close()
                moveTo(183f, 534f)
                lineToRelative(60f, -60f)
                quadToRelative(-21f, -8f, -32f, -17f)
                reflectiveQuadToRelative(-11f, -17f)
                quadToRelative(0f, -12f, 18.5f, -24.5f)
                reflectiveQuadTo(294f, 379f)
                quadToRelative(81f, -35f, 113.5f, -65.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, -57f, -39.5f, -88.5f)
                reflectiveQuadTo(290f, 120f)
                quadToRelative(-44f, 0f, -88.5f, 22f)
                reflectiveQuadTo(125f, 200f)
                lineToRelative(55f, 53f)
                quadToRelative(25f, -25f, 54.5f, -39f)
                reflectiveQuadToRelative(55.5f, -14f)
                quadToRelative(34f, 0f, 52f, 10f)
                reflectiveQuadToRelative(18f, 30f)
                quadToRelative(0f, 14f, -16.5f, 25.5f)
                reflectiveQuadTo(262f, 306f)
                quadToRelative(-82f, 38f, -112f, 66f)
                reflectiveQuadToRelative(-30f, 68f)
                quadToRelative(0f, 29f, 15.5f, 52.5f)
                reflectiveQuadTo(183f, 534f)
                close()
            }
        }.build()
        
        return _Draw!!
    }

private var _Draw: ImageVector? = null

