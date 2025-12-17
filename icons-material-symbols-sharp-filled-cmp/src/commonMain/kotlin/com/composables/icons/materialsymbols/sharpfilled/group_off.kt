package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Group_off: ImageVector
    get() {
        if (_Group_off != null) return _Group_off!!
        
        _Group_off = ImageVector.Builder(
            name = "group_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(680f, 793f)
                verticalLineToRelative(7f)
                horizontalLineTo(40f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(12f, 0f, 24.5f, 0.5f)
                reflectiveQuadTo(409f, 522f)
                lineToRelative(-42f, -42f)
                horizontalLineToRelative(-7f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-7f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(666f, 526f)
                quadToRelative(51f, 6f, 96f, 20.5f)
                reflectiveQuadToRelative(84f, 35.5f)
                quadToRelative(36f, 20f, 55f, 44.5f)
                reflectiveQuadToRelative(19f, 53.5f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-5f)
                lineTo(755f, 640f)
                quadToRelative(-9f, -33f, -31.5f, -62.5f)
                reflectiveQuadTo(666f, 526f)
                close()
                moveToRelative(-104f, -79f)
                quadToRelative(19f, -28f, 28.5f, -60f)
                reflectiveQuadToRelative(9.5f, -67f)
                quadToRelative(0f, -42f, -14.5f, -81f)
                reflectiveQuadTo(544f, 168f)
                quadToRelative(14f, -5f, 28f, -6.5f)
                reflectiveQuadToRelative(28f, -1.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -49.5f, 113f)
                reflectiveQuadTo(595f, 480f)
                lineToRelative(-33f, -33f)
                close()
                moveToRelative(-58f, -58f)
                lineTo(291f, 176f)
                quadToRelative(16f, -8f, 33f, -12f)
                reflectiveQuadToRelative(36f, -4f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 19f, -4f, 36f)
                reflectiveQuadToRelative(-12f, 33f)
                close()
            }
        }.build()
        
        return _Group_off!!
    }

private var _Group_off: ImageVector? = null

