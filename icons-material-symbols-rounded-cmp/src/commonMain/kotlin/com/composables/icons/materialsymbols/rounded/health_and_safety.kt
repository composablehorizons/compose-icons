package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Health_and_safety: ImageVector
    get() {
        if (_Health_and_safety != null) return _Health_and_safety!!
        
        _Health_and_safety = ImageVector.Builder(
            name = "health_and_safety",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 520f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 620f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(540f, 580f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 400f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(500f, 300f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 340f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 520f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(60f, 356f)
                quadToRelative(-7f, 0f, -13f, -1f)
                reflectiveQuadToRelative(-12f, -3f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 140f, -80f, 261.5f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
                moveToRelative(0f, -316f)
                close()
            }
        }.build()
        
        return _Health_and_safety!!
    }

private var _Health_and_safety: ImageVector? = null

