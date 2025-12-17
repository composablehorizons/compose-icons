package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_wifi_mistral: ImageVector
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
                quadToRelative(-1.95f, 0f, -3.487f, -1.113f)
                quadTo(3.975f, 18.775f, 3.35f, 17f)
                horizontalLineToRelative(17.3f)
                quadToRelative(-0.625f, 1.75f, -2.162f, 2.875f)
                quadTo(16.95f, 21f, 15f, 21f)
                close()
                moveToRelative(-6f, -6f)
                verticalLineTo(9f)
                quadToRelative(0f, -2.5f, 1.75f, -4.25f)
                reflectiveQuadTo(9f, 3f)
                horizontalLineToRelative(6f)
                quadToRelative(2.5f, 0f, 4.25f, 1.75f)
                reflectiveQuadTo(21f, 9f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Nest_wifi_mistral!!
    }

private var _Nest_wifi_mistral: ImageVector? = null

