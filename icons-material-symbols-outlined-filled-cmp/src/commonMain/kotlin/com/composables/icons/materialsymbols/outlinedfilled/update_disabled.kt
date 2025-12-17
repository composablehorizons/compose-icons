package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Update_disabled: ImageVector
    get() {
        if (_Update_disabled != null) return _Update_disabled!!
        
        _Update_disabled = ImageVector.Builder(
            name = "update_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(671f, 785f)
                quadToRelative(-42f, 26f, -90f, 40.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -53f, 14.5f, -101f)
                reflectiveQuadToRelative(40.5f, -90f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 760f)
                quadToRelative(36f, 0f, 69.5f, -8.5f)
                reflectiveQuadTo(613f, 727f)
                lineTo(233f, 347f)
                quadToRelative(-16f, 30f, -24.5f, 63.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(120f, -360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(110f)
                quadToRelative(-41f, -56f, -101f, -88f)
                reflectiveQuadToRelative(-129f, -32f)
                quadToRelative(-36f, 0f, -69.5f, 8.5f)
                reflectiveQuadTo(347f, 233f)
                lineToRelative(-58f, -58f)
                quadToRelative(42f, -26f, 90f, -40.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 254f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveToRelative(-80f, 6f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(126f)
                close()
                moveToRelative(265f, 265f)
                lineToRelative(-58f, -58f)
                quadToRelative(11f, -22f, 18.5f, -45f)
                reflectiveQuadToRelative(10.5f, -48f)
                horizontalLineToRelative(82f)
                quadToRelative(-5f, 42f, -18.5f, 80f)
                reflectiveQuadTo(785f, 671f)
                close()
            }
        }.build()
        
        return _Update_disabled!!
    }

private var _Update_disabled: ImageVector? = null

