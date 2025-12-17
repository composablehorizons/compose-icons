package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Activity_zone: ImageVector
    get() {
        if (_Activity_zone != null) return _Activity_zone!!
        
        _Activity_zone = ImageVector.Builder(
            name = "activity_zone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69.5f)
                reflectiveQuadTo(160f, 647f)
                verticalLineToRelative(-334f)
                quadToRelative(-35f, -13f, -57.5f, -43.5f)
                reflectiveQuadTo(80f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(313f, 160f)
                horizontalLineToRelative(334f)
                quadToRelative(12f, -35f, 42.5f, -57.5f)
                reflectiveQuadTo(760f, 80f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 40f, -22.5f, 70.5f)
                reflectiveQuadTo(800f, 313f)
                verticalLineToRelative(334f)
                quadToRelative(35f, 13f, 57.5f, 43.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-39f, 0f, -69.5f, -22.5f)
                reflectiveQuadTo(647f, 800f)
                horizontalLineTo(313f)
                quadToRelative(-13f, 35f, -43.5f, 57.5f)
                reflectiveQuadTo(200f, 880f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 240f)
                close()
                moveToRelative(560f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 240f)
                close()
                moveTo(313f, 720f)
                horizontalLineToRelative(334f)
                quadToRelative(9f, -26f, 28f, -45f)
                reflectiveQuadToRelative(45f, -28f)
                verticalLineToRelative(-334f)
                quadToRelative(-26f, -9f, -45f, -28f)
                reflectiveQuadToRelative(-28f, -45f)
                horizontalLineTo(313f)
                quadToRelative(-9f, 26f, -28f, 45f)
                reflectiveQuadToRelative(-45f, 28f)
                verticalLineToRelative(334f)
                quadToRelative(26f, 9f, 45f, 28f)
                reflectiveQuadToRelative(28f, 45f)
                close()
                moveToRelative(447f, 80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveToRelative(-560f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 760f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 800f)
                close()
                moveToRelative(0f, -600f)
                close()
                moveToRelative(560f, 0f)
                close()
                moveToRelative(0f, 560f)
                close()
                moveToRelative(-560f, 0f)
                close()
            }
        }.build()
        
        return _Activity_zone!!
    }

private var _Activity_zone: ImageVector? = null

