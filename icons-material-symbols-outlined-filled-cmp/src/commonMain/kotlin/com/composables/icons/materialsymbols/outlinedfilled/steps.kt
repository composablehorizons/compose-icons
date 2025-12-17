package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Steps: ImageVector
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
                horizontalLineTo(88f)
                quadToRelative(4f, -14f, 10.5f, -26.5f)
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
                quadToRelative(0f, 37f, -20f, 66f)
                reflectiveQuadToRelative(-52f, 43f)
                lineTo(354f, 435f)
                quadToRelative(-29f, -27f, -64f, -41f)
                reflectiveQuadToRelative(-74f, -14f)
                close()
                moveTo(566f, 880f)
                quadToRelative(-30f, 0f, -57f, -11f)
                reflectiveQuadToRelative(-50f, -31f)
                lineTo(134f, 543f)
                quadToRelative(-19f, -17f, -31f, -38.5f)
                reflectiveQuadTo(86f, 460f)
                horizontalLineToRelative(130f)
                quadToRelative(23f, 0f, 44.5f, 8f)
                reflectiveQuadToRelative(38.5f, 25f)
                lineTo(703f, 880f)
                horizontalLineTo(566f)
                close()
            }
        }.build()
        
        return _Steps!!
    }

private var _Steps: ImageVector? = null

