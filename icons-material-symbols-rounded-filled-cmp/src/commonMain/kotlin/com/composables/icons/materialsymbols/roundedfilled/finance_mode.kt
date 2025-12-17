package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Finance_mode: ImageVector
    get() {
        if (_Finance_mode != null) return _Finance_mode!!
        
        _Finance_mode = ImageVector.Builder(
            name = "finance_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 470f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(440f, 300f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(380f, 530f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 470f)
                close()
                moveToRelative(200f, -9f)
                verticalLineToRelative(-321f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 140f)
                verticalLineToRelative(321f)
                quadToRelative(0f, 30f, -18.5f, 45f)
                reflectiveQuadTo(580f, 521f)
                quadToRelative(-23f, 0f, -41.5f, -15f)
                reflectiveQuadTo(520f, 461f)
                close()
                moveTo(120f, 599f)
                verticalLineToRelative(-139f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(180f, 400f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 460f)
                verticalLineToRelative(139f)
                quadToRelative(0f, 30f, -18.5f, 45f)
                reflectiveQuadTo(180f, 659f)
                quadToRelative(-23f, 0f, -41.5f, -15f)
                reflectiveQuadTo(120f, 599f)
                close()
                moveToRelative(96f, 243f)
                quadToRelative(-26f, 0f, -36.5f, -24.5f)
                reflectiveQuadTo(188f, 774f)
                lineToRelative(164f, -164f)
                quadToRelative(11f, -11f, 26.5f, -12f)
                reflectiveQuadToRelative(27.5f, 10f)
                lineToRelative(114f, 98f)
                lineToRelative(224f, -224f)
                horizontalLineToRelative(-24f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 442f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 402f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 442f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 602f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 562f)
                verticalLineToRelative(-24f)
                lineTo(550f, 788f)
                quadToRelative(-11f, 11f, -26.5f, 12f)
                reflectiveQuadTo(496f, 790f)
                lineToRelative(-114f, -98f)
                lineToRelative(-138f, 138f)
                quadToRelative(-5f, 5f, -12.5f, 8.5f)
                reflectiveQuadTo(216f, 842f)
                close()
            }
        }.build()
        
        return _Finance_mode!!
    }

private var _Finance_mode: ImageVector? = null

