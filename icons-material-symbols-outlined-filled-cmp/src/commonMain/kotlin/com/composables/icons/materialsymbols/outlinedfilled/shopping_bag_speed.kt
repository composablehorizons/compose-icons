package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shopping_bag_speed: ImageVector
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
                moveTo(231f, 880f)
                quadToRelative(-32f, 0f, -53.5f, -24f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(163f)
                lineToRelative(40f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(60f, -240f)
                horizontalLineTo(210f)
                lineToRelative(11f, -90f)
                quadToRelative(4f, -30f, 27f, -50f)
                reflectiveQuadToRelative(53f, -20f)
                horizontalLineToRelative(79f)
                quadToRelative(8f, -75f, 51.5f, -117.5f)
                reflectiveQuadTo(550f, 80f)
                quadToRelative(64f, 0f, 106.5f, 47.5f)
                reflectiveQuadTo(698f, 240f)
                horizontalLineToRelative(102f)
                quadToRelative(36f, 0f, 60f, 27f)
                reflectiveQuadToRelative(19f, 63f)
                lineToRelative(-60f, 480f)
                quadToRelative(-4f, 30f, -26.5f, 50f)
                reflectiveQuadTo(740f, 880f)
                horizontalLineTo(231f)
                close()
                moveTo(40f, 720f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(220f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -160f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(260f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(340f, -320f)
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

