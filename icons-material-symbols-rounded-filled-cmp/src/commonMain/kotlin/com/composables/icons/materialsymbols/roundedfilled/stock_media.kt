package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stock_media: ImageVector
    get() {
        if (_Stock_media != null) return _Stock_media!!
        
        _Stock_media = ImageVector.Builder(
            name = "stock_media",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 520f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 600f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -150f)
                lineToRelative(-40f, -55f)
                quadToRelative(-3f, -4f, -8f, -4f)
                reflectiveQuadToRelative(-8f, 4f)
                lineToRelative(-52f, 69f)
                quadToRelative(-4f, 5f, -1f, 10.5f)
                reflectiveQuadToRelative(9f, 5.5f)
                horizontalLineToRelative(240f)
                quadToRelative(6f, 0f, 9f, -5.5f)
                reflectiveQuadToRelative(-1f, -10.5f)
                lineToRelative(-72f, -94f)
                quadToRelative(-3f, -4f, -8f, -4f)
                reflectiveQuadToRelative(-8f, 4f)
                lineToRelative(-60f, 80f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 20.5f, 2f)
                reflectiveQuadToRelative(19.5f, 5f)
                verticalLineToRelative(-167f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Stock_media!!
    }

private var _Stock_media: ImageVector? = null

