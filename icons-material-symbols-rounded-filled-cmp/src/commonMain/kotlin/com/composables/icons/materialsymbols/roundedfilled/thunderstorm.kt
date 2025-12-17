package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thunderstorm: ImageVector
    get() {
        if (_Thunderstorm != null) return _Thunderstorm!!
        
        _Thunderstorm = ImageVector.Builder(
            name = "thunderstorm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 894f)
                lineToRelative(36f, -41f)
                lineToRelative(-34f, -17f)
                quadToRelative(-17f, -9f, -21f, -28f)
                reflectiveQuadToRelative(9f, -34f)
                lineToRelative(70f, -80f)
                quadToRelative(5f, -7f, 13.5f, -10.5f)
                reflectiveQuadTo(610f, 680f)
                quadToRelative(26f, 0f, 36.5f, 23f)
                reflectiveQuadToRelative(-6.5f, 43f)
                lineToRelative(-36f, 41f)
                lineToRelative(34f, 17f)
                quadToRelative(17f, 9f, 21f, 28f)
                reflectiveQuadToRelative(-9f, 34f)
                lineToRelative(-70f, 80f)
                quadToRelative(-5f, 7f, -13.5f, 10.5f)
                reflectiveQuadTo(550f, 960f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                close()
                moveToRelative(-240f, 0f)
                lineToRelative(36f, -41f)
                lineToRelative(-34f, -17f)
                quadToRelative(-17f, -9f, -21f, -28f)
                reflectiveQuadToRelative(9f, -34f)
                lineToRelative(70f, -80f)
                quadToRelative(5f, -7f, 13.5f, -10.5f)
                reflectiveQuadTo(370f, 680f)
                quadToRelative(26f, 0f, 36.5f, 23f)
                reflectiveQuadToRelative(-6.5f, 43f)
                lineToRelative(-36f, 41f)
                lineToRelative(34f, 17f)
                quadToRelative(17f, 9f, 21f, 28f)
                reflectiveQuadToRelative(-9f, 34f)
                lineToRelative(-70f, 80f)
                quadToRelative(-5f, 7f, -13.5f, 10.5f)
                reflectiveQuadTo(310f, 960f)
                quadToRelative(-26f, 0f, -36.5f, -23f)
                reflectiveQuadToRelative(6.5f, -43f)
                close()
                moveToRelative(20f, -254f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -83f, 55f, -145f)
                reflectiveQuadToRelative(136f, -73f)
                quadToRelative(32f, -57f, 87.5f, -89.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(90f, 0f, 156.5f, 57.5f)
                reflectiveQuadTo(717f, 281f)
                quadToRelative(69f, 6f, 116f, 57f)
                reflectiveQuadToRelative(47f, 122f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineTo(300f)
                close()
            }
        }.build()
        
        return _Thunderstorm!!
    }

private var _Thunderstorm: ImageVector? = null

