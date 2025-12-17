package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fitness_tracker: ImageVector
    get() {
        if (_Fitness_tracker != null) return _Fitness_tracker!!
        
        _Fitness_tracker = ImageVector.Builder(
            name = "fitness_tracker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 880f)
                quadToRelative(-14f, 0f, -24.5f, -7.5f)
                reflectiveQuadTo(351f, 852f)
                lineToRelative(-39f, -131f)
                quadToRelative(-15f, -16f, -23.5f, -37f)
                reflectiveQuadToRelative(-8.5f, -44f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -24f, 8.5f, -45f)
                reflectiveQuadToRelative(23.5f, -37f)
                lineToRelative(39f, -130f)
                quadToRelative(4f, -13f, 14.5f, -20.5f)
                reflectiveQuadTo(390f, 80f)
                horizontalLineToRelative(180f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 21f)
                lineToRelative(38f, 128f)
                quadToRelative(16f, 17f, 25f, 38f)
                reflectiveQuadToRelative(9f, 45f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 24f, -8.5f, 45f)
                reflectiveQuadTo(647f, 723f)
                lineToRelative(-38f, 128f)
                quadToRelative(-4f, 13f, -14.5f, 21f)
                reflectiveQuadTo(570f, 880f)
                horizontalLineTo(390f)
                close()
                moveToRelative(29f, -80f)
                horizontalLineToRelative(121f)
                lineToRelative(12f, -40f)
                horizontalLineTo(407f)
                lineToRelative(12f, 40f)
                close()
                moveToRelative(-19f, -120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(7f, -480f)
                horizontalLineToRelative(145f)
                lineToRelative(-12f, -40f)
                horizontalLineTo(419f)
                lineToRelative(-12f, 40f)
                close()
                moveToRelative(72f, 560f)
                close()
                moveToRelative(0f, -560f)
                close()
            }
        }.build()
        
        return _Fitness_tracker!!
    }

private var _Fitness_tracker: ImageVector? = null

