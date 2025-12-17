package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Face_right: ImageVector
    get() {
        if (_Face_right != null) return _Face_right!!
        
        _Face_right = ImageVector.Builder(
            name = "face_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 480f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 480f)
                close()
                moveToRelative(380f, -80f)
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
                quadToRelative(-2f, 56f, 21f, 104f)
                reflectiveQuadToRelative(62f, 82f)
                quadToRelative(14f, 13f, 13.5f, 29f)
                reflectiveQuadTo(325f, 637f)
                quadToRelative(-11f, 11f, -27f, 13f)
                reflectiveQuadToRelative(-32f, -12f)
                quadToRelative(-49f, -45f, -77.5f, -105.5f)
                reflectiveQuadTo(160f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                close()
                moveTo(487f, 800f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 720f)
                horizontalLineToRelative(127f)
                lineToRelative(-35f, -35f)
                quadToRelative(-11f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(452f, 628f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(508f, 892f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(452f, 835f)
                lineToRelative(35f, -35f)
                close()
            }
        }.build()
        
        return _Face_right!!
    }

private var _Face_right: ImageVector? = null

