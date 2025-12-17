package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fast_forward: ImageVector
    get() {
        if (_Fast_forward != null) return _Fast_forward!!
        
        _Fast_forward = ImageVector.Builder(
            name = "fast_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(100f, 645f)
                verticalLineToRelative(-330f)
                quadToRelative(0f, -18f, 12f, -29f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(5f, 0f, 11f, 1f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(248f, 166f)
                quadToRelative(9f, 6f, 13.5f, 14.5f)
                reflectiveQuadTo(428f, 480f)
                quadToRelative(0f, 10f, -4.5f, 18.5f)
                reflectiveQuadTo(410f, 513f)
                lineTo(162f, 679f)
                quadToRelative(-5f, 4f, -11f, 5f)
                reflectiveQuadToRelative(-11f, 1f)
                quadToRelative(-16f, 0f, -28f, -11f)
                reflectiveQuadToRelative(-12f, -29f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-330f)
                quadToRelative(0f, -18f, 12f, -29f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(5f, 0f, 11f, 1f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(248f, 166f)
                quadToRelative(9f, 6f, 13.5f, 14.5f)
                reflectiveQuadTo(828f, 480f)
                quadToRelative(0f, 10f, -4.5f, 18.5f)
                reflectiveQuadTo(810f, 513f)
                lineTo(562f, 679f)
                quadToRelative(-5f, 4f, -11f, 5f)
                reflectiveQuadToRelative(-11f, 1f)
                quadToRelative(-16f, 0f, -28f, -11f)
                reflectiveQuadToRelative(-12f, -29f)
                close()
                moveTo(180f, 480f)
                close()
                moveToRelative(400f, 0f)
                close()
                moveToRelative(-400f, 90f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(400f, 0f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Fast_forward!!
    }

private var _Fast_forward: ImageVector? = null

