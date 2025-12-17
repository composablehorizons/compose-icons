package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Face_down: ImageVector
    get() {
        if (_Face_down != null) return _Face_down!!
        
        _Face_down = ImageVector.Builder(
            name = "face_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(340f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(380f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 480f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(580f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(620f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(580f, 480f)
                close()
                moveToRelative(-420f, -80f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 72f, -28.5f, 132.5f)
                reflectiveQuadTo(694f, 638f)
                quadToRelative(-16f, 14f, -32f, 12f)
                reflectiveQuadToRelative(-27f, -13f)
                quadToRelative(-11f, -11f, -11.5f, -27f)
                reflectiveQuadToRelative(13.5f, -28f)
                quadToRelative(38f, -33f, 60.5f, -80f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, -11f, -1f, -21f)
                reflectiveQuadToRelative(-3f, -21f)
                quadToRelative(-74f, 8f, -143f, -16.5f)
                reflectiveQuadTo(452f, 264f)
                quadToRelative(-38f, 52f, -93.5f, 86f)
                reflectiveQuadTo(240f, 395f)
                quadToRelative(-2f, 56f, 21f, 104.5f)
                reflectiveQuadToRelative(62f, 82.5f)
                quadToRelative(14f, 13f, 13.5f, 28.5f)
                reflectiveQuadTo(325f, 637f)
                quadToRelative(-11f, 11f, -27f, 13f)
                reflectiveQuadToRelative(-32f, -12f)
                quadToRelative(-49f, -45f, -77.5f, -105.5f)
                reflectiveQuadTo(160f, 400f)
                close()
                moveToRelative(360f, 379f)
                lineToRelative(36f, -35f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(612f, 801f)
                lineTo(508f, 904f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(348f, 801f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(405f, 744f)
                lineToRelative(35f, 35f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 613f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 653f)
                verticalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Face_down!!
    }

private var _Face_down: ImageVector? = null

