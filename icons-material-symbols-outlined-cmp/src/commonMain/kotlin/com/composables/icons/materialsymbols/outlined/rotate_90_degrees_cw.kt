package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Rotate_90_degrees_cw: ImageVector
    get() {
        if (_Rotate_90_degrees_cw != null) return _Rotate_90_degrees_cw!!
        
        _Rotate_90_degrees_cw = ImageVector.Builder(
            name = "rotate_90_degrees_cw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                horizontalLineToRelative(6f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -58f)
                lineToRelative(62f, -62f)
                horizontalLineToRelative(-6f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(440f, 800f)
                quadToRelative(35f, 0f, 69f, -8.5f)
                reflectiveQuadToRelative(65f, -25.5f)
                lineToRelative(58f, 58f)
                quadToRelative(-43f, 28f, -92f, 42f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(240f, -120f)
                lineTo(440f, 520f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
                moveToRelative(0f, -114f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                lineToRelative(-126f, 126f)
                lineToRelative(126f, 126f)
                close()
                moveToRelative(0f, -126f)
                close()
            }
        }.build()
        
        return _Rotate_90_degrees_cw!!
    }

private var _Rotate_90_degrees_cw: ImageVector? = null

