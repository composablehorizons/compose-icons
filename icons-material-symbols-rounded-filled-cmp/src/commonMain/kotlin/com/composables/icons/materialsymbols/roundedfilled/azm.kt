package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Azm: ImageVector
    get() {
        if (_Azm != null) return _Azm!!
        
        _Azm = ImageVector.Builder(
            name = "azm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 360f)
                verticalLineToRelative(272f)
                quadToRelative(0f, 14f, 12f, 19f)
                reflectiveQuadToRelative(22f, -5f)
                lineToRelative(103f, -103f)
                quadToRelative(11f, -11f, 17f, -25.5f)
                reflectiveQuadToRelative(6f, -30.5f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 160f)
                horizontalLineTo(473f)
                quadToRelative(-16f, 0f, -30.5f, 6f)
                reflectiveQuadTo(417f, 183f)
                lineTo(314f, 286f)
                quadToRelative(-10f, 10f, -5f, 22f)
                reflectiveQuadToRelative(19f, 12f)
                horizontalLineToRelative(272f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 360f)
                close()
                moveTo(400f, 600f)
                verticalLineToRelative(272f)
                quadToRelative(0f, 14f, 12f, 19f)
                reflectiveQuadToRelative(22f, -5f)
                lineToRelative(103f, -103f)
                quadToRelative(11f, -11f, 17f, -25.5f)
                reflectiveQuadToRelative(6f, -30.5f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                horizontalLineTo(233f)
                quadToRelative(-16f, 0f, -30.5f, 6f)
                reflectiveQuadTo(177f, 423f)
                lineTo(74f, 526f)
                quadToRelative(-10f, 10f, -5f, 22f)
                reflectiveQuadToRelative(19f, 12f)
                horizontalLineToRelative(272f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 600f)
                close()
            }
        }.build()
        
        return _Azm!!
    }

private var _Azm: ImageVector? = null

