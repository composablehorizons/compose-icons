package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Repeat_one: ImageVector
    get() {
        if (_Repeat_one != null) return _Repeat_one!!
        
        _Repeat_one = ImageVector.Builder(
            name = "repeat_one",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 420f)
                horizontalLineToRelative(-30f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(400f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(430f, 360f)
                horizontalLineToRelative(50f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(490f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(460f, 570f)
                verticalLineToRelative(-150f)
                close()
                moveTo(274f, 760f)
                lineToRelative(34f, 34f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(308f, 850f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(251f, 851f)
                lineTo(148f, 748f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(103f, -103f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(308f, 590f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(308f, 646f)
                lineToRelative(-34f, 34f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                horizontalLineTo(274f)
                close()
                moveToRelative(412f, -480f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 400f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 200f)
                horizontalLineToRelative(406f)
                lineToRelative(-34f, -34f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(709f, 109f)
                lineToRelative(103f, 103f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(709f, 371f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(652f, 370f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(34f, -34f)
                close()
            }
        }.build()
        
        return _Repeat_one!!
    }

private var _Repeat_one: ImageVector? = null

