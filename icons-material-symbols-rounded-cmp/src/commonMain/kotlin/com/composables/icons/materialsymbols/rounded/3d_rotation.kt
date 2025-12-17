package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.`3d_rotation`: ImageVector
    get() {
        if (_3d_rotation != null) return _3d_rotation!!
        
        _3d_rotation = ImageVector.Builder(
            name = "3d_rotation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 600f)
                horizontalLineTo(520f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 600f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(300f, 570f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(330f, 540f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(300f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(330f, 360f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 600f)
                close()
                moveToRelative(140f, -60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(280f, -20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -115f, -72.5f, -203f)
                reflectiveQuadTo(542f, 166f)
                lineToRelative(30f, 30f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(387f, 123f)
                quadToRelative(-8f, -8f, -5f, -20f)
                reflectiveQuadToRelative(15f, -15f)
                quadToRelative(20f, -5f, 41f, -6.5f)
                reflectiveQuadToRelative(42f, -1.5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 115f, 72.5f, 203f)
                reflectiveQuadTo(418f, 794f)
                lineToRelative(-30f, -30f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(129f, 129f)
                quadToRelative(8f, 8f, 5f, 20f)
                reflectiveQuadToRelative(-15f, 15f)
                quadToRelative(-20f, 5f, -41f, 6.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _3d_rotation!!
    }

private var _3d_rotation: ImageVector? = null

