package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Roundabout_left: ImageVector
    get() {
        if (_Roundabout_left != null) return _Roundabout_left!!
        
        _Roundabout_left = ImageVector.Builder(
            name = "roundabout_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                verticalLineToRelative(-204f)
                quadToRelative(0f, -29f, 19f, -51f)
                reflectiveQuadToRelative(48f, -27f)
                quadToRelative(57f, -9f, 95f, -53.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-60f, 0f, -104.5f, 38f)
                reflectiveQuadTo(482f, 333f)
                quadToRelative(-5f, 29f, -27f, 48f)
                reflectiveQuadToRelative(-51f, 19f)
                horizontalLineTo(233f)
                lineToRelative(36f, 36f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(268f, 492f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(212f, 492f)
                lineTo(108f, 388f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 360f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(268f, 228f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-35f, 36f)
                horizontalLineToRelative(170f)
                quadToRelative(14f, -86f, 80.5f, -143f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 90f, -57f, 156.5f)
                reflectiveQuadTo(680f, 597f)
                verticalLineToRelative(203f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                close()
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

