package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_wifi_mistral: ImageVector
    get() {
        if (_Nest_wifi_mistral != null) return _Nest_wifi_mistral!!
        
        _Nest_wifi_mistral = ImageVector.Builder(
            name = "nest_wifi_mistral",
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
                close()
                moveToRelative(0.55f, 2f)
                quadToRelative(0.525f, 0.9f, 1.425f, 1.45f)
                quadToRelative(0.9f, 0.55f, 2.025f, 0.55f)
                horizontalLineToRelative(6f)
                quadToRelative(1.125f, 0f, 2.025f, -0.55f)
                quadToRelative(0.9f, -0.55f, 1.425f, -1.45f)
                close()
                moveTo(12f, 15f)
                close()
            }
        }.build()
        
        return _Nest_wifi_mistral!!
    }

private var _Nest_wifi_mistral: ImageVector? = null

