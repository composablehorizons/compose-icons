package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_90: ImageVector
    get() {
        if (_Battery_90 != null) return _Battery_90!!
        
        _Battery_90 = ImageVector.Builder(
            name = "battery_90",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 22f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadTo(7f, 21.425f, 7f, 21f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.425f, 0.287f, -0.713f)
                quadTo(7.575f, 4f, 8f, 4f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(10.575f, 2f, 11f, 2f)
                horizontalLineToRelative(2f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(14f, 2.575f, 14f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                quadToRelative(0.425f, 0f, 0.712f, 0.287f)
                quadTo(17f, 4.575f, 17f, 5f)
                verticalLineToRelative(16f)
                quadToRelative(0f, 0.425f, -0.288f, 0.712f)
                quadTo(16.425f, 22f, 16f, 22f)
                close()
            }
        }.build()
        
        return _Battery_90!!
    }

private var _Battery_90: ImageVector? = null

