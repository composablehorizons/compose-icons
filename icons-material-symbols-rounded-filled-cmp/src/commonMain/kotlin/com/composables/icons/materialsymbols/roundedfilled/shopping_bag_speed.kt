package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shopping_bag_speed: ImageVector
    get() {
        if (_Shopping_bag_speed != null) return _Shopping_bag_speed!!
        
        _Shopping_bag_speed = ImageVector.Builder(
            name = "shopping_bag_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(230f, 720f)
                horizontalLineTo(90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(50f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(90f, 640f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(270f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(230f, 720f)
                close()
                moveToRelative(120f, -160f)
                horizontalLineTo(170f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(130f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(170f, 480f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(390f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(350f, 560f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(70f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -11f, -2f, -21f)
                reflectiveQuadToRelative(-5f, -19f)
                horizontalLineToRelative(7f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -51f, -35f, -85.5f)
                reflectiveQuadTo(350f, 400f)
                horizontalLineTo(210f)
                lineToRelative(10f, -80f)
                quadToRelative(4f, -35f, 26f, -57.5f)
                reflectiveQuadToRelative(54f, -22.5f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, -75f, 51.5f, -117.5f)
                reflectiveQuadTo(550f, 80f)
                quadToRelative(64f, 0f, 106.5f, 47.5f)
                reflectiveQuadTo(698f, 240f)
                horizontalLineToRelative(102f)
                quadToRelative(36f, 1f, 60f, 28f)
                reflectiveQuadToRelative(19f, 63f)
                lineToRelative(-60f, 480f)
                quadToRelative(-4f, 30f, -26.5f, 49.5f)
                reflectiveQuadTo(740f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(220f, -640f)
                horizontalLineToRelative(159f)
                quadToRelative(1f, -33f, -22.5f, -56.5f)
                reflectiveQuadTo(540f, 160f)
                quadToRelative(-35f, 0f, -55.5f, 21.5f)
                reflectiveQuadTo(460f, 240f)
                close()
            }
        }.build()
        
        return _Shopping_bag_speed!!
    }

private var _Shopping_bag_speed: ImageVector? = null

