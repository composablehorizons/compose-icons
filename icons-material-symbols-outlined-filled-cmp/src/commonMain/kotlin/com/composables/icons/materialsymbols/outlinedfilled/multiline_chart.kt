package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Multiline_chart: ImageVector
    get() {
        if (_Multiline_chart != null) return _Multiline_chart!!
        
        _Multiline_chart = ImageVector.Builder(
            name = "multiline_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 740f)
                lineToRelative(-56f, -58f)
                lineToRelative(300f, -300f)
                lineToRelative(160f, 160f)
                lineToRelative(116f, -130f)
                quadToRelative(-51f, -60f, -120f, -95f)
                reflectiveQuadToRelative(-152f, -35f)
                quadToRelative(-71f, 0f, -134f, 26.5f)
                reflectiveQuadTo(136f, 380f)
                lineToRelative(-56f, -58f)
                quadToRelative(62f, -56f, 139f, -88f)
                reflectiveQuadToRelative(165f, -32f)
                quadToRelative(98f, 0f, 181f, 39.5f)
                reflectiveQuadTo(710f, 352f)
                lineToRelative(114f, -130f)
                lineToRelative(56f, 58f)
                lineToRelative(-120f, 136f)
                quadToRelative(33f, 53f, 53.5f, 115f)
                reflectiveQuadTo(840f, 662f)
                horizontalLineToRelative(-80f)
                quadToRelative(-6f, -50f, -20.5f, -95.5f)
                reflectiveQuadTo(702f, 480f)
                lineTo(544f, 658f)
                lineTo(380f, 496f)
                lineTo(136f, 740f)
                close()
            }
        }.build()
        
        return _Multiline_chart!!
    }

private var _Multiline_chart: ImageVector? = null

