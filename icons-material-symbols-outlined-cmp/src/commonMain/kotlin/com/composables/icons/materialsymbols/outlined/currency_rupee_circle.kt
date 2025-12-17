package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Currency_rupee_circle: ImageVector
    get() {
        if (_Currency_rupee_circle != null) return _Currency_rupee_circle!!
        
        _Currency_rupee_circle = ImageVector.Builder(
            name = "currency_rupee_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(531f, 700f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-3f)
                lineTo(462f, 522f)
                lineToRelative(1f, -3f)
                horizontalLineToRelative(10f)
                quadToRelative(54f, 0f, 89.5f, -33f)
                reflectiveQuadToRelative(43.5f, -77f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(-41f)
                quadToRelative(-3f, -15f, -10.5f, -28.5f)
                reflectiveQuadTo(576f, 307f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-47f)
                horizontalLineTo(314f)
                verticalLineToRelative(57f)
                horizontalLineToRelative(156f)
                quadToRelative(26f, 0f, 42.5f, 13f)
                reflectiveQuadToRelative(22.5f, 32f)
                horizontalLineTo(314f)
                verticalLineToRelative(47f)
                horizontalLineToRelative(222f)
                quadToRelative(-6f, 20f, -23f, 34.5f)
                reflectiveQuadTo(467f, 458f)
                horizontalLineTo(367f)
                verticalLineToRelative(64f)
                lineToRelative(164f, 178f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Currency_rupee_circle!!
    }

private var _Currency_rupee_circle: ImageVector? = null

