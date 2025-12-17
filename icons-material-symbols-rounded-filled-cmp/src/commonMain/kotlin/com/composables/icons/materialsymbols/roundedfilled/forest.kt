package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(73f)
                quadToRelative(-24f, 0f, -35f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                lineToRelative(114f, -178f)
                quadToRelative(-23f, 0f, -34.5f, -20.5f)
                reflectiveQuadTo(122f, 419f)
                lineToRelative(205f, -292f)
                quadToRelative(6f, -8f, 15f, -12.5f)
                reflectiveQuadToRelative(18f, -4.5f)
                quadToRelative(9f, 0f, 18f, 4.5f)
                reflectiveQuadToRelative(15f, 12.5f)
                lineToRelative(205f, 292f)
                quadToRelative(14f, 20f, 2.5f, 40.5f)
                reflectiveQuadTo(566f, 480f)
                lineToRelative(115f, 178f)
                quadToRelative(13f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-35f, 21f)
                horizontalLineTo(440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                close()
                moveToRelative(490f, -120f)
                lineTo(640f, 520f)
                quadToRelative(24f, 0f, 35.5f, -21.5f)
                reflectiveQuadTo(673f, 457f)
                lineTo(505f, 217f)
                lineToRelative(62f, -90f)
                quadToRelative(6f, -8f, 15f, -12.5f)
                reflectiveQuadToRelative(18f, -4.5f)
                quadToRelative(9f, 0f, 18f, 4.5f)
                reflectiveQuadToRelative(15f, 12.5f)
                lineToRelative(205f, 292f)
                quadToRelative(14f, 20f, 2.5f, 40.5f)
                reflectiveQuadTo(806f, 480f)
                lineToRelative(114f, 178f)
                quadToRelative(13f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-35f, 21f)
                horizontalLineTo(770f)
                close()
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

