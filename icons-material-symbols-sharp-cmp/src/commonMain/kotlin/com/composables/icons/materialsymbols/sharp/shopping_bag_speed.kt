package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shopping_bag_speed: ImageVector
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
                moveToRelative(623f, 240f)
                lineToRelative(20f, -160f)
                lineToRelative(29f, -240f)
                lineToRelative(10f, -79f)
                lineToRelative(-59f, 479f)
                close()
                moveTo(150f, 880f)
                lineToRelative(10f, -80f)
                horizontalLineToRelative(583f)
                lineToRelative(59f, -479f)
                horizontalLineTo(692f)
                lineToRelative(-15f, 119f)
                horizontalLineToRelative(-80f)
                lineToRelative(14f, -119f)
                horizontalLineTo(452f)
                lineToRelative(-15f, 119f)
                horizontalLineToRelative(-81f)
                lineToRelative(14f, -119f)
                horizontalLineTo(220f)
                lineToRelative(10f, -81f)
                horizontalLineToRelative(150f)
                quadToRelative(8f, -75f, 51.5f, -117.5f)
                reflectiveQuadTo(550f, 80f)
                quadToRelative(64f, 0f, 106.5f, 47.5f)
                reflectiveQuadTo(698f, 240f)
                horizontalLineToRelative(192f)
                lineTo(810f, 880f)
                horizontalLineTo(150f)
                close()
                moveToRelative(310f, -640f)
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

