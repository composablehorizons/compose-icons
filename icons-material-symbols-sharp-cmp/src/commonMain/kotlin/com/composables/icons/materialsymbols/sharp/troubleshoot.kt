package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Troubleshoot: ImageVector
    get() {
        if (_Troubleshoot != null) return _Troubleshoot!!
        
        _Troubleshoot = ImageVector.Builder(
            name = "troubleshoot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(824f, 840f)
                lineTo(636f, 652f)
                quadToRelative(-41f, 32f, -90.5f, 50f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(-90f, 0f, -162.5f, -44f)
                reflectiveQuadTo(163f, 560f)
                horizontalLineToRelative(98f)
                quadToRelative(34f, 37f, 79.5f, 58.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-94f, 0f, -162.5f, 63.5f)
                reflectiveQuadTo(201f, 380f)
                horizontalLineToRelative(-80f)
                quadToRelative(8f, -127f, 99.5f, -213.5f)
                reflectiveQuadTo(440f, 80f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 56f, -18f, 105.5f)
                reflectiveQuadTo(692f, 596f)
                lineToRelative(188f, 188f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(397f, 560f)
                lineToRelative(-63f, -208f)
                lineToRelative(-52f, 148f)
                horizontalLineTo(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                lineToRelative(66f, -190f)
                horizontalLineToRelative(60f)
                lineToRelative(61f, 204f)
                lineToRelative(43f, -134f)
                horizontalLineToRelative(60f)
                lineToRelative(60f, 120f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-67f)
                lineToRelative(-47f, -94f)
                lineToRelative(-50f, 154f)
                horizontalLineToRelative(-59f)
                close()
            }
        }.build()
        
        return _Troubleshoot!!
    }

private var _Troubleshoot: ImageVector? = null

