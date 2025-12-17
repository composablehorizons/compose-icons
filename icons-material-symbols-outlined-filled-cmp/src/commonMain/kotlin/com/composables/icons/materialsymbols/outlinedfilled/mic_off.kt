package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mic_off: ImageVector
    get() {
        if (_Mic_off != null) return _Mic_off!!
        
        _Mic_off = ImageVector.Builder(
            name = "mic_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(710f, 598f)
                lineToRelative(-58f, -58f)
                quadToRelative(14f, -23f, 21f, -48f)
                reflectiveQuadToRelative(7f, -52f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 44f, -13f, 83.5f)
                reflectiveQuadTo(710f, 598f)
                close()
                moveTo(592f, 478f)
                lineTo(360f, 246f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 11f, -2.5f, 20f)
                reflectiveQuadToRelative(-5.5f, 18f)
                close()
                moveTo(440f, 840f)
                verticalLineToRelative(-124f)
                quadToRelative(-104f, -14f, -172f, -92.5f)
                reflectiveQuadTo(200f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(34f, 0f, 64.5f, -10.5f)
                reflectiveQuadTo(600f, 600f)
                lineToRelative(57f, 57f)
                quadToRelative(-29f, 23f, -63.5f, 38.5f)
                reflectiveQuadTo(520f, 716f)
                verticalLineToRelative(124f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(352f, 64f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Mic_off!!
    }

private var _Mic_off: ImageVector? = null

