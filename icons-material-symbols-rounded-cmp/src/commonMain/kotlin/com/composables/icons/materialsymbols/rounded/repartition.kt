package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Repartition: ImageVector
    get() {
        if (_Repartition != null) return _Repartition!!
        
        _Repartition = ImageVector.Builder(
            name = "repartition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 320f)
                lineToRelative(35f, 35f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(268f, 412f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(211f, 412f)
                lineTo(108f, 308f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(268f, 205f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(447f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineTo(233f)
                close()
                moveTo(120f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-80f)
                horizontalLineTo(413f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-80f)
                horizontalLineTo(627f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Repartition!!
    }

private var _Repartition: ImageVector? = null

