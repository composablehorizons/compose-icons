package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Recent_patient: ImageVector
    get() {
        if (_Recent_patient != null) return _Recent_patient!!
        
        _Recent_patient = ImageVector.Builder(
            name = "recent_patient",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(11f, 0f, 21.5f, 0.5f)
                reflectiveQuadTo(523f, 522f)
                quadToRelative(16f, 2f, 26.5f, 13.5f)
                reflectiveQuadTo(560f, 563f)
                verticalLineToRelative(197f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(240f, 280f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineToRelative(151f)
                quadToRelative(17f, 0f, 26f, 14f)
                reflectiveQuadToRelative(1f, 29f)
                lineToRelative(-58f, 117f)
                horizontalLineToRelative(28f)
                quadToRelative(17f, 0f, 25.5f, 15f)
                reflectiveQuadToRelative(0.5f, 30f)
                lineTo(739f, 927f)
                quadToRelative(-4f, 7f, -11.5f, 5f)
                reflectiveQuadTo(720f, 922f)
                verticalLineToRelative(-162f)
                close()
            }
        }.build()
        
        return _Recent_patient!!
    }

private var _Recent_patient: ImageVector? = null

