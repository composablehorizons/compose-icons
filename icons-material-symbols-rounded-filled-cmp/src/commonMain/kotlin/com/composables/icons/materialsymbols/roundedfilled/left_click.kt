package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Left_click: ImageVector
    get() {
        if (_Left_click != null) return _Left_click!!
        
        _Left_click = ImageVector.Builder(
            name = "left_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(782f, 860f)
                lineTo(650f, 729f)
                lineToRelative(-30f, 91f)
                quadToRelative(-5f, 14f, -19f, 13.5f)
                reflectiveQuadTo(582f, 819f)
                lineToRelative(-91f, -303f)
                quadToRelative(-4f, -11f, 5f, -20f)
                reflectiveQuadToRelative(20f, -5f)
                lineToRelative(303f, 91f)
                quadToRelative(14f, 5f, 14.5f, 19f)
                reflectiveQuadTo(820f, 620f)
                lineToRelative(-91f, 30f)
                lineToRelative(132f, 132f)
                quadToRelative(17f, 17f, 17f, 39f)
                reflectiveQuadToRelative(-17f, 39f)
                quadToRelative(-17f, 17f, -39.5f, 17f)
                reflectiveQuadTo(782f, 860f)
                close()
                moveTo(240f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(77f, 0f, 137.5f, 42.5f)
                reflectiveQuadTo(704f, 393f)
                quadToRelative(6f, 16f, -0.5f, 31f)
                reflectiveQuadTo(681f, 445f)
                quadToRelative(-16f, 6f, -30.5f, -0.5f)
                reflectiveQuadTo(630f, 422f)
                quadToRelative(-17f, -45f, -58f, -73.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 51f, 28.5f, 92f)
                reflectiveQuadToRelative(73.5f, 58f)
                quadToRelative(16f, 6f, 22.5f, 21f)
                reflectiveQuadToRelative(0.5f, 31f)
                quadToRelative(-6f, 16f, -21f, 22f)
                reflectiveQuadToRelative(-31f, 0f)
                quadToRelative(-69f, -26f, -111f, -87.5f)
                reflectiveQuadTo(240f, 480f)
                close()
            }
        }.build()
        
        return _Left_click!!
    }

private var _Left_click: ImageVector? = null

