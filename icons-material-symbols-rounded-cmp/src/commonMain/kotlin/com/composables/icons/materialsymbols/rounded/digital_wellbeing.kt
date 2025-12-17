package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Digital_wellbeing: ImageVector
    get() {
        if (_Digital_wellbeing != null) return _Digital_wellbeing!!
        
        _Digital_wellbeing = ImageVector.Builder(
            name = "digital_wellbeing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(-57f, 543f)
                lineTo(240f, 640f)
                quadToRelative(-20f, -20f, -30f, -45f)
                reflectiveQuadToRelative(-10f, -55f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(29f, 0f, 53.5f, 11f)
                reflectiveQuadToRelative(44.5f, 31f)
                lineToRelative(42f, 42f)
                lineToRelative(42f, -42f)
                quadToRelative(20f, -20f, 44.5f, -31f)
                reflectiveQuadToRelative(53.5f, -11f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(760f, 540f)
                quadToRelative(0f, 30f, -10f, 55f)
                reflectiveQuadToRelative(-30f, 45f)
                lineTo(537f, 823f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                close()
                moveToRelative(57f, -57f)
                lineToRelative(182f, -182f)
                quadToRelative(9f, -9f, 13.5f, -20.5f)
                reflectiveQuadTo(680f, 540f)
                quadToRelative(0f, -24f, -17f, -42f)
                reflectiveQuadToRelative(-43f, -18f)
                quadToRelative(-12f, 0f, -21.5f, 3.5f)
                reflectiveQuadTo(580f, 496f)
                lineTo(480f, 596f)
                lineTo(380f, 496f)
                quadToRelative(-6f, -6f, -15.5f, -11f)
                reflectiveQuadToRelative(-24.5f, -5f)
                quadToRelative(-26f, 0f, -43f, 18f)
                reflectiveQuadToRelative(-17f, 42f)
                quadToRelative(0f, 12f, 5f, 22.5f)
                reflectiveQuadToRelative(13f, 19.5f)
                lineToRelative(182f, 184f)
                close()
                moveToRelative(0f, -546f)
                close()
                moveToRelative(0f, 403f)
                close()
            }
        }.build()
        
        return _Digital_wellbeing!!
    }

private var _Digital_wellbeing: ImageVector? = null

