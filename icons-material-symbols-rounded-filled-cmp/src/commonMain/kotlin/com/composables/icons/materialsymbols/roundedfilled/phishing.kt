package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phishing: ImageVector
    get() {
        if (_Phishing != null) return _Phishing!!
        
        _Phishing = ImageVector.Builder(
            name = "phishing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                verticalLineToRelative(-192f)
                quadToRelative(0f, -14f, 12f, -19f)
                reflectiveQuadToRelative(22f, 5f)
                lineToRelative(138f, 138f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(372f, 588f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(315f, 588f)
                lineToRelative(-35f, -35f)
                verticalLineToRelative(47f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-127f)
                quadToRelative(-36f, -14f, -58f, -44.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -38f, 22f, -68.5f)
                reflectiveQuadToRelative(58f, -44.5f)
                verticalLineToRelative(-127f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(127f)
                quadToRelative(36f, 14f, 58f, 44.5f)
                reflectiveQuadToRelative(22f, 68.5f)
                quadToRelative(0f, 38f, -22f, 69f)
                reflectiveQuadToRelative(-58f, 44f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
            }
        }.build()
        
        return _Phishing!!
    }

private var _Phishing: ImageVector? = null

