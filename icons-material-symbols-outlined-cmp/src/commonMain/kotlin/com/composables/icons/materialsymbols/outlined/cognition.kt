package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cognition: ImageVector
    get() {
        if (_Cognition != null) return _Cognition!!
        
        _Cognition = ImageVector.Builder(
            name = "cognition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(491f, 621f)
                quadToRelative(70f, 0f, 119f, -45f)
                reflectiveQuadToRelative(49f, -109f)
                quadToRelative(0f, -57f, -36.5f, -96.5f)
                reflectiveQuadTo(534f, 331f)
                quadToRelative(-47f, 0f, -79.5f, 30f)
                reflectiveQuadTo(422f, 435f)
                quadToRelative(0f, 19f, 7.5f, 37f)
                reflectiveQuadToRelative(21.5f, 33f)
                lineToRelative(57f, -57f)
                quadToRelative(-3f, -2f, -4.5f, -5f)
                reflectiveQuadToRelative(-1.5f, -7f)
                quadToRelative(0f, -11f, 9f, -17.5f)
                reflectiveQuadToRelative(23f, -6.5f)
                quadToRelative(20f, 0f, 33f, 16.5f)
                reflectiveQuadToRelative(13f, 39.5f)
                quadToRelative(0f, 31f, -25.5f, 52.5f)
                reflectiveQuadTo(492f, 542f)
                quadToRelative(-47f, 0f, -79.5f, -38f)
                reflectiveQuadTo(380f, 411f)
                quadToRelative(0f, -29f, 11f, -55.5f)
                reflectiveQuadToRelative(31f, -46.5f)
                lineToRelative(-57f, -57f)
                quadToRelative(-32f, 31f, -49f, 72f)
                reflectiveQuadToRelative(-17f, 86f)
                quadToRelative(0f, 88f, 56f, 149.5f)
                reflectiveQuadTo(491f, 621f)
                close()
                moveTo(240f, 880f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(108f)
                lineToRelative(-38f, -155f)
                quadToRelative(-23f, -91f, -98f, -148f)
                reflectiveQuadToRelative(-172f, -57f)
                quadToRelative(-116f, 0f, -198f, 81f)
                reflectiveQuadToRelative(-82f, 197f)
                quadToRelative(0f, 60f, 24.5f, 114f)
                reflectiveQuadToRelative(69.5f, 96f)
                lineToRelative(26f, 24f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(254f, -360f)
                close()
            }
        }.build()
        
        return _Cognition!!
    }

private var _Cognition: ImageVector? = null

