package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Steps: ImageVector
    get() {
        if (_Steps != null) return _Steps!!
        
        _Steps = ImageVector.Builder(
            name = "steps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 380f)
                quadToRelative(39f, 0f, 74f, 14f)
                reflectiveQuadToRelative(64f, 41f)
                lineToRelative(382f, 365f)
                horizontalLineToRelative(24f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, -8f, -1.5f, -17f)
                reflectiveQuadTo(788f, 725f)
                lineTo(605f, 542f)
                lineToRelative(-71f, -214f)
                lineToRelative(-74f, 18f)
                quadToRelative(-38f, 10f, -69f, -14f)
                reflectiveQuadToRelative(-31f, -63f)
                verticalLineToRelative(-84f)
                lineToRelative(-28f, -14f)
                lineToRelative(-154f, 206f)
                quadToRelative(-1f, 1f, -1f, 1.5f)
                reflectiveQuadToRelative(-1f, 1.5f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineToRelative(-46f)
                quadToRelative(3f, 7f, 7.5f, 13f)
                reflectiveQuadToRelative(10.5f, 11f)
                lineToRelative(324f, 295f)
                quadToRelative(11f, 11f, 25f, 16f)
                reflectiveQuadToRelative(29f, 5f)
                horizontalLineToRelative(54f)
                lineTo(299f, 493f)
                quadToRelative(-17f, -17f, -38.5f, -25f)
                reflectiveQuadToRelative(-44.5f, -8f)
                close()
                moveTo(566f, 880f)
                quadToRelative(-30f, 0f, -57f, -11f)
                reflectiveQuadToRelative(-50f, -31f)
                lineTo(134f, 543f)
                quadToRelative(-46f, -42f, -51.5f, -103f)
                reflectiveQuadTo(114f, 329f)
                lineToRelative(154f, -206f)
                quadToRelative(17f, -23f, 45.5f, -30.5f)
                reflectiveQuadTo(368f, 99f)
                lineToRelative(28f, 14f)
                quadToRelative(21f, 11f, 32.5f, 30f)
                reflectiveQuadToRelative(11.5f, 42f)
                verticalLineToRelative(84f)
                lineToRelative(74f, -19f)
                quadToRelative(30f, -8f, 58f, 7.5f)
                reflectiveQuadToRelative(38f, 44.5f)
                lineToRelative(65f, 196f)
                lineToRelative(170f, 170f)
                quadToRelative(20f, 20f, 27.5f, 43f)
                reflectiveQuadToRelative(7.5f, 49f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(566f)
                close()
            }
        }.build()
        
        return _Steps!!
    }

private var _Steps: ImageVector? = null

