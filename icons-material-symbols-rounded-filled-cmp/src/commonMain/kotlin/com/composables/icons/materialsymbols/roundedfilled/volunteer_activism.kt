package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(535f, 873f)
                quadToRelative(11f, 3f, 25.5f, 2.5f)
                reflectiveQuadTo(585f, 871f)
                lineToRelative(295f, -111f)
                quadToRelative(0f, -34f, -24f, -57f)
                reflectiveQuadToRelative(-56f, -23f)
                horizontalLineTo(526f)
                quadToRelative(-3f, 0f, -7f, -0.5f)
                reflectiveQuadToRelative(-6f, -1.5f)
                lineToRelative(-59f, -21f)
                quadToRelative(-8f, -3f, -11f, -10f)
                reflectiveQuadToRelative(-1f, -15f)
                quadToRelative(2f, -7f, 10f, -11f)
                reflectiveQuadToRelative(16f, -1f)
                lineToRelative(45f, 17f)
                quadToRelative(4f, 2f, 6.5f, 2.5f)
                reflectiveQuadToRelative(7.5f, 0.5f)
                horizontalLineToRelative(105f)
                quadToRelative(19f, 0f, 33.5f, -13f)
                reflectiveQuadToRelative(14.5f, -34f)
                quadToRelative(0f, -14f, -8.5f, -27f)
                reflectiveQuadTo(649f, 548f)
                lineTo(372f, 445f)
                quadToRelative(-7f, -2f, -14f, -3.5f)
                reflectiveQuadToRelative(-14f, -1.5f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(361f)
                lineToRelative(255f, 72f)
                close()
                moveTo(40f, 800f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(120f, 880f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(40f, 520f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(600f, -312f)
                quadToRelative(-15f, 0f, -29.5f, -5.5f)
                reflectiveQuadTo(584f, 466f)
                lineTo(474f, 358f)
                quadToRelative(-31f, -30f, -52.5f, -66.5f)
                reflectiveQuadTo(400f, 212f)
                quadToRelative(0f, -55f, 38.5f, -93.5f)
                reflectiveQuadTo(532f, 80f)
                quadToRelative(32f, 0f, 60f, 13.5f)
                reflectiveQuadToRelative(48f, 36.5f)
                quadToRelative(20f, -23f, 48f, -36.5f)
                reflectiveQuadToRelative(60f, -13.5f)
                quadToRelative(55f, 0f, 93.5f, 38.5f)
                reflectiveQuadTo(880f, 212f)
                quadToRelative(0f, 43f, -21f, 79.5f)
                reflectiveQuadTo(807f, 358f)
                lineTo(696f, 466f)
                quadToRelative(-12f, 11f, -26.5f, 16.5f)
                reflectiveQuadTo(640f, 488f)
                close()
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null

