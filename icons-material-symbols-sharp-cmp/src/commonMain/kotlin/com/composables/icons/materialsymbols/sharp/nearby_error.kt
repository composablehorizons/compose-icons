package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nearby_error: ImageVector
    get() {
        if (_Nearby_error != null) return _Nearby_error!!
        
        _Nearby_error = ImageVector.Builder(
            name = "nearby_error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 720f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                close()
                moveTo(480f, 912f)
                lineTo(48f, 480f)
                lineToRelative(432f, -432f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(144f)
                lineTo(480f, 192f)
                lineTo(192f, 480f)
                lineToRelative(288f, 288f)
                lineToRelative(240f, -240f)
                verticalLineToRelative(144f)
                lineTo(480f, 912f)
                close()
                moveToRelative(0f, -256f)
                lineTo(304f, 480f)
                lineToRelative(176f, -176f)
                lineToRelative(176f, 176f)
                lineToRelative(-176f, 176f)
                close()
            }
        }.build()
        
        return _Nearby_error!!
    }

private var _Nearby_error: ImageVector? = null

