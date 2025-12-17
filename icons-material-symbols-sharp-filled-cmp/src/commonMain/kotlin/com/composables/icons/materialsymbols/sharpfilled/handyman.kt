package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Handyman: ImageVector
    get() {
        if (_Handyman != null) return _Handyman!!
        
        _Handyman = ImageVector.Builder(
            name = "handyman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(754f, 879f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadTo(726f, 868f)
                lineTo(522f, 664f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(85f, -85f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(204f, 204f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineToRelative(-85f, 85f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(754f, 879f)
                close()
                moveToRelative(-549f, 1f)
                quadToRelative(-8f, 0f, -15.5f, -3f)
                reflectiveQuadTo(176f, 868f)
                lineToRelative(-84f, -84f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadTo(80f, 755f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(212f, -212f)
                horizontalLineToRelative(85f)
                lineToRelative(34f, -34f)
                lineToRelative(-165f, -165f)
                horizontalLineToRelative(-57f)
                lineTo(80f, 195f)
                lineToRelative(113f, -113f)
                lineToRelative(121f, 121f)
                verticalLineToRelative(57f)
                lineToRelative(165f, 165f)
                lineToRelative(116f, -116f)
                lineToRelative(-43f, -43f)
                lineToRelative(56f, -56f)
                horizontalLineTo(495f)
                lineToRelative(-28f, -28f)
                lineToRelative(142f, -142f)
                lineToRelative(28f, 28f)
                verticalLineToRelative(113f)
                lineToRelative(56f, -56f)
                lineToRelative(142f, 142f)
                quadToRelative(17f, 17f, 26f, 38.5f)
                reflectiveQuadToRelative(9f, 45.5f)
                quadToRelative(0f, 24f, -9f, 46f)
                reflectiveQuadToRelative(-26f, 39f)
                lineToRelative(-85f, -85f)
                lineToRelative(-56f, 56f)
                lineToRelative(-42f, -42f)
                lineToRelative(-207f, 207f)
                verticalLineToRelative(84f)
                lineTo(233f, 868f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                close()
            }
        }.build()
        
        return _Handyman!!
    }

private var _Handyman: ImageVector? = null

