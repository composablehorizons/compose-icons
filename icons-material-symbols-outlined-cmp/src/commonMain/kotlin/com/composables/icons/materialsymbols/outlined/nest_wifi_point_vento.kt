package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_wifi_point_vento: ImageVector
    get() {
        if (_Nest_wifi_point_vento != null) return _Nest_wifi_point_vento!!
        
        _Nest_wifi_point_vento = ImageVector.Builder(
            name = "nest_wifi_point_vento",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 21f)
                quadToRelative(-2.5f, 0f, -4.25f, -1.75f)
                reflectiveQuadTo(3f, 15f)
                verticalLineTo(9f)
                quadToRelative(0f, -2.5f, 1.75f, -4.25f)
                reflectiveQuadTo(9f, 3f)
                horizontalLineToRelative(6f)
                quadToRelative(2.5f, 0f, 4.25f, 1.75f)
                reflectiveQuadTo(21f, 9f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 2.5f, -1.75f, 4.25f)
                reflectiveQuadTo(15f, 21f)
                close()
                moveToRelative(-4f, -6f)
                horizontalLineToRelative(14f)
                verticalLineTo(9f)
                quadToRelative(0f, -1.65f, -1.175f, -2.825f)
                quadTo(16.65f, 5f, 15f, 5f)
                horizontalLineTo(9f)
                quadTo(7.35f, 5f, 6.175f, 6.175f)
                quadTo(5f, 7.35f, 5f, 9f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4f, 4f)
                quadToRelative(0f, -0.425f, 0.288f, -0.712f)
                quadTo(9.575f, 18f, 10f, 18f)
                reflectiveQuadToRelative(0.713f, 0.288f)
                quadTo(11f, 18.575f, 11f, 19f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, -0.425f, 0.288f, -0.712f)
                quadTo(13.575f, 18f, 14f, 18f)
                reflectiveQuadToRelative(0.713f, 0.288f)
                quadTo(15f, 18.575f, 15f, 19f)
                quadToRelative(1.125f, 0f, 2.025f, -0.55f)
                quadToRelative(0.9f, -0.55f, 1.425f, -1.45f)
                horizontalLineTo(17f)
                quadToRelative(0f, 0.425f, -0.288f, 0.712f)
                quadTo(16.425f, 18f, 16f, 18f)
                reflectiveQuadToRelative(-0.712f, -0.288f)
                quadTo(15f, 17.425f, 15f, 17f)
                horizontalLineToRelative(-2f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(12.425f, 18f, 12f, 18f)
                reflectiveQuadToRelative(-0.712f, -0.288f)
                quadTo(11f, 17.425f, 11f, 17f)
                horizontalLineTo(9f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(8.425f, 18f, 8f, 18f)
                reflectiveQuadToRelative(-0.713f, -0.288f)
                quadTo(7f, 17.425f, 7f, 17f)
                horizontalLineTo(5.55f)
                quadToRelative(0.525f, 0.9f, 1.425f, 1.45f)
                quadToRelative(0.9f, 0.55f, 2.025f, 0.55f)
                close()
                moveToRelative(3f, -4f)
                close()
            }
        }.build()
        
        return _Nest_wifi_point_vento!!
    }

private var _Nest_wifi_point_vento: ImageVector? = null

