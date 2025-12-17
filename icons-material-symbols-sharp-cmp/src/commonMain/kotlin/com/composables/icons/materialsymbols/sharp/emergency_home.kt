package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Emergency_home: ImageVector
    get() {
        if (_Emergency_home != null) return _Emergency_home!!
        
        _Emergency_home = ImageVector.Builder(
            name = "emergency_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 535f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-270f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(270f)
                close()
                moveToRelative(40f, 105f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, 272f)
                lineTo(48f, 480f)
                lineToRelative(432f, -432f)
                lineToRelative(432f, 432f)
                lineTo(480f, 912f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(320f, -320f)
                lineToRelative(-320f, -320f)
                lineToRelative(-320f, 320f)
                lineToRelative(320f, 320f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Emergency_home!!
    }

private var _Emergency_home: ImageVector? = null

