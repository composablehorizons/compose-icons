package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airwave: ImageVector
    get() {
        if (_Airwave != null) return _Airwave!!
        
        _Airwave = ImageVector.Builder(
            name = "airwave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(750f, 346f)
                quadToRelative(-27f, 27f, -62f, 41f)
                reflectiveQuadToRelative(-70f, 14f)
                quadToRelative(-35f, 0f, -69f, -13.5f)
                reflectiveQuadTo(488f, 346f)
                lineToRelative(-75f, -75f)
                quadToRelative(-15f, -15f, -34f, -22.5f)
                reflectiveQuadToRelative(-39f, -7.5f)
                quadToRelative(-20f, 0f, -39f, 7.5f)
                reflectiveQuadTo(267f, 271f)
                lineToRelative(-75f, 75f)
                lineToRelative(-57f, -57f)
                lineToRelative(75f, -75f)
                quadToRelative(27f, -27f, 61f, -40.5f)
                reflectiveQuadToRelative(69f, -13.5f)
                quadToRelative(35f, 0f, 68.5f, 13.5f)
                reflectiveQuadTo(469f, 214f)
                lineToRelative(75f, 75f)
                quadToRelative(16f, 16f, 35f, 23.5f)
                reflectiveQuadToRelative(39f, 7.5f)
                quadToRelative(20f, 0f, 39.5f, -7.5f)
                reflectiveQuadTo(693f, 289f)
                lineToRelative(75f, -75f)
                lineToRelative(57f, 57f)
                lineToRelative(-75f, 75f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-27f, 27f, -61.5f, 40.5f)
                reflectiveQuadTo(619f, 600f)
                quadToRelative(-35f, 0f, -69.5f, -13.5f)
                reflectiveQuadTo(488f, 546f)
                lineToRelative(-75f, -75f)
                quadToRelative(-15f, -15f, -34f, -22.5f)
                reflectiveQuadToRelative(-39f, -7.5f)
                quadToRelative(-20f, 0f, -39f, 7.5f)
                reflectiveQuadTo(267f, 471f)
                lineToRelative(-75f, 75f)
                lineToRelative(-57f, -56f)
                lineToRelative(75f, -76f)
                quadToRelative(27f, -27f, 61f, -40.5f)
                reflectiveQuadToRelative(69f, -13.5f)
                quadToRelative(35f, 0f, 68.5f, 13.5f)
                reflectiveQuadTo(469f, 414f)
                lineToRelative(75f, 75f)
                quadToRelative(16f, 16f, 35f, 23.5f)
                reflectiveQuadToRelative(39f, 7.5f)
                quadToRelative(20f, 0f, 39.5f, -7.5f)
                reflectiveQuadTo(693f, 489f)
                lineToRelative(75f, -75f)
                lineToRelative(57f, 57f)
                lineToRelative(-75f, 75f)
                close()
                moveToRelative(-1f, 200f)
                quadToRelative(-27f, 27f, -61f, 40.5f)
                reflectiveQuadTo(619f, 800f)
                quadToRelative(-35f, 0f, -69.5f, -13.5f)
                reflectiveQuadTo(488f, 746f)
                lineToRelative(-76f, -75f)
                quadToRelative(-15f, -15f, -34f, -22.5f)
                reflectiveQuadToRelative(-39f, -7.5f)
                quadToRelative(-20f, 0f, -39f, 7.5f)
                reflectiveQuadTo(266f, 671f)
                lineToRelative(-75f, 75f)
                lineToRelative(-56f, -56f)
                lineToRelative(75f, -76f)
                quadToRelative(27f, -27f, 61f, -40.5f)
                reflectiveQuadToRelative(69f, -13.5f)
                quadToRelative(35f, 0f, 68.5f, 13.5f)
                reflectiveQuadTo(469f, 614f)
                lineToRelative(75f, 75f)
                quadToRelative(16f, 16f, 35.5f, 23.5f)
                reflectiveQuadTo(619f, 720f)
                quadToRelative(20f, 0f, 39f, -7.5f)
                reflectiveQuadToRelative(35f, -23.5f)
                lineToRelative(75f, -75f)
                lineToRelative(56f, 57f)
                lineToRelative(-75f, 75f)
                close()
            }
        }.build()
        
        return _Airwave!!
    }

private var _Airwave: ImageVector? = null

